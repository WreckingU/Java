/*
 * PROGRAM NAME: 99 Bottles of Root Beer on the Wall (bottle99.java)
 * PROGRAM PURPOSE: Demonstrates while loops
 * DATE WRITTEN: 8-21-15
 * PROGRAMMER: Mr. Heldman
 */
package bottles99;

public class Bottles99 
{
    public static void main(String[] args) 
    {
        //Declare and initialize two memory variables
        //int DOES NOT show decimals!
        int beerNum = 99;
        double numberOfBottles = 99.0;
        String word = "bottles";
        
        //while loop
        while (beerNum > 0) // there are still bottles left
        {
            
            
            //Print out the song verses
            System.out.println(beerNum + " " + word + " of root beer on the wall");
            System.out.println(beerNum + " " + word + " of root beer");
            System.out.println("You take one down...");
            System.out.println("You pass it around...");
            
            //Decrement the number of bottles by 1
            //poor man's way
            //beerNum = beerNum - 1;
            //cool coder's way of doing decrements
            beerNum -= 1;
            
            if(beerNum == 1)
            {
                //If down to one bottle, change to "bottle" not
                //"bottles"
                word = "bottle";
            }
            
            //Test to see if we're out of root beer
            if(beerNum > 0) //still bottles left
            {
                //start repeating the verse
                System.out.println(beerNum + " " + word + " of root beer on the wall");
            }
            else
            {
                System.out.println("No more bottles of root beer left!!");
            }
        } //end while loop
    } //end main method
} //end class
