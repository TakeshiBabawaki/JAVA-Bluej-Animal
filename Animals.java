


/**
 * A class that maintains Animals informations.
 * 
 * @author (Samir Meneceur.) 
 * @version (15th November 2015.)
 * @Debugging made with BlueJ IDE
 */

public class Animals
{
    /**
     * private field of the class Animals
     */
    private String [] animalNames;//Field to be set up with an array of size 4
    private Welcome welcome;//Field of type Welcome
    

    /**
     * Constructor for objects of the class Animals
     * Process an external method call with the Welcome class
     */
    public Animals(String welcomeMessage)
    {
        // Constructor initialising all fields
        animalNames = new String[4];//Object
        
        welcome = new Welcome(welcomeMessage);//Object
        
        System.out.println(welcome.getInfo());//Accessor method to print of the Welcome class
        
        populateNames();
        
    }
    /**
     * method to insert in order 4 animal names in the array
     */
    private void populateNames()//Internal method call
    {
        animalNames[0]= "Dog";
        animalNames[1]= "Cat";
        animalNames[2]= "Horse";
        animalNames[3]= "Goat";
        
        System.out.println("The animalNames array has been successfully populated.");
        //Display the result of the array to the user 
    }
    
    public void printAnimals()//Method to print in a loop all animal names
    {
        for(int i = 0; i < 4; i++)
        {
        System.out.println("Number " + (i+1) + " animal in my program is a " + animalNames[i]);
        //Message to be printed in the console window
    }
    
    }
}
