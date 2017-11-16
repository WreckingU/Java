package dieroller;

/**                  PROGRAM HEADER
 * PROGRAM NAME: DieRoller
 * PROGRAM PURPOSE: Demonstrates the modulus operator
 * DATE WRITTEN: 8-26-15
 * PROGRAMMER: heldmanb
 */
public class DieRoller 
{

    public static void main(String[] args) 
    {
        double randomNumber = (Math.random() * 100);
        int die = (int) (randomNumber % 6)  + 1; //return remainder
        
        System.out.println("The random number is: " + randomNumber);
        System.out.println("The dice number is: " + die);
        
        int evenOdd = (int) (randomNumber % 2); // decide if even or odd
        System.out.println("The number is: " + evenOdd);
        
        //Clock work  - use %12
        
        
        
        
        
    }

}
