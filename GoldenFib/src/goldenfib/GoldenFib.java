package goldenfib;

/**                  PROGRAM HEADER
 * PROGRAM NAME: GoldenFib
 * PROGRAM PURPOSE: Demonstrates the linkage of GR & Fib series
 * DATE WRITTEN: 11-9-15
 * PROGRAMMER: heldmanb
 */
public class GoldenFib 
{

    public static void main(String[] args) 
    {
        //Call a method called "rec" 94 times
        for(int i = 1; i < 94; i++)
        {
            System.out.println(i + " - " + rec(i));
        }
    }
    
    //Declare a suitable GR number
    static double gr = 1.618033988749895;
    
    static long rec (int i)
    {
        return (long) Math.round(Math.pow(gr , i) / (gr + 2));
    }
    

}
