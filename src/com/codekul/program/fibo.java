package com.codekul.program;

public class fibo {

    public static void main(String[] args) {

        int no1 = 0;
        int no2 = 1;
        int limit = 10;
        System.out.println("number:" + no1);
        System.out.println("number:" + no2);

        while (limit > 0) {
            int next = no1 + no2;

            System.out.println("number:" + next);
            no1 = no2;
            no2 = next;
            limit--;

        }
    }

}
