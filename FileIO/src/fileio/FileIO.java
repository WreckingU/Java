package fileio;

/**                  PROGRAM HEADER
 * PROGRAM NAME: FileIO
 * PROGRAM PURPOSE: 1st - learn how to read a file,
 * 2nd - to win the CodeQuest competition!!
 * DATE WRITTEN: 8-26-15
 * PROGRAMMER: heldmanb
 */

import java.io.*;

public class FileIO 
{

    public static void main(String[] args) 
    {
        //Get the file
        String fileName = "Prob02.in.txt";
        
        //Reference fille one line at a time
        String line = null;
        
               
        try
        {
            //FileReader reads text files
            
            //Instantiate a new FileReader object
            //data type  variable name    create new fr object
            FileReader fileReader = new FileReader(fileName);
            
            //Also need BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            //Print out the contents of the file
            //Use a while loop for this
            while((line = bufferedReader.readLine()) != null)
            {
                //Codequest code goes here
                System.out.println(line);
            }
             //Always close file
            bufferedReader.close();
            
        }
        catch (IOException ex) //can't find file
        {
            //Tell user there's a problem
            System.out.println(
                "Error reading file '" + fileName + " '");
            //Or, we could just do this:
            //ex.printStackTrace();
                    
        }
    }
}
