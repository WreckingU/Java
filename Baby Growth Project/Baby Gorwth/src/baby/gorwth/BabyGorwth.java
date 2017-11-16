 /* PROGRAM HEADER
 *PROGRAM NAME: 99 bottles of root beer
 *Program Purpose: Demonstrates While Loops
 *Date: 8-20-15
 *Programmer: Kyle Coffey
 * @author coffeyk
 */
package baby.gorwth;

public class BabyGorwth
{

  
    public static void main(String[] args) 
    {
                int BabyS = 20; // Int data
                int Month;
                int Day;
                int Year;
                Month = 1;
                Day = 1;
                Year = 15;
                String word = "Baby Growth = "; //new data type string
                
                {
                System.out.println("Baby DOB is " + Month + "/" + Day + "/" + Year);
                System.out.println("Starting Height = " + BabyS + "in" );
                System.out.println("Baby Age is " + Month * 4 + "/" + Day + "/" + Year);
                BabyS += BabyS * 0.10;
                System.out.println("New Height = " + BabyS + "in" );
                Month += Month * 3;
                BabyS += BabyS * 0.10;
                System.out.println("New Height = " + BabyS + "in" );
                
                
                }
     
    }
    
}



/*
    {
        // Delcare and initalize a memory variable
        int beerNum = 99; // Int data
        String word = "bottles"; //new data type string
        while(beerNum > 0)
        {
            
        if(beerNum == 99)
        
        {
        System.out.println(beerNum + " " + word + " of root beer on the wall");
        System.out.println(beerNum + " " + word + " of root beer");
        }
        
    
        else
        
        //display output
        System.out.println(beerNum + " " + word + " of root beer");
        
        
        System.out.println("You Take One Down...");
        
        System.out.println("You Pass it around...");
        
        System.out.println(beerNum -1 + " " + word + " of root beer on the wall");
        
        System.out.println();
        
        //Decrement number of bottles by 1
        //poor man's way
        //beerNum = beerNum -1;
       
        //Short Way
        beerNum -= 1;
        
        //Logic to correct string if only one bottle
            if (beerNum == 1) 
        {
           word = "bottle";
        }    
        
        
        //No more bottles
        if(beerNum > 0)
        
        {
        System.out.println(beerNum + " " + word + " of root beer on the wall");
        }
         else
        {
            System.out.println("No more bottles of root beer!");
        }
        }
*/