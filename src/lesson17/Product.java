package lesson17;

//Класс "Товар" (Product): Создайте класс "Товар" с атрибутами для названия товара, цены и количества на складе.
// Реализуйте геттеры и сеттеры для каждого атрибута. Цена и количество не могут быть отрицательными.

public class Product {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("price cannot be less than 0");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (price < 0) {
            throw new IllegalArgumentException("quantity cannot be less than 0");
        }
        this.quantity = quantity;
    }
}
