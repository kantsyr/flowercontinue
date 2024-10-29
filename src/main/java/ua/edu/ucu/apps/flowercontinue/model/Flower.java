package ua.edu.ucu.apps.flowercontinue.model;

public class Flower {
    private double price;
    private String color;

    public Flower(double price, String color) {
        this.price = price;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
