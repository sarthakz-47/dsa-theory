package Arrays;

import java.util.*;

class TheeoryArrays {

    // 1.1 array as function arguments:
    public static void fnxargs(int numbers[]) {
        // updated value in fnx:
        numbers[0] = 100;
    }

    // 1.2 linear search in arrays:
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (key == numbers[i]) {
                return i;
            }
        }
        return -1;
    }

    // 1.3 binary search in arrys:
    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // What is array:
        // Array is a data structure that stores list of same type of elements in
        // contigous memory.
        // Zero-Indexing based.

        // Why array:
        // when we need to store multiple data of same type we can use array instead of
        // creating multiple variables.

        // How to create a array:
        int marks[] = new int[5];
        int numbers[] = { 1, 2, 3, 4, 5 };
        String fruits[] = { "apple", "mango" };

        // How to take input in array:
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // How to print the output:
        System.out.println("1:" + marks[0]);
        System.out.println("2:" + marks[1]);
        System.out.println("3:" + marks[2]);

        // How to update the array:
        fruits[1] = "kiwi";
        System.out.println("Updated Fruit:" + fruits[1]);

        // How to print the length of the array:
        int n = numbers.length;
        System.out.println("length of the array: " + n);

        // How to print the array:
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 1.1 array as fucntion arguments: they are passed by refrence
        fnxargs(numbers);
        for (int nums : numbers) {
            System.out.print(nums + " ");
        }
        System.out.println();
        // 1.2 linear seach in arrays:
        // We search for the key one by one in the array
        // which makes TC: O(n) + O(1)
        int res = linearSearch(numbers, 5);
        System.out.println(res);

        // 1.3 binary search in arrays:
        // ** only applicable on sorted arrays!
        // we find the mid element and tben comapre with key
        // if key>mid then search in right half
        // else search in left half
        // which makes TC:O(logn) + O(1)
        int res2 = binarySearch(numbers, 4);
        System.out.println(res2);

        // 2D Arrays:
        // What is 2D array:
        // 2D array is an array of arrays. It is used to store data in rows and columns

        // How to create a 2D array:
        int mat[][] = new int[3][4];
        int chess[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // // rows and columns in 2D array:
        // int row = mat.length;
        // int col = mat[0].length;
        int row = chess.length;
        int col = chess[0].length;
        System.out.println("Rows: " + row + " Columns: " + col);

        // print 2D array:
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        // search in 2D array:
        int key = 4;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (key == chess[i][j]) {
                    System.out.println("Key found at: " + i + " " + j);
                }
            }
        }
    }
}