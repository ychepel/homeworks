package lesson22;

abstract class Vehicle {
    public void start() {
        System.out.println(this.getClass().getName() + " start moving");
    }

    public void stop() {
        System.out.println(this.getClass().getName() + " stop moving");
    }
}
