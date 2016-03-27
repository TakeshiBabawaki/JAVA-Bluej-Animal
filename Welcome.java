
/**
 * A class that maintains Welcome informations.
 * 
 * @author (Samir Meneceur.) 
 * @version (15th November 2015.)
 * @Debugging made with BlueJ IDE
 */
public class Welcome
{
    private String info;
    //Field of type String
    /**
     * Constructor for objects of class Welcome
     * Accepting one String parameter
     * Processed with the Animals class
     */
    public Welcome(String welcomeMessage)
    {
       info = welcomeMessage;
       //Value assigned to the "info" field
       //Enable user to pass in a type of welcome message
    }
    
    /**
     * Accessor method to return the value that is stored in "info"
     */public String getInfo()
    {
        return info;
    }
}
    
