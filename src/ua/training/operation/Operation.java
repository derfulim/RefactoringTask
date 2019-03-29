package ua.training.operation;

public interface Operation <T> {
    T calculate(T first, T second);
}