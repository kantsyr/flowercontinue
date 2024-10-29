package ua.edu.ucu.apps.flowercontinue.payment;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public String pay(double amount) {
        return "Paid " + amount + " using Credit card";
    }
}
