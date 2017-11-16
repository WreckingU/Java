package memvars;

/**                  PROGRAM HEADER
 * PROGRAM NAME:
 * PROGRAM PURPOSE:
 * DATE WRITTEN:
 * PROGRAMMER: heldmanb
 */
public class MemVars 
{

    public static void main(String[] args) 
    {
        // My code goes here
        System.out.println("Fun with memory variables");
        
        //Declare a var without initializing it
        int firstNum;
        //Declare & intialize a variable
        int secondNum = 134;
        
        firstNum = 2035;
        
        //Same thing as firstNum = firstNum + secondNum;
        firstNum += secondNum;
        
        //Output the data
        System.out.println("The sum of " + secondNum + " + " + firstNum + " is: " + (firstNum + secondNum));
        
        //Ma Kettle changes data
        firstNum = -4044;
        
        System.out.println("The sum of " + secondNum + " + " + firstNum + " is: " + (firstNum + secondNum));
        
        //Float variable
        double myPi = 3.14159264;
        
        double someNum = 637.2554;
        
        System.out.println("The product of " + myPi + " x " + someNum + " is: " + (myPi * someNum));
        
        //Logical memvar
        boolean yezNo;
        
        yezNo = false;
        
        System.out.println("The value of yezNo is: " + yezNo);
        
        
        
        
        
        
    }

}
