
/**
 * Write a description of interface shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Graphics2D;

public interface shape
{
    public void draw(Graphics2D g2);
    
    public void erase(Graphics2D g2);
    
    public void tick();
}
