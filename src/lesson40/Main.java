package lesson40;

public class Main {
    public static void main(String[] args) {
        System.out.println(getRgbCode(Color.RED));

        System.out.println(Coin.DIME.value);

        System.out.println(getDuration(Month.JULY));
    }

    public static String getRgbCode(Color color) {
        StringBuffer buffer = new StringBuffer("rgb(");
        buffer.append(color == Color.RED ? 255 : 0);
        buffer.append(",");
        buffer.append(color == Color.GREEN ? 255 : 0);
        buffer.append(",");
        buffer.append(color == Color.BLUE ? 255 : 0);
        buffer.append(")");
        return buffer.toString();
    }

    public static int getDuration(Month month) {
        return month.days;
    }
}
