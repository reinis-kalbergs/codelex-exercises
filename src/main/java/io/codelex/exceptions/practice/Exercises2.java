package io.codelex.exceptions.practice;

public class Exercises2 {
    public static void main(String[] args) {
        methodA();
        System.out.println("isn't gonna work");
    }

    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodC() throws ArithmeticException {
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }

    }
}
