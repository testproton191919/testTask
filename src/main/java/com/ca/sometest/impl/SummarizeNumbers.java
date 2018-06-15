package com.ca.sometest.impl;

import com.ca.sometest.exception.FailException;


public interface SummarizeNumbers {
    // returns result of the a + b , block with exceptions might be present or not by the choice of candidate.

    /**
     * @param a represent Integer value;
     * @param b represent Integer value;
     * @return Sum of provided values;
     * @throws FailException in a few cases:
     * 1) one or both values equals null;
     * 2) sum of values can exceed Integer size bound Integer.MIN_VALUE  Integer.MAX_VALUE
     */
    Integer sum(Integer a, Integer b) throws FailException;
}
