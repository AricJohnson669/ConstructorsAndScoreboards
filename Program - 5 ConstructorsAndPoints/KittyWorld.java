import greenfoot.*;

/**
 * Write a description of class KittyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KittyWorld extends World
{
    //create a Scoreboard variable that we will store a Scoreboard in later
    private Scoreboard score;

    /**
     * Constructor for objects of class KittyWorld.
     * 
     */
    public KittyWorld()
    {    
        // Create a new world with 400x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1); 
        
        //Add 3 food objects for the cats to eat somewhere in the world
        
        //Add a default Cat in the bottom-right corner of the world
        
        //Add a Cat to the world in the center. Make sure to tell the Cat whether it should show up as image 1, 2 or 3
        
        //Add a scoreboard object to the world in the top left hand corner.
        //Make sure to store this as an instance variable so you have access to it later.
    }
    
    //create a public method called update that does not return anything and does not accept any parameters
    //This method will call addToScore from the scoreboard object we stored earlier,
    //and add a point to that scoreboard
}
