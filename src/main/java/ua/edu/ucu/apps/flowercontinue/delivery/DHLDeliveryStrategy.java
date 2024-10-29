package ua.edu.ucu.apps.flowercontinue.delivery;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    public String deliver() {
        return "Delivered via DHL";
    }
}
