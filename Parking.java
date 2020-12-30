
package parking;
import java.util.Scanner;
import java.sql.*;
import java.io.*;
public class Parking {

    public static void main(String[] args) {
    System.out.println("Welcome to our parking system");
    System.out.println("1-Want to book a ticket\n2-You are an admin?\n Enter your choise:");
    Scanner input = new Scanner(System.in);
    int choise ;
    String plate_no;
    int id=0;
    int slot =1;
    choise = input.nextInt();
    switch (choise){
        
        case 1:
            System.out.print("Enter your Car number please: ");
            plate_no=input.next();
            Tickets t = new Tickets(id,plate_no);
            System.out.println("Your ticket:");
            System.out.println("Slot number"+slot+"\n"+"Ticket id"+id+"\n"+"Plate number"+t.plate_no()+"\n"+"Date:"+t.date.toString());
            break;
                case 2:
                    System.out.println("Not available yet.");
    }
   
  

    
    }
    
}
