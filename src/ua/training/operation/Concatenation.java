package ua.training.operation;

public class Concatenation implements Operation <String> {
    @Override
    public String calculate(String first, String second) {
        return first + second;
    }
}
