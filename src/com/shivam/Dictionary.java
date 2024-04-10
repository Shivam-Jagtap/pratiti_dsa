package com.shivam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dictionary {
    HashMap<String, List<String>> dict ;
    Dictionary(){
        dict = new HashMap<>();
    }
    public void makeDict(String word){
        String key = "";
        List<String> li = new ArrayList<>();
        for(int i = 0 ; i < word.length() ; i++){
            key = key + word.charAt(i);
            if(!dict.containsKey(key)){
                dict.put(key,li);
            }
        }
        addWordToDict(word);
    }
    private void addWordToDict(String word){
        String key = "";
        List<String> li;

        for(int i = 0 ; i < word.length() ; i++){
            key = key + word.charAt(i);
            li = dict.get(key);
            li.add(word);
            dict.put(key,li);
            li = null;

        }
    }

    public List<String> getList(String word){
        String key = "";
        for(int i = word.length()-1 ; i >= 0 ; i--){
            key = word.substring(0,i+1);
            if(dict.containsKey(key)){
                return dict.get(key);
            }
        }
        return null;
    }

    public void printDictionary(){
        for(String s : dict.keySet()){
            System.out.println("key :"+s);
//            List<String> li = dict.get(s);
//            for(String k : li){
//                System.out.println("key :" + s + " -> "+k);
//            }
        }
    }
}
