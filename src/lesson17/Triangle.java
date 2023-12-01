package lesson17;

//Класс "Треугольник" (Triangle): Опишите класс "Треугольник" с атрибутами для длин сторон. Реализуйте геттеры и
// сеттеры для каждого атрибута. Обеспечьте, чтобы длины сторон образовывали корректный треугольник
// (сумма длин любых двух сторон должна быть больше длины третьей стороны).

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        validateSide(side1, side2, side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double length) {
        validateSide(length, this.side2, this.side3);
        this.side1 = length;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double length) {
        validateSide(this.side1, length, this.side3);
        this.side2 = length;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double length) {
        validateSide(this.side1, this.side2, length);
        this.side3 = length;
    }

    private void validateSide(double side1, double side2, double side3) {
        if (side1 + side2 > side3
            && side1 + side3 > side2
            && side2 + side3 > side1
            && side1 > 0 && side2 > 0 && side3 > 0) {
            return;
        }
        throw new IllegalArgumentException("invalid composition of side lengths");
    }
}
