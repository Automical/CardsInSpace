package cardsInSpace;
import java.util.ArrayList;

/**
 * Write a description of class baseShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fighter extends ship
{   
    //fighter
    public fighter(String name)
    {
        editTotalHealth(100.00);
        editTotalDefense(0.00);
        editName(name);
        turrets.add(new gunTurret());
      //  turrets.add(new gunTurret(" "));
    }
    
    public double scaleDamage(double damage)
    {
      // return damage * (100.0/(100.0 + getTotalDefense()));
      return damage * (getTotalDefense()/((-6*damage)+getTotalDefense()));
    }
}

