package com.codekul.exceptionhandling;

public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println(10/2);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("in finally block");
        }
        System.out.println("Rest of code");
    }
}
