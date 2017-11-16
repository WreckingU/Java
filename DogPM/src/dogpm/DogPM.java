package dogpm;

/**                  PROGRAM HEADER
 * PROGRAM NAME: Dog
 * PROGRAM PURPOSE: Demonstrates instantiating objects from a superclass
 * DATE WRITTEN: 9-2-15
 * PROGRAMMER: heldmanb
 */

//class declaration
public class DogPM 
{
    //Class-level variables
    int weight;
    String breed;
    String name;
    static int randNum = (int) (Math.random() * 10);
    
    public static void main(String[] args) 
    {
        // Instantiate a dog object by calling the DogPM class constructor
        //  data type   name   invoke class constructor
        DogPM dog1 = new DogPM();
        
        //Assign the dog1 object property values
        dog1.name = "Fido";
        dog1.breed = "Poodle";
        dog1.weight = 12;
        
        //Call the dog1 object method
        dog1.bark(randNum);
        
        //display dog1's properties
        System.out.println("Dog1's name is: " + dog1.name);
        System.out.println("Dog1's breed is: " + dog1.breed);
        System.out.println("Dog1's size is: " + dog1.weight);
        
        //Declare an array of dogs
        DogPM[] myDogs = new DogPM[3];
        
        //Build the dogs from array - call class constructor for each dog
        myDogs[0] = new DogPM();
        myDogs[1] = new DogPM();
        myDogs[2] = new DogPM();
        
        //Instantiate some dog objects
        myDogs[0].name = "Data";
        myDogs[1].name = "Bowser";
        myDogs[2].name = "Fifi";
        
        myDogs[0].breed = "Lab";
        myDogs[1].breed = "Shepherd";
        myDogs[2].breed = "Poodle";
        
        myDogs[0].weight = 36;
        myDogs[1].weight = 90;
        myDogs[2].weight = 15;
        
        myDogs[0].bark(randNum);
        
        System.out.println("My 3rd dog's name is: " + myDogs[2].name);
        
        //Use a while loop to iterate through the dogs
        //Declare a variable to act as a counter
        int x = 0; //starting value
        while(x < myDogs.length)
        {
            System.out.println("The dog's name is: " + myDogs[x].name);
            System.out.println("The dog's breed is: " + myDogs[x].breed);
            System.out.println("The dog's size is: " + myDogs[x].weight);
            
            //Invoke the bark() method
            myDogs[x].bark(randNum);
            
            //Increment x
            x++; //increment operator
        }      
    } //end of the main() method
    
    void bark(int numOfBarks)
    {
        while(numOfBarks > 0)
        {
            if(weight > 60)
            {
                System.out.println("Woof! Woof!");       
            }
            else if(weight > 20 && weight <= 59)
            {
                System.out.println("Ruff! Ruff!");
            }
            else
            {
                System.out.println("Yip! Yip!");       
            }        
            numOfBarks--;    
        }
    }

} //end of the DogPM class
