package cardsInSpace;
import java.util.ArrayList;

/**
 * Abstract class ship - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class ship
{
    private double totalHealth; //[0, infinity]
    private double totalDefense; //[0, infinity] ??? decide on a max defense???
    private String name;
    ArrayList<hardpoint> turrets = new ArrayList<hardpoint>();  //hardpoints on ship
    
    public void editTotalHealth(double newHealth)
    {
        totalHealth = newHealth;
    }
    
    public void editTotalDefense(double newDefense)
    {
        totalDefense = newDefense;
    }
    
    public void editName(String newName)
    {
        name = newName;
    }
    
    //Use this function to modify all health relating to ships
    //ie. modifyTotalHealth(5.00) | adds 5 health
    //ie. modifyTotalHealth(-5.00)| deplets 5 health
    public void modifyTotalHealth(double modHealth) 
    {                                           
        totalHealth += modHealth; 
                                  //Maybe a calculate damage which returns calculated damage with a certain attack
                                  //random chance for critical hit :o?
                                  //incorporate defense points into a function such as general as this?
                                  //might have to split functions (add, sub) if we are to do this?
                                  //ie. some type of factor reduction in health like with 0 defense deals
                                  //modHealth but with 50 defense only deals half of modHealth?
                                  //modHealth * (totalDefense / 100)
                                  //obviously in the example above modHealth would be negative.
    }
        
    //Use this function to modify all defense relating to ships
    //ie. modifyTotalDefense(5.00) | adds 5 defense
    //ie. modifyTotalDefense(-5.00)| deplets 5 defense
    public void modifyTotalDefense(double modDefense)
    {
        totalDefense += modDefense;
    }
    
    
    public double getTotalHealth()
    {
        return totalHealth;
    }
    
    public double getTotalDefense()
    {
        return totalDefense;
    }
    
    public String getName()
    {
        return name;
    }
    
    public abstract double scaleDamage(double damage);
    
    //Play the card through the ship
    //using this function below would mean that the ships held the cards
    //a ship would have to have its own mini-deck...
    public void attacks(ship s2, double damage)
    {
        s2.modifyTotalHealth(s2.scaleDamage(damage));
    }
    
    //Play the card directly
    public void recievesDamage(double damage)
    {
        modifyTotalHealth(scaleDamage(damage));
    }
    
    public void addHardpoints(hardpoint h)
    {
        //adds a hardpoint
        turrets.add(h);
    }
    
    public void removeHardpoints(hardpoint h)
    {
        turrets.remove(h);
    }
    
    public ArrayList<hardpoint> returnHardpoints()
    {
        //returns arrayList of all hardpoints
        return turrets;
    }
}
