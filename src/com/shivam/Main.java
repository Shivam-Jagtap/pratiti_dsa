package com.shivam;

import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        MyLinkedList list = new MyLinkedList();
//        Employee e1 = new Employee(1,"shivam",2000000);
//        Employee e2 = new Employee(2,"sanket",1500000);
//        Employee e3 = new Employee(3,"vasim",1200000);
//        Employee e4 = new Employee(4,"omkar",100000);
//        Employee e5 = new Employee(5,"suyesha",100000);
//
//        list.add(e2);
//        list.add(e1);
//        list.add(e3);
//        list.printAll();
//        System.out.println("----------------------------------------");
////        list.deleteAtIdx(1);
//        list.deleteFirstNode();
//        list.printAll();
//        System.out.println("----------------------------------------");
//
//        list.insertAt(1,e2);
//        list.printAll();
//        System.out.println("----------------------------------------");
//
//        list.add(e4);
//        list.add(e5);
//        list.deleteLastNode();
//        list.add(e5);
//        list.printAll();
//        System.out.println("----------------------------------------");
//        list.deleteAtIdx(3);
//        list.printAll();
//
//        System.out.println("---------------------------------------");
//        System.out.println("saving to file");
//        serializeFile(list);
//
//        System.out.println("------------------------------------------");
//        System.out.println("deserializing");
//        MyLinkedList gotList = deserialize();
//        gotList.printAll();

//        BusBooking bus = new BusBooking();
//        bus.printSeats();
//        System.out.println("----------------------------------");
//        System.out.println(bus.bookSeat(1,4));
////        System.out.println(bus.bookSeat(1,3));
//        System.out.println(bus.bookSeat(1,2));
////        System.out.println(bus.bookSeat(1,4));
//        System.out.println(bus.bookSeat(2,4));
//        System.out.println(bus.bookSeat(3,4)
//         );

//        bus.printSeats();
//        bus.printMap();
//        ----------------------------------------------------------------------------

//        Recursion r = new Recursion();
//        long start = System.nanoTime();
//
//        System.out.println("5 :" + r.factorial(7));
//        System.out.println((System.nanoTime()-start)/1000000);

//        ----------------------------------------------------------------------------
//        int a[] = { 13, 18, 27, 2, 19, 25 };
//        int n = a.length;
//        System.out.println("\nBefore sorting array elements are - \n");
//        QuickSort q1 = new QuickSort();
//        q1.printArr(a, n);
//        System.out.println("First time quick - non recursive...");
//        q1.quick(a, 0, n - 1);
//        System.out.println("\nAfter sorting array elements are - \n");
//        q1.printArr(a, n);
//        System.out.println();
//        ------------------------------------------------------------------------

//        Dictionary dict = new Dictionary();
//        dict.makeDict("hello");
//        dict.makeDict("hell");
////        dict.printDictionary();
//        List<String> li = dict.getList("hel");
//        for(String s : li){
//            System.out.println(s);
//        }

//        -----------------------------------------------------------------------------

//        MyString s = new MyString("Shivam Jagtap ");
//        System.out.println("s : " +s);
//        System.out.println("---------------------");
//        System.out.println("substring : "+s.subString(0,3));
//        System.out.println("---------------------");
//        System.out.println("Lower case : "+s.toLowerCase());
//        System.out.println("---------------------");
//        System.out.println("Upper case : "+s.toUpperCase());
//        System.out.println("---------------------");
//        System.out.println("char at idx = 5 : "+ s.myCharAt(5));
//        System.out.println("---------------------");
//        System.out.println("substr == vam ? :" + s.findPattern("vam"));

//        ------------------------------------------------------------------------------------
        Graph g = new Graph(5);
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');

        g.addNode(a);
        g.addNode(b);
        g.addNode(c);
        g.addNode(d);
        g.addNode(e);

        g.addEdge('A','B');
        g.addEdge('B','C');
        g.addEdge('C','D');
        g.addEdge('D','A');
        g.addEdge('C','E');

        g.printMap();

    }

//    static void serializeFile(MyLinkedList list) throws IOException {
//        FileOutputStream fs;
//        ObjectOutputStream os;
//
//        fs = new FileOutputStream("employyeList.txt");
//        os = new ObjectOutputStream(fs);
//
//        os.writeObject(list);
//    }
//
//    static MyLinkedList deserialize() throws IOException, ClassNotFoundException {
//        FileInputStream fs = new FileInputStream("employyeList.txt");
//        ObjectInputStream io = new ObjectInputStream(fs);
//
//        Object o = io.readObject();
//        return (MyLinkedList) o;
//    }

}

