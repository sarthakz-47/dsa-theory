// What is Soritng?
// Arranging elements in the order either ascending or descending

// Basic Types of Sorting
// Bubble Sort: largest elements comes to end of the array by sawapping it with adjacant elements
// outer loop runs for (n-1) times and inner loop runs for (n-i-1) times to ignore last sorted array largest element goes to end of the array

import java.util.Arrays;

class TheeorySorting {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        // TC: O(n^2) + O(1)
    }

    public static void optimizesBubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        // TC: O(n) + O(1)
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minEle = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minEle]) {
                    minEle = j;
                }
            }
            int temp = arr[minEle];
            arr[minEle] = arr[i];
            arr[i] = temp;
        }
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        // TC: O(n^2) + O(1)
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        // TC: O(n^2) + O(1)
    }

    public static void inBuiltSort(int arr[]) {
        // Ascending order:
        // Arrays.sort(arr) \\ Arrays.sort(arr,si,ei) -> ei is exclusive
        Arrays.sort(arr, 0, 3);
        for (int nums : arr) {
            System.out.print(nums + " ");
        }

        // Descending order:
        // Arrays.sort(arr, Collections.reverseOrder());
        // Arrays.sort(arr, si ,ei ,Collections.reverseOrder());

        // TC: O(nlogn) + O(1)
    }

    public static void countSort(int arr[]) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[idx] = i;
                idx++;
                count[i]--;
            }
        }
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        // O(n + range) + O(n)
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 1, 4, 1, 2, 1, 3, 5 };
        // bubbleSort(arr);
        System.out.println();
        // optimizesBubbleSort(arr);
        System.out.println();
        // selectionSort(arr);
        System.out.println();
        // insertionSort(arr);
        System.out.println();
        // inBuiltSort(arr);
        System.out.println();
        countSort(arr);
        System.out.println();
    }
}
