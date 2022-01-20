package com.company;
import java.util.*;
import java.io.Serializable;
public abstract class Shapes {
    abstract double CalculateArea();
}
class Rectangle extends Shapes{
    int l;int b;
    public Rectangle(int l, int b){
        this.l=l;
        this.b=b;
    }

    @Override
    double CalculateArea() {
        return (l*b);
    }
}
class Square extends Shapes{
    int side;
    public Square(int side){
        this.side=side;
    }

    @Override
    double CalculateArea() {
        return side*side;
    }
}
class Triangle extends Shapes{
    int base; int height;
    public Triangle(int base, int height){
        this.base=base;
        this.height=height;
    }

    @Override
    double CalculateArea() {
        return (0.5*base*height);
    }
}
class Circle extends Shapes{
    int r;
    public Circle(int r){
        this.r=r;
    }

    @Override
    double CalculateArea() {
        return (3.14*r*r);
    }
}
class Shapes1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {

            System.out.println("1.Rectangle");
            System.out.println("2.Square");
            System.out.println("3.Triangle");
            System.out.println("4.Circle");
            System.out.println("5.Exit");
            System.out.println("ENTER THE CHOICE ");
            ch = sc.nextInt();
            Shapes Shapes1;
            switch (ch) {
                case 1:
                    System.out.println("Enter length and breadth ");
                    int l = sc.nextInt();
                    int b = sc.nextInt();
                    Shapes1 = new Rectangle(l, b);
                    System.out.println("The area of Rectangle is " + Shapes1.CalculateArea());
                    break;
                case 2:
                    System.out.println("Enter the side ");
                    int side = sc.nextInt();
                    Shapes1 = new Square(side);
                    System.out.println("The area of Square is " + Shapes1.CalculateArea());
                    break;
                case 3:
                    System.out.println("Enter the base and height ");
                    int base = sc.nextInt();
                    int height = sc.nextInt();
                    Shapes1 = new Triangle(base, height);
                    System.out.println("The area of Triangle is " + Shapes1.CalculateArea());
                    break;
                case 4:
                    System.out.println("Enter the radius ");
                    int r = sc.nextInt();
                    Shapes1 = new Circle(r);
                    System.out.println("The area of Circle is " + Shapes1.CalculateArea());
                    break;
                case 5:
                    System.out.println("EXIT");
                default:
                    System.out.println("Invalid choice ");
                    break;
            }


        } while (ch > 6) ;
    }
}
