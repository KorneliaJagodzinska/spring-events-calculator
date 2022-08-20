package com.example.SpringEventsCalculator.events;

import org.springframework.context.ApplicationEvent;

public class CalculatorRegisteredEvent extends ApplicationEvent {
    public int firstDigit;
    public int secondDigit;

    public CalculatorRegisteredEvent(final Object source, final int firstDigit, final int secondDigit) {
        super(source);
        this.firstDigit = firstDigit;
        this.secondDigit = secondDigit;
    }

    public int getFirstDigit() {
        return firstDigit;
    }

    public int getSecondDigit() {
        return secondDigit;
    }
}
