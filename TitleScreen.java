import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author (your name) 
 * @version (2025 - 11 -28)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 350, 100);
        prepare();
    }

    public void act()
    {
        // Start the game if user presses the spacebar
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
        addObject(elephant,100,88);
        Label label = new Label("Use < ← and → > to Move", 40);
        addObject(label,209,206);
        label.setLocation(254,208);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,236,303);
        label2.setLocation(263,289);
        label.setLocation(364,208);
        label2.setLocation(430,277);
        label2.setLocation(331,276);
        label2.setLocation(350,277);
    }
}
