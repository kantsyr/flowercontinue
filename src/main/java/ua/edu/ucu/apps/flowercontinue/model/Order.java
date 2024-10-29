package ua.edu.ucu.apps.flowercontinue.model;

import java.util.List;

public class Order {
    private List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", totalPrice=" + getTotalPrice() +
                '}';
    }
}
