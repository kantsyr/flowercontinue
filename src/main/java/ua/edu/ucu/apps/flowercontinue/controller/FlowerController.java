package ua.edu.ucu.apps.flowercontinue.controller;

import ua.edu.ucu.apps.flowercontinue.model.CactusFlower;
import ua.edu.ucu.apps.flowercontinue.model.Flower;
import ua.edu.ucu.apps.flowercontinue.model.RomashkaFlower;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flowers")
public class FlowerController {

    @GetMapping
    public List<Flower> getAllFlowers() {
        return List.of(new CactusFlower(20.0, "Green"), new RomashkaFlower(10.0, "White"));
    }
}
