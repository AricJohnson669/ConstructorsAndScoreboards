import greenfoot.*;

/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Actor
{
    
    //Create a constructor for Cat that DOES take an integer as a parameter
    //If the parameter given is 1, make the cat show up as pixelCat1.gif
    //If the parameter given is 2, make the cat show up as pixelCat2.png
    //If the parameter given is 3, make the cat show up as pixelCat3.png
    
    //A constructor starts with the word public (for our purposes)
    //has NO return type (ie. void, int, boolean, etc)
    //has the same name as the class (in this case, "Cat")
    //has round brackets at the end that may or may not have parameters inside of them
    
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkKeys();
        checkForFood();
    }    
    
    private void checkForFood()
    {
        if(isTouching(Food.class))
        {
            removeTouching(Food.class);
            //call the method update from the KittyWorld class
        }
    }
    
    private void checkKeys()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2, getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2, getY());
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-2);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+2);
        }
    }
    
    
}
