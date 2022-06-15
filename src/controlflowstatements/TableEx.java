package controlflowstatements;

import java.util.Scanner;

public class TableEx {
    public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter ur no:");
        int n= sc.nextInt();

//        for(int i=1;i<=10;i++){
//            System.out.println(n*i);
//        }

        /**
         *  ***
         *  ***
         *  ***
         *
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(".......................................................");
        /**
         * *
         * **
         * ***
         * ****
         * *****
         *
         */
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*");

                }
                System.out.println();
            }
        System.out.println(".......................................................");
        /**
         * *****
         * ****
         * ***
         * **
         * *
         *
         *
         */
            for(int i=0;i<n;i++){
                for(int j=n-1;j>=i;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        System.out.println(".......................................................");
        /**
         *
         *     *
         *    **
         *   ***
         *  ****
         * *****
         *
         */for(int i=0;i<n;i++){
             for(int j=n-1;j>=i;j--){
                 System.out.print(" ");
             }
             for(int k=0;k<=i;k++){
                 System.out.print("*");
             }
            System.out.println();
            }
        System.out.println(".......................................................");
        /**
         * *****
         *  ****
         *   ***
         *    **
         *     *
         *
         */

        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=n-1;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(".......................................................");
    }
}
