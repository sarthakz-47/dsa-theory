class Recursion {

    public static void dec(int n){
        // base case:
        if(n==1){
            System.out.println(n);
            return;
        }

        // recursive case:
        System.out.println(n);
        dec(n-1);
    }

    public static void inc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        // recursive case:
        inc(n-1);
        System.out.println(n);
    }

    public static int fact(int n){
        // Base Case:
        int fact = 1;
        if(n==0|| n==1){
            return 1;
        }

        // recursive case:
        fact = n * fact(n-1);;
        return fact;
    }

    public static int sum(int n){
        // base case:
        int sum = 0;
        if(n==1){
            return 1;
        }
        // recursive case:
        sum = n + sum(n-1);
        return sum;
    }   

    public static boolean sorted(int arr[],int i){
        // base case:
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        // recursive call:
        return sorted(arr,i+1);
    }   

    public static int fib(int n){
        // base case:
        if(n==0)    return 0;
        if(n==1)    return 1;

        // recursive case:
        int fibn = fib(n-1) + fib(n-2);
        return fibn;
    }

    public static int focc(int arr[],int i,int tar){
        // base case:
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == tar) {
            return i;
        }
        // recursive call:
        return focc(arr,i+1,tar);
    }
    
    public static int locc(int arr[],int i,int tar){
        // base case:
        if(i < 0){
            return -1;
        }
        if(arr[i] == tar) {
            return i;
        }
        // recursive call:
        return locc(arr,i-1,tar);
    }

    public static int pow(int x,int n){
        // base case:
        if(n == 0){
            return 1;
        }
        // recursive case:
        return x * pow(x,n-1);
    }

    public static int powOP(int x,int n){
        if(n==0){
            return 1;
        }

        int half = powOP(x, n/2);
        int halfSq = half*half;

        if(n%2!=0){
            halfSq = x * halfSq;
        }

        return halfSq;
    }

    public static void main(String[] args) {
        // what is recursion:
        // recursion means when fnx calls itself to solve a problem by breaking it into multiple subproblems
        // untill base condtn reached

        // 1.to print numb in dec order:
        dec(5);

        // 2.to print factorial of a number:
        // System.out.println(fact(5));

        // 3.to print numb in inc order:
        // inc(5);

        // 4.sum of n natural numbers:
        // System.out.println(sum(5));

        // 5.array is sorted:
        // int arr[] = {1,2,3,4,5,4};
        // System.out.println(sorted(arr,0));

        // 6.fib number:
        // System.out.println(fib(5));

        // 7.first occurence:
        int arr[] = {1,2,3,4,5,4};
        System.out.println(focc(arr, 0, 4));

        // 8.last occurence:
        System.out.println(focc(arr, arr.length-1, 4));

        // 9.power:
        System.out.println(pow(5,2));
        System.out.println(powOP(5,2));

    }
}