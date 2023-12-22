package lesson27;

import java.util.Arrays;

public class CustomStringList {
    private String[] list;

    public CustomStringList(String[] list) {
        this.list = list;
    }

    public boolean check(String str) {
        for (String element : this.list) {
            if (element.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean check(String[] strings) {
        for (String toCheck : strings) {
            if (!check(toCheck)) {
                return false;
            }
        }
        return true;
    }

    public String longestWord() {
        String longestWord = this.list[0];
        for (int i = 1; i < this.list.length; i++) {
            if (this.list[i].length() > longestWord.length()) {
                longestWord = this.list[i];
            }
        }
        return longestWord;
    }

    public void add(String str) {
        String[] newList = new String[this.list.length + 1];
        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }
        newList[this.list.length] =  str;
        this.list = newList;
    }

    public void addIfNotExists(String str) {
        if (check(str)) {
            System.out.printf("Строка <%s> в массиве уже есть%n", str);
        } else {
            add(str);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(this.list);
    }
}
