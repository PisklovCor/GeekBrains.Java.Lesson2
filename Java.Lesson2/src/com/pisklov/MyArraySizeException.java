package com.pisklov;

public class MyArraySizeException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("MyArraySizeException");
    }
}
