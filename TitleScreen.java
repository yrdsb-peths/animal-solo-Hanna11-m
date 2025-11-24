import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Hanna 
 * @version November 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 65);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 300, 100);
        prepare();
    }

    /**
     * The main wrld act loop.
     */
    public void act()
    {
        //Start the game if the user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,306,190);

        Label label = new Label("Use \u2190 \u2192 to Move", 40);
        addObject(label,303,264);

        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,306,314);
    }
}
