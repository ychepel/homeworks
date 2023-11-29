package lesson16;

//Задача 8: Магазин Создайте класс Store, содержащий свойства productName (название товара) и price (цена товара),
// конструктор для их инициализации, и метод displayProductInfo, выводящий информацию о товаре.

public class Store {
    private String productName;
    private double price;

    public Store(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void displayProductInfo() {
        System.out.printf("%s costs %.2f%n", productName, price);
    }
}
