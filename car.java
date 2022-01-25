package com.company;

public class car {
    int no;
    String colour;
    static String company="tata";

    car(int no,String colour){
        this.no=no;
        this.colour=colour;
    }
    void display(){
        System.out.println(no+" "+colour+" "+company+" ");
    }

    public static void main(String[] args) {
        car c1=new car(1,"red");
        car c2=new car(2,"blue");
        c1.display();
        c2.display();
    }
}
