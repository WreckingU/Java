package bmicalcam;

/**                  PROGRAM HEADER
 * PROGRAM NAME:
 * PROGRAM PURPOSE:
 * DATE WRITTEN:
 * PROGRAMMER: heldmanb
 */
import java.util.Scanner;

public class BMICalcAM 
{

    public static void main(String[] args) 
    {
        //Setup scanner variable instead of int or string
        Scanner user_input = new Scanner(System.in);
        
        //Grab's user's height in inches
        String height;
        System.out.println("What is your height in inches: ");
        height = user_input.next();
        
        Double d = new Double(height);
        double heightNum = d.parseDouble(height);
        
        System.out.println("3 * user's height in inches is: " + heightNum * 3);
    }

}
