package cardsInSpace;


/**
 * Abstract class card - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
//arrayList of cards played, cycles through each tick to check if turnDecay = 0, if so remove
// to junkyard else keep them in until their turn decay is 0 for that card.
public abstract class card
{
    private String title;
    private String type;
    private String description;
    
    //
    private ship shipToRecieveAction;
    private ship shipToPerformAction;
    private int turnDecay = 0;
    
    public void editDescription(String newDescription)
    {
        description = newDescription;
    }
    
    public void editTitle(String newTitle)
    {
        title = newTitle;
    }
    
    public void editType(String newType)
    {
        type = newType;
    }
    
    public void editTurnDecay (int newTurnDecay)
    {
        turnDecay = newTurnDecay;
    }
    
    public void modifyTurnDecay (int modTurnDecay)
    {
        turnDecay += modTurnDecay;
    }
    
    public void setShipToRecieveAction(ship s)
    {
        shipToRecieveAction = s;
    }
    
    public void setShipToPerformAction(ship s)
    {
        shipToPerformAction = s;
    }
    
    public int getTurnDecay()
    {
        return turnDecay;
    }
    
    public ship getShipToRecieveAction()
    {
        return shipToRecieveAction;
    }
    
    public ship getShipToPerformAction()
    {
        return shipToPerformAction;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public String getType()
    {
        return type;
    }
    
    public boolean cardExpired()
    {
        if(turnDecay == 0){return true;}
        return false;
    }
    
    public String toString()
    {
        return type + " - " + title;
    }
    
    public abstract void mainAction();
}
