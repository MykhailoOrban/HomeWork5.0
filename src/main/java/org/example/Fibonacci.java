package org.example;

public class Fibonacci {

    public static int fibonacciRecursive(int n){
        if(n <= 1) return n;

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);

//        Просторова складність: O(n) - максимальна глибина стеку рекурсії.
//        Часова складність: O(2^n) - кожне число Фібоначчі обчислюється шляхом двох рекурсивних викликів.
    }

    public static int fibonacciIterative(int n){
        if(n <= 1) return n;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;

//        Просторова складність: O(1) - використовується лише константна кількість змінних.
//
//        Часова складність: O(n) - цикл виконується n разів.
    }

    public static int fibonacciDynamic(int n){
        if (n <= 1) {
            return n;
        }

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
//        Просторова складність: O(n) - використовується додатковий масив розміром n.
//
//        Часова складність: O(n) - цикл виконується n разів.


    }


    public static void main(String[] args) {

        System.out.println(fibonacciRecursive(27));
        System.out.println(fibonacciDynamic(27));
        System.out.println(fibonacciIterative(27));

    }
}

