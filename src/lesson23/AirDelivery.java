package lesson23;

public class AirDelivery extends Delivery {
    @Override
    public double calculateDeliveryCost() {
        return super.calculateDeliveryCost() * 1.25;
    }
}
