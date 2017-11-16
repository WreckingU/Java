package moonlandingpm;

/**                  PROGRAM HEADER
 * PROGRAM NAME: Moon Landing
 * PROGRAM PURPOSE: Demonstrates a moderately complex Java game
 * DATE WRITTEN: 11-30-15
 * DATE COMPLETED:
 * PROGRAMMER: heldmanb
 */

//Import directives
import javax.swing.*; //Maybe consider a PluralSight swing class?
import java.awt.*; //Maybe consider a PluralSight AWT class?
import java.awt.event.*;

public class MoonLandingPM extends JFrame
{
    //Class-level variables go here

    public static void main(String[] args) 
    {
        // Call the MoonLandingPM constructor
        // by creating a frame
        new MoonLandingPM().setVisible(true);
        
    } // End of main() method
    
    //MoonLandingPM class constructor
    public MoonLandingPM()
    {
        // frame construction
        setTitle("Moon Landing");
        setResizable(false); //Ma Kettle CANNOT re-size game
        
        //Set up a listener for when Ma Kettle decides to close the window
        addWindowListener(new WindowAdapter()
        {
            //If the window event fires off (e.g. Ma Kettle closes window)
            public void windowClosing(WindowEvent evt)
            {
                //Call a method that deals with window closing
                exitForm(evt);
            }
       
        });
        
        //Build the frame
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints;
        
        pack();
        
        //Set up the screen size for the game
        //Restrict the game to exactly 1/2 of the screen size
        //vertically and horizontally
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        setBounds((int) (0.5 * (screenSize.width - getWidth())),
                  (int) (0.5 * (screenSize.height - getHeight())),
                  getWidth(),
                  getHeight());
    } //End of the MoonLandingPM class constructor
    
    //Class-level methods
    private void exitForm(WindowEvent evt)
    {
        System.exit(0);
    }
    
    //End class-level methods
    
    

} //End of the MoonLandingPM class
