package com.codekul.string;

public class Compare {
    public static void main(String[] args) {
        String s1="pune";
        String s2="pune";
        String s3="pune";

        if(s1==s2){
            System.out.println("s1 == s2"+(s1==s2));
        }

        if (s1.equals(s3)){
            System.out.println("s1.equal to s3"+(s1.equals(s3)));
        }else {
            System.out.println("s1 not equal to s3");
        }

        System.out.println(s1.compareTo(s2));
    }
}
