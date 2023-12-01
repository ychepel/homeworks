package lesson17;

//Класс "Автомобиль" (Car): Опишите класс "Автомобиль" с атрибутами для марки, модели и текущей скорости. Реализуйте
// геттеры и сеттеры для каждого атрибута. Геттеры должны возвращать значения, а сеттеры — устанавливать новые значения.

public class Car {
    private String brand;
    private String model;
    private int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("speed cannot be less than 0");
        }
        this.speed = speed;
    }
}
