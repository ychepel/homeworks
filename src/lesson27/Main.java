package lesson27;

public class Main {
    public static void main(String[] args) {
        CustomStringList list = new CustomStringList(new String[]{"foo", "bar", "hello", "world"});

        System.out.println(list.check("fooo"));
        System.out.println(list.check("bar"));

        System.out.println(list.check(new String[]{"bar", "foo"}));
        System.out.println(list.check(new String[]{"foo", "bar", "windows"}));

        System.out.println(list.longestWord());

        System.out.println(list);
        list.add("how are you?");
        System.out.println(list);

        list.addIfNotExists("bar");
        list.addIfNotExists("fine and you?");
        System.out.println(list);
    }
}
