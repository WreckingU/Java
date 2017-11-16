package gooddogpm;

/**                  PROGRAM HEADER
 * PROGRAM NAME: GoodDog
 * PROGRAM PURPOSE: Demonstrates data encapsulation
 * DATE WRITTEN: 9-22-15
 * PROGRAMMER: heldmanb
 */
public class GoodDogPM 
{
    //Instance variables - always declared as PRIVATE
    private int weight;
    
    //Getter - setters & getters are always PUBLIC
    public int getWeight()
    {
        return weight;
    }
    
    public void setWeight(int w)
    {
        weight = w;
    }
    
    //bark() method
    void bark()
    {
        if(weight >= 60)
        {
            System.out.println("Woof! Woof!");
        }
        else if(weight > 14 && weight < 59)
        {
            System.out.println("Ruff! Ruff!");
        }
        else
        {
            System.out.println("Yip! Yip!");
        }
    }   
    

    public static void main(String[] args) 
    {
        
        GoodDogPM one = new GoodDogPM();
        one.setWeight(75);
        
        GoodDogPM two = new GoodDogPM();
        two.setWeight(45);
        
        //Have the system shows us the dogs' weight
        System.out.println("Dog one: " + one.getWeight());
        System.out.println("Dog two: " + two.getWeight());
        
        one.bark();
        two.bark();
    }

}
