package ua.edu.ucu.apps.flowercontinue.delivery;

public class PostDeliveryStrategy implements Delivery {

    @Override
    public String deliver() {
        return "Delivered via Post";
    }
}
