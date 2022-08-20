package com.example.SpringEventsCalculator.domain;

public class Calculator {

    public int firstDigit;
    public int secondDigit;

    public Calculator(final int firstDigit, final int secondDigit) {
        this.firstDigit = firstDigit;
        this.secondDigit = secondDigit;
    }

    public int getFirstDigit() {
        return firstDigit;
    }

    public void setFirstDigit(final int firstDigit) {
        this.firstDigit = firstDigit;
    }

    public int getSecondDigit() {
        return secondDigit;
    }

    public void setSecondDigit(final int secondDigit) {
        this.secondDigit = secondDigit;
    }

    public int add(int firstDigit, int secondDigit) {
        return firstDigit+secondDigit;
    }

    public int subtract(int firstDigit, int secondDigit) {
        return firstDigit-secondDigit;
    }

    public int divide(int firstDigit, int secondDigit) {
        return firstDigit/secondDigit;
    }

    public int multiply(int firstDigit, int secondDigit) {
        return firstDigit*secondDigit;
    }
}
