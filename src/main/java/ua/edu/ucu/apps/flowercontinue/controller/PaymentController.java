package ua.edu.ucu.apps.flowercontinue.controller;

import ua.edu.ucu.apps.flowercontinue.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.flowercontinue.payment.PayPalPaymentStrategy;
import ua.edu.ucu.apps.flowercontinue.payment.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @GetMapping("/creditcard")
    public String payWithCreditCard() {
        Payment payment = new CreditCardPaymentStrategy();
        return payment.pay(50.0);
    }

    @GetMapping("/paypal")
    public String payWithPayPal() {
        Payment payment = new PayPalPaymentStrategy();
        return payment.pay(50.0);
    }
}
