package ua.edu.ucu.apps.flowercontinue.controller;

import ua.edu.ucu.apps.flowercontinue.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {

    @GetMapping("/order")
    public Order getOrder() {
        Item flower = new Item("White", 8.0);
        Item wrappedFlower = new PaperDecorator(flower);
        Item wrappedFlowerInBasket = new BasketDecorator(wrappedFlower);

        return new Order(List.of(wrappedFlowerInBasket));
    }
}
