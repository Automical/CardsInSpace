package cardsInSpace;
//mostly code pilfered from the ship class.

/**
 * Abstract class hardpoint - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class hardpoint
{
    private boolean destroyed; // 1 - destroyed, 0 - intawct
    private double attack; // [0,infinity] damage the hardpoint does per hit
    private double attackRate; // [1, infinity] number of times hardpoint hits per cycle/turn
    private int installTime; //[0, infinity] number of turns it takes to install this module
    private String type;
    
    public void destroy()
    {
        // destroys and deactivates hardpoint
        destroyed = true;
    }
    
    public void repair()
    {
         // repairs and reactivates hardpoint
        destroyed = false;
    }
    
    public boolean getState()
    {
        // returns destroyed/intact state
        return destroyed;
    }
    
    public void editType(String newType)
    {
        type = newType;
    }
    
    public String getType()
    {
        //returns name
        return type;
    }
    
    public String getName()
    {
        return getClass().getSimpleName();
    }
    
    public void editAttack(double a)
    {
        attack = a;
    }
    
    public void editAttackRate(double ar)
    {
        attackRate = ar;
    }
    
    public void editInstallTime(int time)
    {
        installTime = time;
    }
    
    public double returnAttack()
    {
        return attack;
    }
    
    public double returnAttackRate()
    {
        return attackRate;
    }
    
    public int returnInstallTime()
    {
        return installTime;
    }
}
