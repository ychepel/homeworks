package lesson41;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

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
            System.out.println("File not found: " + e.getMessage());
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

    @Override
    public String toString() {
        return String.format("File `%s` has length %dB%n", this.file.getAbsolutePath(), this.file.length());
    }
}
