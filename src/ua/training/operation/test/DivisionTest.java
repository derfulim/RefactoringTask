package ua.training.operation.test;

import org.junit.Assert;
import org.junit.Test;
import ua.training.operation.Division;

import static org.junit.Assert.*;

public class DivisionTest extends Division {

    @Test
    public void calculate() {
        Assert.assertEquals(super.calculate(12,6), Integer.valueOf(2));
    }
}