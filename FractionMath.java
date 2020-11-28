
//Santiago Fleiderman
//CSc 2010, Principles of Computer Science
//Spring 2014
//Assignment 5; Programming Objects
// Add, Subtract,Multiply fractions testfraction
//03-04-2014
import java.util.Scanner;
public class FractionMath {
    public static void main(String[] args) {
    	
    	

    	Scanner sc=new Scanner(System.in);
    	System.out.print( "Type your first fraction: " );
    	//type it without a division symbol make sure to type each number individually then enter 
    	int numerator=sc.nextInt();
    	int denominator=sc.nextInt();

    	Scanner pc=new Scanner(System.in);
    	System.out.print( "Type your second fraction: " );////type it without a division symbol make sure to type each number individually then enter 
      int  num=sc.nextInt();
    	int denom=sc.nextInt();
        //This program performs arithmetic operations on" +

        System.out.println();   
        Fraction f=new Fraction( numerator, denominator);
        Fraction f2=new Fraction(num,denom);

       

        System.out.println();  

        Fraction f3 = f.add(f2); 
        System.out.println("Sum: " + f3.getNumerator() + "/" +
                           f3.getDenominator());

        f3 = f.subtract(f2);      
        System.out.println("Difference: " + f3.getNumerator() + "/" +
                           f3.getDenominator());

        f3 = f.multiply(f2);      
        System.out.println("Product: " + f3.getNumerator() + "/" +
                           f3.getDenominator());

        f3 = f.divide(f2);       
        System.out.println("Quotient: " + f3.getNumerator() + "/" +
                           f3.getDenominator());
    }
}