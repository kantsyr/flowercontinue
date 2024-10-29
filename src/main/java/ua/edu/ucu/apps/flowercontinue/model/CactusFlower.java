package ua.edu.ucu.apps.flowercontinue.model;


public class CactusFlower extends Flower {
    public CactusFlower(double price, String color) {
        super(price, color);
    }

    @Override
    public String toString() {
        return "CactusFlower{" +
                "price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
