package com.shivam;

import java.io.FileOutputStream;
import java.io.Serializable;

class MyLinkedList implements Serializable{
    Employee head = null;
    Employee current = null;

    void add(Employee e) {
        if(head==null) {
            head = e;
            current = e;
            head.next = null;
            head.prev = null;
        }else {
            current.next = e;
            e.prev = current;
            current = e;
        }
    }

    void printAll() {
        Employee temp = head;
        while(temp!=null) {
            System.out.println(temp.show());
            temp = temp.next;
        }
    }

    void insertAtStart(Employee e) {
        head.prev = e;
        e.next = head;
        head = e;
    }

    void insertAt(int number, Employee e) {
        Employee temp = head;
        while(number!=0) {
            temp = temp.next;
            number--;
        }
        e.prev = temp.prev;
        temp.prev.next = e;
        e.next = temp;
        temp.prev = e;
    }

    void deleteFirstNode() {
        head = head.next ;
        head.prev.next = null;
        head.prev = null;
    }

    void deleteLastNode(){
        current = current.prev;
        current.next.prev = null;
        current.next = null;
    }

    void deleteAtIdx(int idx){
        Employee temp = head;

        while(idx > 0){
            temp = temp.next;
            idx--;
        }

        if(temp.prev == null){
            this.deleteFirstNode();
        }else if(temp.next == null){
            this.deleteLastNode();
        }else{
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }
    void deleteAll(){
        Employee temp = null;
        while(head != null){
            head.prev = null;
            temp = head;
            head = head.next;
            temp.next = null;
        }
    }
    Employee getHead(){
        Employee e = head;
        return e;
    }

}


class Employee implements  Serializable{
    private long empNumber;
    private String empName;
    private float empSalary;

    Employee next;
    Employee prev;

    public long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(long empNumber) {
        this.empNumber = empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }

    public Employee() {
        super();
    }

    public Employee(long empNumber, String empName, float empSalary) {
        super();
        this.empNumber = empNumber;
        this.empName = empName;
        this.empSalary = empSalary;
    }


    public String show() {
        return "Employee [empNumber=" + empNumber + ", empName=" + empName + ", empSalary=" + empSalary + ", next="
                + next + ", prev=" + prev + "]";
    }
}