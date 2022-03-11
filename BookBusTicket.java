
package com.company;
import java.util.*;

public class BookBusTicket {
    int total_seats=50;
    synchronized void bookticket(int seats){

        if(total_seats>=seats){
            System.out.println("Booked successfully ");
            total_seats=total_seats-seats;
            System.out.println("Seats left "+total_seats);
        }
        else{
            System.out.println("Seats cannot be booked ");
        }
    }
}
class ticketApp extends Thread{
     static BookBusTicket b;
    int seat;

    public void run(){
        b.bookticket(seat);
    }

    public static void main(String[] args) {
        b=new BookBusTicket();
        ticketApp Shraddha=new ticketApp();
        Shraddha.seat=50;
        Shraddha.start();

        ticketApp Jay=new ticketApp();
        Jay.seat=5;
        Jay.start();
    }
}
