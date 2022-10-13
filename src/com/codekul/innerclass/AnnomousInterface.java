package com.codekul.innerclass;

public class AnnomousInterface {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread started");
            }
        };
    }
}
