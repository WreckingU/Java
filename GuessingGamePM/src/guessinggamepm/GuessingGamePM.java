package guessinggamepm;

/**                  PROGRAM HEADER
 * PROGRAM NAME: Guessing Game
 * PROGRAM PURPOSE: Demonstrates instantiating objects and calling methods
 * DATE WRITTEN: 8-27-15
 * PROGRAMMER: heldmanb
 */
public class GuessingGamePM 
{
    //Class-level variables - universal
    Player p1;
    Player p2;
    Player p3;

    public static void main(String[] args) 
    {
        GuessingGamePM game = new GuessingGamePM();
        game.startGame();
        
    }
    
    public void startGame() //startGame() method
    {
        //Make new players - instantiating new players
        p1 = new Player(); //calling the Player() constructor
        p2 = new Player();
        p3 = new Player();
        
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        
        //Set some flags
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        
        //Generate a random integer number for the players
        int targetNumber = (int) (Math.random() * 10);
        
        while(true)
        {
            //Players are virtual, talk to the human
            System.out.println("Number to guess is " + targetNumber);
            
            //Talk to each player object, get it to guess a number
            p1.guess();
            p2.guess();
            p3.guess();
            
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
            
            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);
            
            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);
            
            //Logic to see if player's guess matches computer's
            if(guessp1 == targetNumber) //boolean - is it true?
            {
                //set our flag
                p1isRight = true;
            }
            if(guessp2 == targetNumber) //boolean - is it true?
            {
                //set our flag
                p2isRight = true;
            }
            if(guessp3 == targetNumber) //boolean - is it true?
            {
                //set our flag
                p3isRight = true;
            }
            
            //logical OR is || (two pipes)
            //logical AND is && (two ampersands)
            if(p1isRight || p2isRight || p3isRight)
            {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break;
            }
            else
            {
                System.out.println("Players will have to try again.");
            }
            
            
        } //end of while loop
    } //end of startGame() method

    public class Player
    {
        int number = 0; //player property
        
        //player method
        public void guess()
        {
            number = (int) (Math.random() * 10);
            System.out.println("I'm guessing a number");
        }
    }
} //end of GuessingGame class
