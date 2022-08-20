package com.example.SpringEventsCalculator.service;

import com.example.SpringEventsCalculator.events.CalculatorRegisteredEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CalculatorManager  implements ApplicationListener<CalculatorRegisteredEvent> {

    @Override
    public void onApplicationEvent(final CalculatorRegisteredEvent event) {
        System.out.println("Processing of " + event.getFirstDigit());
        System.out.println("Processing of " + event.getSecondDigit());
    }
}
