package cardsInSpace;


/**
 * Abstract class actionCard - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class laser extends hardpoint
{
    
    //not sure what we want to put here, what is universal about an actionCard?
    public void init()
    {
        editType("laser");
        editInstallTime(5);
    }
}
