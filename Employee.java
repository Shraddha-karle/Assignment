package com.company;

public class Employee {
    int empid;
    String name;
    static String company="tcs";

    Employee(int empid,String name){
        this.empid=empid;
        this.name=name;

    }

    void display()
    {
        System.out.println(empid+" "+name+" "+company+" ");
    }

    public static void main(String[] args) {
        Employee e1=new Employee(1,"Shraddha");
        Employee e2=new Employee(2,"soham");
        e1.display();
        e2.display();
    }
}
