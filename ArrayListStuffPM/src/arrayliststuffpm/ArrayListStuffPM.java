package arrayliststuffpm;

/**                  PROGRAM HEADER
 * PROGRAM NAME: Array List Stuff
 * PROGRAM PURPOSE: Demonstrates how ArrayLists work
 * DATE WRITTEN: 10-20-15
 * PROGRAMMER: heldmanb
 */

import java.util.ArrayList;

public class ArrayListStuffPM 
{

    public static void main(String[] args) 
    {
        ArrayList<String> myList = new ArrayList<String>();
        //Create a new string with a word in it
        String s = "Muffin";
        
        //Put that string in the ArrayList by invoking the add() method
        //add() method belongs to the ArrayList class
        myList.add(s);
        
        String b = "Watermelon";
        myList.add(b);
        
        //size() method belongs to the ArrayList class
        int theSize = myList.size();
        System.out.println("The size of myList is: " + theSize);
        
        //Find out if the ArrayList contains something
        //contains() method is a member of the ArrayList class
        boolean isIn = myList.contains("Water");
        System.out.println("Does the ArrayList contain 'water'?" + isIn);
        
        //indexOf() method finds the index of a particular element in ArrayList
        int idx = myList.indexOf(b);
        System.out.println("Index if ArrayList element 'b' is: " + idx);
        
        //For more info on ArrayList check the online API
        //isEmpty() is a method in the ArrayList class
        boolean empty = myList.isEmpty();
        System.out.println("Is the ArrayList empty?" + empty);
        
        //remove() method is a method in the ArrayList class
        myList.remove(s); //remove the very first item from ArrayList
        System.out.println("Removed element 's' from the ArrayList");
        
        
    }

}
