import greenfoot.*;

/**
 * The World our hero lives.
 * 
 * @author Hanna Mao
 * @version November 2025
 */
public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
    }
}
