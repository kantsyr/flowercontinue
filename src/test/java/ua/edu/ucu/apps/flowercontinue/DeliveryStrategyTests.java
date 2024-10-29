package ua.edu.ucu.apps.flowercontinue;


import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flowercontinue.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.flowercontinue.delivery.Delivery;
import ua.edu.ucu.apps.flowercontinue.delivery.PostDeliveryStrategy;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryStrategyTests {

    @Test
    void testBothDeliveries() {
        Delivery postDelivery = new PostDeliveryStrategy();
        assertEquals("Delivered via Post", postDelivery.deliver());

        Delivery dhlDelivery = new DHLDeliveryStrategy();
        assertEquals("Delivered via DHL", dhlDelivery.deliver());
    }
    }