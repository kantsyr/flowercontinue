package ua.edu.ucu.apps.flowercontinue;

import ua.edu.ucu.apps.flowercontinue.payment.Payment;
import ua.edu.ucu.apps.flowercontinue.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.flowercontinue.payment.PayPalPaymentStrategy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentStrategyTests {

    @Test
    void testCreditCardPayment() {
        Payment payment = new CreditCardPaymentStrategy();
        assertEquals("Paid 100.0 using Credit card", payment.pay(100));
    }

    @Test
    void testPayPalPayment() {
        Payment payment = new PayPalPaymentStrategy();
        assertEquals("Paid 200.0 using PayPal", payment.pay(200));
    }
}