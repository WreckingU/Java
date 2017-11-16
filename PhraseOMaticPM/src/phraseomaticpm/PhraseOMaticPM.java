package phraseomaticpm;

/**                  PROGRAM HEADER
 * PROGRAM NAME: Phrase-O-Matic
 * PROGRAM PURPOSE: Demonstrates arrays and random numbers
 * DATE WRITTEN: 8-25-15
 * PROGRAMMER: heldmanb
 */
public class PhraseOMaticPM 
{

    public static void main(String[] args) //method
    {
        // Create three sets of words
        //Declare an array for each of the three sets
        
        String[] wordListOne = 
        {
            //Initialize the array  
            "24/7", //array element 0
            "Multi-Tier",
            "30,000 foot",
            "Software as a Service",
            "win-win",
            "frontend",
            "web-based",
            "pervasive",
            "smart",
            "six-sigma",
            "critical-path",
            "dynamic",
            "agnostic",
            "scintillating"
        };
        
        String[] wordListTwo = 
        {
            //Initialize the array  
            "empowered", //array element 0
            "sticky",
            "value-add",
            "oriented",
            "centric",
            "distributed",
            "clustered",
            "branded",
            "outside the box",
            "positioned",
            "networked",
            "focused",
            "leveraged",
            "aligned",
            "targeted",
            "shared",
            "cooperative",
            "accelerated"
        };
        
        String[] wordListThree = 
        {
            //Initialize the array  
            "process", //array element 0
            "tipping-point",
            "solution",
            "architecture",
            "core competency",
            "strategy",
            "mind-share",
            "portal",
            "space",
            "vision",
            "paradigm",
            "mission"
            
        };
        
        //Find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        //Test to make sure that it's working
        //System.out.println("oneLength is: " + oneLength + " words long.");
        //System.out.println("twoLength is: " + twoLength + " words long.");
        //System.out.println("threeLength is: " + threeLength + " words long.");
        
        //Generate three random numbers
        //Because we have decimals and DON'T want them, we have to
        //CAST our random number as an int
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        
        //Test to make sure that it's working
        //System.out.println("rand1 is: " + rand1);
        //System.out.println("rand2 is: " + rand2);
        //System.out.println("rand3 is: " + rand3);
        
        //Build the phrase
        String phrase = 
                wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " +
                wordListThree[rand3];
        
        //Print out the phrase
        System.out.println("Geez Bob! That's a " + phrase + "!");
        
    }

}
