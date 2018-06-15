package com.ca.sometest.impl;

import com.ca.sometest.exception.FailException;


public class Calculation implements SummarizeNumbers {

    @Override
    public Integer sum(Integer a, Integer b) throws FailException {

        if (a == null & b == null) {
            throw new FailException("Null was found for both values");
        } else if ( a == null ) {
            throw new FailException("Null was found for value a");
        } else if ( b == null ) {
            throw new FailException("Null was found for value b");
        }

        if ((a > 0 & b > 0) & (Integer.MAX_VALUE - a) < b
                || (a < 0 & b < 0) & (Integer.MIN_VALUE - a) > b) {
            throw new FailException(a, b);
        }
        return (a + b);
    }
}
