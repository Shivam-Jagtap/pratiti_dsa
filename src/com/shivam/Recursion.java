package com.shivam;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
    public static int factorial(int n,int[] arr){
        if(n <= 1) return 1;
        if(arr[n] != -1) return arr[n];
        return arr[n] = n * factorial(n-1,arr);
    }

    public static int fibonacchi(int n , int[] arr){
        if(n == 0) return arr[n] = 0;
        if(n == 1) return arr[n] = 1 ;

        if(arr[n] != -1) return arr[n];

        return arr[n] = fibonacchi(n-1,arr)+fibonacchi(n-2,arr);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n+1];
//        Arrays.fill(arr,-1);
//        int fact = factorial(n,arr);
//        System.out.println("factorial of "+ n + " : "+ fact);

        System.out.println("enter no: ");
        int f = sc.nextInt();
        int[] a = new int[f+1];
        Arrays.fill(a,-1);

//        System.out.println("fibonacchi of n = "+f+" = "+ fibonacchi(f,a));
        if(f == 0) {
            System.out.println("0");
            return;
        }
        if(f == 1){
            System.out.println("1");
            return;
        }
        a[0] = 0;
        a[1] = 1;
        for(int i = 2 ; i < a.length ; i++){
            a[i] = a[i-1] + a[i-2];
        }
        System.out.println(a[f]);
    }
}
