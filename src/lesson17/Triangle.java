package lesson17;

//Класс "Треугольник" (Triangle): Опишите класс "Треугольник" с атрибутами для длин сторон. Реализуйте геттеры и
// сеттеры для каждого атрибута. Обеспечьте, чтобы длины сторон образовывали корректный треугольник
// (сумма длин любых двух сторон должна быть больше длины третьей стороны).

public class Triangle {
    private static final int SIDES_QUANTITY = 3;

    private double[] sides;

    public Triangle() {
        this.sides = new double[SIDES_QUANTITY];
    }

    public double getSide1() {
        return sides[0];
    }

    public void setSide1(double length) {
        validateSide(0, length);
        this.sides[0] = length;
    }

    public double getSide2() {
        return sides[1];
    }

    public void setSide2(double length) {
        validateSide(1, length);
        this.sides[1] = length;
    }

    public double getSide3() {
        return sides[2];
    }

    public void setSide3(double length) {
        validateSide(2, length);
        this.sides[2] = length;
    }

    private void validateSide(int index, double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("side length must be greater than 0");
        }

        double[] checkingValues = new double[SIDES_QUANTITY];
        for (int i = 0; i < SIDES_QUANTITY; i++) {
            if (i == index) {
                checkingValues[i] = length;
                continue;
            }
            if (sides[i] == 0) {
                return;
            }
            checkingValues[i] = sides[i];
        }
        if (checkingValues[0] + checkingValues[1] <= checkingValues[2]
            || checkingValues[0] + checkingValues[2] <= checkingValues[1]
            || checkingValues[1] + checkingValues[2] <= checkingValues[0]) {
            throw new IllegalArgumentException("invalid composition of side lengths");
        }
    }
}
