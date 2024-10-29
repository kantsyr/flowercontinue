package ua.edu.ucu.apps.flowercontinue.model;

public class RomashkaFlower extends Flower {
    public RomashkaFlower(double price, String color) {
        super(price, color);
    }

    @Override
    public String toString() {
        return "RomashkaFlower{" +
                "price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
