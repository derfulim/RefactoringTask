package ua.training.operation;

public class Addition implements Operation <Integer> {
    @Override
    public Integer calculate(Integer a, Integer b) {
        return a + b;
    }

    }
