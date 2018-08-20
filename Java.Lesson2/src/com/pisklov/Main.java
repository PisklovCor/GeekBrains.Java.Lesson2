package com.pisklov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        String[][] ar = new String[i][j];


        try {
            printArray(ar);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    public static void printArray(String[][] ar) throws MyArraySizeException, MyArrayDataException {

        if (ar.length != 4) {
            throw new MyArraySizeException();
        } else {
            for (int i = 0; i < ar.length; i++) {
                if (ar[i].length != 4) {
                    throw new MyArraySizeException();
                }
            }
        }

        int sum = 0;
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = sc1.nextLine();
                int el = 0;
                try {
                    el = Integer.parseInt(ar[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
                sum += el;
            }
        }
        System.out.println("sum= " + sum);
    }
}