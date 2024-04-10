package com.shivam;

import java.util.ArrayList;

public class BinaryGap {

    public int findGap(int n){
        int[] arr = getBinary(n);

        int gap = 0;
        boolean check = false;
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(check){
                if(arr[i] == 0){
                    gap++;
                }else{
                    ans = Math.max(gap,ans);
                    gap = 0;
                }
            }
            if(arr[i] == 1){
                check = true;
            }
        }
        return ans;
    }

    private int[] getBinary(int n){
        ArrayList<Integer> l = new ArrayList<>();
        while(n > 0){
            if(n % 2 == 0){
                l.add(0);
            }else{
                l.add(1);
            }
            n = n / 2;
        }
        int[] arr = new int[l.size()];
        int k = 0;
        for(int i = l.size()-1 ; i >= 0 ; i--){
            arr[k] = l.get(i);
            k++;
        }
        return arr;
    }
}
