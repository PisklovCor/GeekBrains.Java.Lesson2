package com.pisklov;

public class MyArrayDataException extends Exception {
    private int i = 0;
    private int j = 0;

    public MyArrayDataException(int i, int j){
        super();
        this.i = i;
        this.j = j;
    }
    public MyArrayDataException(){
        super();
    }

    public void printStackTrace() {
        System.out.println("MyArrayDataException in " + this.i +" " + this.j);
    }
}
