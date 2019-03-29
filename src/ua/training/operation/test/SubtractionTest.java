package ua.training.operation.test;

import org.junit.Assert;
import org.junit.Test;
import ua.training.operation.Subtraction;

import static org.junit.Assert.*;

public class SubtractionTest extends Subtraction {

    @Test
    public void calculate() {
        Assert.assertEquals(super.calculate(1,6), Integer.valueOf(-5));
    }
}