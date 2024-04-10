package com.shivam;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    ArrayList<Node> nodes;
    int[][] edges ;
    HashMap<Character,Integer> map ;
    int counter ;

    public Graph(int size){
        nodes = new ArrayList<>();
        edges = new int[size][size];
        map = new HashMap<>();
        counter = 0;
    }
    public void addNode(Node node){
        nodes.add(node);
        map.put(node.getData(),counter++);
    }

    public void addEdge(char src, char dst){
        int s = getInt(src);
        int d = getInt(dst);

        edges[s][d] = 1;
    }

    private int getInt(char a){
       return map.get(a);
    }

    public boolean checkEdge(char src , char dest){
        if(edges[getInt(src)][getInt(dest)] == 1) return true;

        return false;
    }

    public void printMap(){
        System.out.print("  ");
        for(int i = 0 ; i < nodes.size() ; i++){
            System.out.print(nodes.get(i).getData()+ " ");
        }
        System.out.println();
        for(int i = 0 ; i < edges.length ; i++){
            System.out.print(nodes.get(i).getData()+" ");
            for(int j = 0 ; j < edges[0].length ; j++){
                System.out.print(edges[i][j]+ " ");
            }
            System.out.println();
        }
    }

}

class Node{
    private char data;
    public Node(char d){
        this.data = d;
    }
    public char getData(){
        return this.data;
    }

}
