import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant.
 * 
 * @author Hanna Mao 
 * @version November 2025
 */
    public class Apple extends Actor
    {
        public Apple()
        {
            GreenfootImage ap = getImage();
            ap.scale(ap.getWidth()/5, ap.getHeight()/5);
            setImage(ap);
        }
        
        int speed = 1;
        
        /**
         * Act - do whatever the Apple wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act()
        {
            //Apple falls downwards.
            int x = getX();
            int y = getY() + speed;
            setLocation(x, y);
            
            //Remove apple and draw the game over when apple gets to the bottom
            MyWorld world = (MyWorld) getWorld();
            if(getY() >= world.getHeight())
            {
                world.gameOver();
                world.removeObject(this);
            }
        }
        
        public void setSpeed(int spd)
        {
            speed = spd;
        }
    }