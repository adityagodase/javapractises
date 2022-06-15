package controlflowstatements;

import java.util.Scanner;

public class VowelsEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        switch (ch){
            case 'a' :
                System.out.println("It's Vowel");
                break;
            case 'e':
                System.out.println("It's Vowel");
                break;
            case 'i':
                System.out.println("It's Vowel");
                break;
            case 'o':
                System.out.println("It's Vowel");
                break;
            case 'u':
                System.out.println("It's Vowel");
                break;
            default:
                System.out.println("It's Consonants");
        }
    }
}
