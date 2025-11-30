import java.util.Scanner;

/**
 * Write a description of class CinemaTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CinemaTicket
{
    public static void main (String[]args){
    
    Scanner input = new Scanner (System.in);
    
    double bp =  0;
    
    System.out.println("Enter the age:");
    String age = input.next();
    
    System.out.println("Enter the movie language:");
    String lan = input.next();
    
    System.out.println(" Are you student? ");
    String s = input.next();
    
    System.out.println(" Festivals?");
    String f = input.next();
    
    switch (age){
    
    case "Child":
        bp = 150; break;
    case "Adult":
       bp= 250;break;
    case "Senior":
        bp = 200;break;
        
     default:
         System.out.println("Invalid age group entered.");
     return;
    }
    
    if (lan.equalsIgnoreCase ("Hindi"))
    {
        bp += 50;
    }
    else if (lan .equalsIgnoreCase ("English"))
    {
        bp += 100;
    }
    
      if (s.equalsIgnoreCase("Yes")) {
            System.out.println("You are eligibe for student discounts.");
            bp -= bp*0.2; 
        } else {
            System.out.println("You are not eligibe for student discount.");
        }
    
    
    if (f.equalsIgnoreCase("Yes")) {
            System.out.println("Festival discounts.");
            bp -= bp*0.15; 
        } else {
            System.out.println(" No festival discounts.");
        }
        
     System.out.print ("The final price of ticket is  " +"RS."+ +bp);
    
    
    }
}
