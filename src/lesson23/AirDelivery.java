package lesson23;

public class AirDelivery extends Delivery {
    public AirDelivery(double productPrice, int count) {
        super(productPrice, count);
    }

    @Override
    public double calculateDeliveryCost() {
        return super.calculateDeliveryCost() * 1.25;
    }
}
