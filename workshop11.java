import java.util.Scanner;

/**
 * Write a description of class workshop11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop11
{

    public static void main (String[] args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your yearly income(NPR): ");
        double i = input.nextDouble();
        
        double t;
        
        if(i <= 500000){
        t = i * 0.01;
        }
        else if(i <= 700000){
        t = 500000 * 0.01 + (i - 500000) * 0.1;
        }
        else if(i <= 1000000){
        t = 500000 * 0.01 + 200000 * 0.1 + (i - 700000) * 0.2;
        }        
        else if(i <= 2000000){
        t = 500000 * 0.01 + 200000 * 0.1 + 300000 * 0.2 + (i - 1000000) * 0.3;
        }        
        else if(i <= 5000000){
        t = 500000 * 0.01 + 200000 * 0.1 + 300000 * 0.2 + 1000000 * 0.3 + (i - 2000000) * 0.36;
        }
        else{
        t = 500000 * 0.01 + 200000 * 0.1 + 300000 * 0.2 + 1000000 * 0.3 + 3000000 * 0.36 + (i- 5000000) * 0.39;
        }
        System.out.println("Your tax amount is: NPR."+t);
    }
}
