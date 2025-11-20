import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero.
 * 
 * @author Hanna Mao
 * @version November 2025
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("Elephant Sound.mp3");
    GreenfootImage idle = new GreenfootImage("images/elephant_idle/idle_0.png");
    
    /**
     * Constructor - the code that gets run one time when object is created.
     */
    public Elephant()
    {
        setImage(idle);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        
        //Remove apple if elephant eats it
        eat();
    }
    
    /**
     * Eat the apple and spawn new apple if an apple is eaten.
     */
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
