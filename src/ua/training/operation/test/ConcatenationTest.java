package ua.training.operation.test;

import org.junit.Assert;
import org.junit.Test;
import ua.training.operation.Concatenation;

import static org.junit.Assert.*;

public class ConcatenationTest extends Concatenation {

    @Test
    public void calculate() {
        Assert.assertEquals(super.calculate("a","b"), "ab");
    }
}