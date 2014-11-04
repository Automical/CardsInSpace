
/**
 * Write a description of class shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

public class box implements shape
{
    private double x;
    private double y;
    
    private double sizeX;
    private double sizeY;
    
    Rectangle.Double shape;
    
    private double mass;
    
    Color c = Color.BLACK;
    public box(double tX, double tY, double sX, double sY)
    {
        sizeX = sX;
        sizeY = sY;
        
        x = tX;
        y = tY;
        
        shape = new Rectangle.Double(x, y, sizeX, sizeY);
        
        mass = sizeX * sizeY;
    }
    
    public void draw(Graphics2D g2)
    {
        g2.setColor(c);
        g2.fill(shape);
    }
    
    public void erase(Graphics2D g2)
    {
        g2.setColor(Color.WHITE);
        g2.fill(shape);
    }
    
    public void tick()
    {
        
    }
}
