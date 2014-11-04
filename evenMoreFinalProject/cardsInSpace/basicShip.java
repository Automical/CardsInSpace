package cardsInSpace;


/**
 * Write a description of class baseShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class basicShip extends ship
{
    //basic ship
    public basicShip(String name)
    {
        editTotalHealth(100.00);
        editTotalDefense(0.00);
        editName(name);
    }
    
    
    /*
    public double scaleDamage(double damage)
    {
        return damage - (damage * getTotalDefense());
    }
    */
   
    public double scaleDamage(double damage)
    {
        return damage * (100.0/(100.0 + getTotalDefense()));
    }
}
