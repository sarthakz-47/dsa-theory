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
        // Scanner sc = new Scanner(System.in);
        // accepts only first word
        // String str3 = sc.next();
        // System.out.println("You wrote: " + str3);

        // accepts whole line including spaces:
        // String str4 = sc.nextLine();
        // System.out.println("You wrote: " + str4);

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
        // charAt(int) method : returns charachter present at 2nd index
        String let = "MANGO";
        System.out.println(let.charAt(2));

        // How to print a string:
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

        // when we declare srtings like this:
        String ass1 = "MANGO";
        String ass2 = "MANGO";
        String ass3 = new String("MANGO");

        System.out.println(ass1 == ass2); // true because ass1 and ass2 are created in string pool
        System.out.println(ass1 == ass3); // false because ass3 is created in heap memory and ass1,ass2 are created in
                                          // string pool

        // equals() method: compares two strings
        System.out.println(ass1.equals(ass2));
        System.out.println(ass1.equals(ass3));

        // substring(si,ei) method: returns substring from si to ei-1
        String sub = "MANGOLASSI";
        System.out.println(sub.substring(5)); // will print from 5th index to end
        System.out.println(sub.substring(0, 5)); // will print from 0th index to 4th index

        // toCharArray() method: converts string to char array
        String charArr = "MANGOLASSI";
        char[] arr = charArr.toCharArray();
        for (char c : arr) {
            System.out.print(c + " ");
        }

        // indexOf() method: returns index of first occurence of charachter
        String ind = "MANGOLASSI";
        System.out.println(ind.indexOf('A'));

        // compareTo() method: compares two strings lexicographically
        String str5 = "MANGO";
        String str6 = "MANGOLASSI";
        System.out.println(str5.compareTo(str6)); // will return negative value because str5 is smaller than str6
        System.out.println(str6.compareTo(str5)); // will return positive value because str6
        // is greater than str5

        // contains() method: checks if string contains a substring
        String contain = "MANGOLASSI";
        System.out.println(contain.contains("ANGO"));

        // replace() method: replaces all occurences of a charachter with another
        // charachter
        String replace = "MANGOLASSI";
        System.out.println(replace.replace('A', 'O'));

        // split() method: splits string into array of strings based on delimiter
        String split = "MANGO,LASSI";
        String[] arr2 = split.split(",");
        for (String s : arr2) {
            System.out.println(s);
        }

        // lastIndexOf() method: returns index of last occurence of charachter
        String lastInd = "MANGOLASSI";
        System.out.println(lastInd.lastIndexOf('A'));

        // toUpperCase()/ toLowerCase() method: returns string in upper/lower case
        String upper = "MangoLassi";
        System.out.println(upper.toUpperCase());
        System.out.println(upper.toLowerCase());

        // trim() method: removes leading and trailing spaces
        String trim = "   MANGOLASSI   ";
        System.out.println(trim.trim());

        // Immutability of Strings:
        // when we create a string and try to change it, a new string is created in
        // memory and the old string is not changed it stays there forver.
        // This is called immutability of strings.

        // StringBuilder class: mutable version of string
        // how to create and print:
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        // .append method: adds string to the end of the stringbuilder
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());

        String sbtostr = sb.toString();
        System.out.println(sbtostr);
    }
}
