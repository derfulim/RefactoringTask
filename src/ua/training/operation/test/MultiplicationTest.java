package ua.training.operation.test;

import org.junit.Assert;
import org.junit.Test;
import ua.training.operation.Multiplication;

import static org.junit.Assert.*;

public class MultiplicationTest extends Multiplication {

    @Test
    public void calculate() {
        Assert.assertEquals(super.calculate(1,6), Integer.valueOf(6));
    }
}