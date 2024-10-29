package ua.edu.ucu.apps.flowercontinue.payment;

public class PayPalPaymentStrategy implements Payment {

    @Override
    public String pay(double amount) {
        return "Paid " + amount + " using PayPal";
    }
}
