package modulusam;

/**                  PROGRAM HEADER
 * PROGRAM NAME: Modulus
 * PROGRAM PURPOSE: Demonstrates the use of the modulus operator
 * DATE WRITTEN: 8-27-15
 * PROGRAMMER: heldmanb
 */
public class ModulusAM 
{

    public static void main(String[] args) 
    {
        //Declare a random number for roll of die
        int randomNumber = (int) (Math.random() * 10);
        
        
        //Use modulus to force looking at only 0 through 5
        randomNumber = randomNumber % 6 + 1;
        
        
        //Test to see if working
        System.out.println("The current random number is: " + randomNumber);
        
        //Determine if a number is even or odd
        int randomNumber2 = (int) (Math.random() * 1000);
        
        if(randomNumber2 % 2 == 0) //even
        {
            System.out.println("The number: " + randomNumber2 + " is even.");
        }
        else //it's odd
        {
            System.out.println("The number: " + randomNumber2 + " is odd.");
        }
        
        
        
    }

}
