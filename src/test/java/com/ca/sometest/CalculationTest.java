package com.ca.sometest;

import com.ca.sometest.exception.FailException;
import com.ca.sometest.impl.SummarizeNumbers;
import com.ca.sometest.impl.Calculation;
import org.junit.Assert;
import org.junit.Test;

public class CalculationTest {

    @Test
    public void testSumSmallPositive() throws FailException {
        SummarizeNumbers test1 = new Calculation();
        Assert.assertEquals(new Integer(300), test1.sum(100, 200));
    }

    @Test
    public void testSumSmallNegative() throws FailException {
        SummarizeNumbers test1 = new Calculation();
        Assert.assertEquals(new Integer(-300), test1.sum(-100, -200));
    }

    @Test(expected = FailException.class)
    public void testNull_1() throws FailException {
        SummarizeNumbers test1 = new Calculation();
        test1.sum(null, null);
    }

    @Test(expected = FailException.class)
    public void testNull_2() throws FailException {
        SummarizeNumbers test1 = new Calculation();
        test1.sum(null, 1);
    }

    @Test(expected = FailException.class)
    public void testNull_3() throws FailException {
        SummarizeNumbers test1 = new Calculation();
        test1.sum(1, null);
    }

    @Test(expected = FailException.class)
    public void testIntOver_1() throws FailException {
        SummarizeNumbers test1 = new Calculation();
        test1.sum(Integer.MAX_VALUE , Integer.MAX_VALUE);
    }

    @Test(expected = FailException.class)
    public void testIntOver_2() throws FailException {
        SummarizeNumbers test1 = new Calculation();
        test1.sum(Integer.MIN_VALUE , Integer.MIN_VALUE );
    }

}
