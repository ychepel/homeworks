package lesson26;

public class Car extends Vehicle {
    private String model;

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d", super.brand, model, super.year);
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }
}
