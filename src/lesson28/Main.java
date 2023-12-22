package lesson28;

public class Main {
    public static void main(String[] args) {
        CustomList list = new CustomList(new int[]{2,5,6,18,9,5,10,-60,30,5,5});

        System.out.println(list);
        list.removeByIndex(20);
        list.removeByIndex(0);
        list.removeByIndex(-1);
        System.out.println(list);

        System.out.println("----------");

        list.removeAllByIndex(-4);
        list.removeAllByIndex(4);
        list.removeAllByIndex(16);
        System.out.println(list);

    }
}
