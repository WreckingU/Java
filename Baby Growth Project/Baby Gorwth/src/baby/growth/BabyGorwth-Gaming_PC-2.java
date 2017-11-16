 /* PROGRAM HEADER
 *PROGRAM NAME: Baby Growth
 *Program Purpose: Demonstrates incremental growth
 *Date: 8-20-15
 *Programmer: Kyle Coffey
 *My Computer User Name: @author coffeyk
 */

//Rules


//Conver In to Ft and Leave remainder as in EX = 7ft 2in

package baby.growth;

public class BabyGorwth
{
    
  public static void main(String[] args)
            
{
                double BabyS = 10; //Any thing below 10 breaks program
                int FMonth;
                int Month;
                int Day;
                int Year;
                double GrowH;
                
                GrowH = .025;
                Month = 0;
                FMonth = 1;
                Day = 1;
                Year = 2015;
                
                                
                
                System.out.println("Baby DOB is " + FMonth + "/" + Day + "/" + "2015");
                System.out.println("Starting Height = " + BabyS + "in");
               
        while (BabyS < 80) 
        {
            
        
        
                System.out.println();// The Space                
                
                Month = Month + 3; // Month Mutliplyer
                                            
                System.out.println("On " + Month + "/" + Day + "/" + Year) ; // Date

                int roundedInputGrew = (int) Math.round(BabyS * GrowH * 100);
                double floatOutputGrew = roundedInputGrew / 100.0; 
                
                System.out.println("Grew " + floatOutputGrew + "in"); //Growth Height
                
                //int roundedInputGrew = (int) Math.round(BabyS * GrowH * 100);
                //double floatOutputGrew = roundedInputGrew / 100.0; 
                                
                BabyS += (BabyS * (0.025) ); //Anything below 0.10 will break the program 
                
                int roundedInput = (int) Math.round(BabyS * 100);
                double floatOutput = roundedInput / 100.0;  
                
                
                //double babyFeet = BabyS /12;
                
                //System.out.println("Total Height in inches = " + floatOutput + " in" ); // Total Height in inches
                
                double feet = floatOutput % 12;
                //System.out.println("The remainder of feet is: " + Math.round(feet));
                
                //System.out.println("Total Height = " + feet + "ft " + (- feet * 12) + "in" ); // Total Height in feet
                System.out.println("Total Height in Inches = " + floatOutput + " in"); // Total Height in feet
                System.out.println ("Total Height in Feet = " + Math.round(feet)); 
                
                                
        if(Month == 12)
        {
        Month = 0;
        Year = Year + 1;
        }


        if(BabyS > 80)
        {
        System.out.println("He grew up!");
        }
                
        }// While Loop
        }

}