package Strings;

import java.util.Scanner;

public class theoryStrings {
    public static void main(String[] args) {
        // What are strings in java:
        // Strings are data strucutre used in java to store characters.
        // String is class in java

        // How to create String
        String str = "Sarthak";
        String str2 = new String("abcd");

        // How to print
        System.out.println(str + " " + str2);

        // How to take input in Strings:
        Scanner sc = new Scanner(System.in);
        // accepts only first word
        // String str3 = sc.next();
        // System.out.println("You wrote: " + str3);

        // accepts whole line including spaces:
        String str4 = sc.nextLine();
        System.out.println("You wrote: " + str4);

        // Length of the string:
        int n = str.length();
        System.out.println("Length of string is: " + n);
        // in arrays arr.length is property
        // in strings str.length() is fnx

        // How to concatenate two Strings:
        String fname = "Akash";
        String lname = "Jadhav";
        System.out.println(fname + " " + lname);

        // Methods in Strings:
        // 1.charAt(int) method : returns element present at 2nd index
        String let = "MANGO";
        System.out.println(let.charAt(2));
        // 2.

        // How to print a string:
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
