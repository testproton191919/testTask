package com.ca.sometest.exception;

public class FailException extends Exception {

    public FailException(Integer a, Integer b) {
        super("\n" + "The Integer size was exceeded!" +
                "\n" + "Number_1 = " + a +
                "\n" + "Number_2 = " + b);
    }

    public FailException(String message) {
        super(message);
    }
}
