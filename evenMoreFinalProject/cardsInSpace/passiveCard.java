package cardsInSpace;


/**
 * Abstract class defenseCard - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class passiveCard extends card
{
    //action activates once drawn literally 
    //fire the moment drawn, not played by player but by computer
    
    
    //not sure what we want to put here, what is universal about a defenseCard?
    //maybe a passive action abstract method of some sort?
    public void init()
    {
        //setShipToPerformAction(null);
        //setShipToRecieveAction(null);
        editType("passive");
    }
}
