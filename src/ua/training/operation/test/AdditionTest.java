package ua.training.operation.test;

import org.junit.Assert;
import org.junit.Test;
import ua.training.operation.Addition;

import static org.junit.Assert.*;

public class AdditionTest extends Addition {

    @Test
    public void calculate() {
        Assert.assertEquals(super.calculate(1,6), Integer.valueOf(7));
    }
}