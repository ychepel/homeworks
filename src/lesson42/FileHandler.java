package lesson42;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileHandler {
    private String path;
    private File file;

    public FileHandler(String path) {
        this.path = path;
        this.file = new File(path);
        createIfNotExists();
    }

    public String read() {
        try {
            Scanner scanner = new Scanner(this.file);
            String result = "";
            while (scanner.hasNextLine()) {
                result += scanner.nextLine() + "\n";
            }
            scanner.close();
            return result;
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
        return "";
    }

    private void createIfNotExists() {
        try {
            if (this.file.createNewFile()) {
                System.out.printf("File `%s` is created%n", this.path);
            } else {
                System.out.printf("File `%s` is exists%n", this.path);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getLength() {
        long byteLength = this.file.length();
        TreeMap<Double, String> sizes = new TreeMap<>(Map.of(
                Math.pow(1024, 0), "b",
                Math.pow(1024, 1), "kb",
                Math.pow(1024, 2), "mb",
                Math.pow(1024, 3), "gb",
                Math.pow(1024, 4), "tb"
        ));
        for (Map.Entry<Double, String> entry : sizes.descendingMap().entrySet()) {
            double currentSizeAmount = byteLength / entry.getKey();
            if (currentSizeAmount >= 1) {
                return String.format("%.2f %s", currentSizeAmount, entry.getValue());
            }
        }
        return "file is empty";
    }

    public void rename(String newPath) {
        File newFile = new File(newPath);
        if (this.file.renameTo(newFile)) {
            this.file = newFile;
            this.path = newPath;
        }
    }

    public static void createFiles(ArrayList<String> paths) {
        for (String path : paths) {
            File file = new File(path);
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.printf("`%s` cannot be created: %s", paths, e.getMessage());
            }
        }
    }

    public int search(String str) {
        try {
            Scanner scanner = new Scanner(this.file);
            int lineNumber = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                ++lineNumber;
                if (line.contains(str)) {
                    return lineNumber;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        return -1;
    }

    public void append(String str) {
        try {
            FileWriter fileWriter = new FileWriter(this.path, true);
            fileWriter.append("\n").append(str);
            fileWriter.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void write(String path, String content) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.append("\n").append(content);
            fileWriter.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void writeFromTerminal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input new records (END to stop):");
        while (true) {
            String newLine = scanner.nextLine();
            if ("END".equals(newLine)) {
                break;
            }
            append(newLine);
        }
        scanner.close();
    }

    public static void remove(String path) {
        File targetFile = new File(path);
        if (targetFile.delete()) {
            System.out.printf("file `%s` was deleted", path);
        } else {
            System.err.println("file cannot be deleted");
        }
    }

    public static void write(String path, ArrayList<String> content) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            for (String line : content) {
                fileWriter.append(line + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void copyTo(String targetPath) {
        String content = read();
        FileHandler.write(targetPath, content);
    }

    public ArrayList<String> readLines(int begin, int quantity) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(this.file);
            int currentLineNum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (++currentLineNum < begin) {
                    continue;
                }
                lines.add(line);
                if (lines.size() == quantity) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    @Override
    public String toString() {
        return String.format("File `%s` has length %dB%n", this.file.getAbsolutePath(), this.file.length());
    }
}
