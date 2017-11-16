/*
 * PROGRAM NAME: 99 Bottles of Root Beer
 * PROGRAM PURPOSE: Demonstrates while loops, memory variables
 * DATE WRITTEN: 8-20-15
 * PROGRAMMER: MR. Heldman
 */
package pkg99bottlesofrootbeer;

public class Main 
{

    public static void main(String[] args) 
    {
        // Declare and initialize a memory variable
        int beerNum = 99; //integer data
        String word = "bottles"; //new data type string
        
        //program logic using while loop
        while(beerNum > 0)
        {
            
            
            //display output
            System.out.println(beerNum + " "
                    + word + " of root beer on the wall");
            
            System.out.println(beerNum + " "
                    + word + " of root beer");
            
            System.out.println("You take one down...");
            
            System.out.println("You pass it around...");
            
            //Decrement number of bottles by 1
            //poor man's way
            //beerNum = beerNum - 1;
            //cool coder's way
            beerNum -= 1;
            
            //logic to correct string if only one bottle
            if(beerNum == 1)
            {
                word = "bottle";
            }
            
            // No more bottles
            if(beerNum > 0)
            {
                
                System.out.println(beerNum + " "
                    + word + " of root beer on the wall\n");
                
            }
            else
            {
                System.out.println("No more bottles of root beer!!");
            }   
        }   
    }   
}
