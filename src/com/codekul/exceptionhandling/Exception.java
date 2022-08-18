package com.codekul.exceptionhandling;

public class Exception extends Throwable {
    public Exception(String s) {
    }

    public static void main(String[] args) {
        String msg = null;
        try{
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            try{
                System.out.println(10/0);
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            System.out.println(msg.toLowerCase());
            System.out.println("Rest of code 1");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Rest of code 2");
    }
}
