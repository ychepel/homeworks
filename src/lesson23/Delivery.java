package lesson23;

//Создайте класс Delivery со свойствами: product price - число count - целое число
//и методом calculateDeliveryCost(), который возвращает произведение цены товара на колличество.
//Создайте дочерний класс AirDelivery, в котором переопределяется метод calculateDeliveryCost() при AirDelivery
// стоимость доставки увеличивается на 25 процентов.

public class Delivery {
    private double productPrice;
    private int count;

    public double calculateDeliveryCost() {
        return productPrice * count;
    }

}
