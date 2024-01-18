package lesson40;

public class Main {
    public static void main(String[] args) {
        System.out.println(Color.RED.getRGBCode());
        System.out.println(Color.GREEN.getRGBCode());
        System.out.println(Color.BLUE.getRGBCode());

        System.out.println(Coin.DIME.getValue());

        System.out.println(getDuration(Month.JULY));
    }

    public static int getDuration(Month month) {
        return month.days;
    }
}
