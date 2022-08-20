package com.example.SpringEventsCalculator.controller;

import com.example.SpringEventsCalculator.domain.Calculator;
import com.example.SpringEventsCalculator.events.CalculatorRegisteredEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    @PostMapping(path = "add")
    public void add(@RequestBody Calculator calculator) {
        System.out.println("Result: " + calculator.add(calculator.getFirstDigit(), calculator.getSecondDigit()));
        publisher.publishEvent(
                new CalculatorRegisteredEvent(
                        this,
                        calculator.getFirstDigit(),
                        calculator.getSecondDigit()));
    }

    @PostMapping(path = "subtract")
    public void subtract(@RequestBody Calculator calculator) {
        System.out.println("Result: " + calculator.subtract(calculator.getFirstDigit(), calculator.getSecondDigit()));
        publisher.publishEvent(
                new CalculatorRegisteredEvent(
                        this,
                        calculator.getFirstDigit(),
                        calculator.getSecondDigit()));
    }

    @PostMapping(path = "divide")
    public void divide(@RequestBody Calculator calculator) {
        System.out.println("Result: " + calculator.divide(calculator.getFirstDigit(), calculator.getSecondDigit()));
        publisher.publishEvent(
                new CalculatorRegisteredEvent(
                        this,
                        calculator.getFirstDigit(),
                        calculator.getSecondDigit()));
    }

    @PostMapping(path = "multiply")
    public void multiply(@RequestBody Calculator calculator) {
        System.out.println("Result: " + calculator.multiply(calculator.getFirstDigit(), calculator.getSecondDigit()));
        publisher.publishEvent(
                new CalculatorRegisteredEvent(
                        this,
                        calculator.getFirstDigit(),
                        calculator.getSecondDigit()));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
