package com.shivam;

public class MyString {
    char[] string ;
    public MyString(String s){
        string = new char[s.length()];
        for(int i = 0 ; i < s.length() ; i++){
            string[i] = s.charAt(i);
        }
    }

//    public int findPattern(String p){
//        if(p.length() > string.length) return -1;
//
//        for(int i = 0 ; i <= string.length-p.length() ; i++){
//            int j = i + p.length()-1;
//            int k = i;
//            if(string[i] == p.charAt(0) && string[string.length-1] == p.charAt(j)){
//
//            }else{
//
//            }
//        }
//        return -1;
//    }

    public String subString(int start,int end){
        String s = "";

        for(int i = start ; i < end ; i++){
            s = s + string[i];
        }
        return s;
    }

    public String toUpperCase(){
        String s = "";
        for(char c : string){
            s = s + Character.toUpperCase(c);
        }
        return s;
    }

    public String toLowerCase(){
        String s = "";
        for(char c  : string){
            s = s + Character.toLowerCase(c);
        }
        return s;
    }

    @Override
    public String toString() {
        String s = "";
        for(char l : string){
            s = s + l;
        }
        return s;
    }

    public boolean isEquals(String a , String b){
        if(a.length() != b.length()) return false;
        for(int i = 0 ; i < a.length() ; i++){
            if(a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public char myCharAt(int idx){
        if(idx > string.length){
            System.out.println("Index out of bound");
            return ' ';
        }

        return string[idx-1];
    }


}
