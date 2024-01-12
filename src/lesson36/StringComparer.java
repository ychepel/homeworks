package lesson36;

public class StringComparer implements Comparer<String>{
    @Override
    public int compare(String obj1, String obj2) {
        return obj1.length() - obj2.length();
    }
}
