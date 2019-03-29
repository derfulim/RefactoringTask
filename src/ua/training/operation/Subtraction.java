package ua.training.operation;

public class Subtraction implements Operation<Integer> {
    @Override
    public Integer calculate(Integer first, Integer second) {
        return first - second;
    }
}
