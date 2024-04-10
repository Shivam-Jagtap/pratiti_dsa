package com.shivam;

import java.util.Arrays;
import java.util.HashMap;

public class BusBooking {

    int[][] seats ;         //1 - mumbai , 2 - surat , 3 - rajasthan , 4 - delhi

    HashMap<String,Integer> seatCount;

    BusBooking(){
        seats = new int[5][2];
        seatCount = new HashMap<>();

        for (int[] a : seats){
            Arrays.fill(a,0);
        }

        seatCount.put("ab",0);
        seatCount.put("bc",0);
        seatCount.put("cd",0);
        seatCount.put("ac",0);
        seatCount.put("ad",0);
        seatCount.put("bd",0);
        seatCount.put("ad",0);

    }

    private boolean checkSeatAvailablity(int source, int destination){
        sortArrayBySource(this.seats);

        for(int[] a : this.seats){
            if(a[0] == 0 && a[1] == 0){
                a[0] = source;
                a[1] = destination;
                return true;
            }
            if(source >= a[0] && destination >= a[1]){
                if(source >= a[1]){
                    a[0] = source;
                    a[1] = destination;
                    return true;
                }
            }
            if(destination <= a[0]){
                a[0] = source;
                a[1] = destination;
                return true;
            }
        }
        return false;
    }

    boolean bookSeat(int source,int destination){
        String journey = "";

        switch (source){
            case 1: journey = journey + "a";
                    break;
            case 2: journey = journey + "b";
                    break;
            case 3: journey = journey + "c";
                break;
            case 4: journey = journey + "d";
                break;
        }

        switch (destination){
            case 2: journey = journey + "b";
                break;
            case 3: journey = journey + "c";
                break;
            case 4: journey = journey + "d";
                break;
        }

        System.out.println("journey route - "+journey);

        if(checkSeatAvailablity(source,destination)){
            int count = seatCount.get(journey);
            seatCount.put(journey,count+1);
            return true;
        }else{
            return false; // seat no available
        }
    }

    private void sortArrayBySource(int[][] bus){
        Arrays.sort(bus,(a,b)->Integer.compare(a[0],b[0]));
    }

    public void printSeats(){
        for(int[] a : seats){
            System.out.println(a[0] + " -> "+a[1]);
        }
    }

    public void printMap(){
        for(String x : seatCount.keySet()){
            System.out.println(x+" -> "+seatCount.get(x));
        }
    }
}
