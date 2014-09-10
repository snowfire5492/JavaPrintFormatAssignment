package classproject;

/**
 * Lab Assignment
 * Kevin's store receipt
 * @author: Eric Schenck
 * @author: Valerie Metzger-Smith
 * @author: Bertha Sanchez
 * Date: September 10 2012
 *
 * Problem Statement: Create a single item cash register. Use the scanner class
 * to get a product name and then the cost of the item and the quantity. 
 *
 * Overall Plan:
 * 1) define integers, double, constant
 * 2) prompt user for item to purchase, cost and quantity
 * 3) calculate formulas
 * 4) print out receipt
 */
//import scanner
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ClassProject {
  
 
     //assigning constant to tax
     public static final double TAX = 0.0775;
      public static final double COUPON = 25.00;
    public static void main(String[] args)  {
     
     //declaring variables
    int qnty, qnty2;
   double cost, sbttl, ftax, ttl, sbttl2, prct;
    String game;
        
        //import keyboard use
        Scanner keyboard = new Scanner(System.in);
        
        
        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
       
        NumberFormat moneyFormatter2 = 
           NumberFormat.getCurrencyInstance(Locale.FRANCE);
           
        DecimalFormat Formatter = new DecimalFormat("00.0%");  
        
        //prompt user for input
        System.out.println("Please enter the name of the product" +
         " of which you want to buy...");
         
        game = keyboard.next();
        
        System.out.println("Now enter the cost of that product");
        
        cost = keyboard.nextDouble();
        
        System.out.println("And how many do you want?");
        
        qnty = keyboard.nextInt();
        
        System.out.println("How many $25 coupons do you have?");
        
        qnty2 = keyboard.nextInt();
        
        //calculate formulas
        sbttl = cost * qnty;
        
        sbttl2 = sbttl - COUPON;
        
        ftax = sbttl2 * TAX;
        
        ttl = ftax + sbttl2;
        
        prct = COUPON / sbttl;
        
        String prct2 = Formatter.format(prct);
        
        
        
        //print out receipt
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                Kevin's Store                    ");
        System.out.println("-------------------------------------------------\n");
        System.out.println("Quantity   Product                   Unit Cost   ");
        System.out.printf("%8d",qnty);
        System.out.printf("%9s",game);
        System.out.print("                    ");
        System.out.println(moneyFormatter.format(cost));
        System.out.printf("%8d",qnty2);
        System.out.println("   Coupon                    " 
               + (moneyFormatter.format(COUPON)));
        System.out.println();
        System.out.print("                    Subtotal:        ");
        System.out.println(moneyFormatter.format(sbttl2));
        System.out.print("                         Tax:        ");
        System.out.println(moneyFormatter.format(ftax));
        System.out.print("                       Total:        ");
        System.out.println(moneyFormatter.format(ttl));
        System.out.print("\nIf your French, then this cost...    ");
     System.out.println(moneyFormatter2.format(cost));
     System.out.println();
     System.out.println("Savings: " + prct2);
    
    }//end of main
}//end of class Lab
