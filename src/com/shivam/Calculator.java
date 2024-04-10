package com.shivam;

public class Calculator {
    public long calculate(long n){
        long sum = 0;
        for(int i = 0 ; i <= n ; i++){
            sum += i;
        }
        return sum;
    }

    public long formula(long n){
        return n * (n+1)/2;
    }

    public int binarySearch(int[] array , int target){
        int a = 0 ;
        int b = array.length-1;


        while(a <= b){
            int m= a + (b-a)/2;
            if(array[m] > target){
                b = m-1;
            }else if(array[m] < target){
                a = m+1;
            }else{
                return m;
            }
        }
        return -1;
    }

    public int[] bubbleSort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        return arr;
    }

    private void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
