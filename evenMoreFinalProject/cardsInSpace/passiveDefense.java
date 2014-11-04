package cardsInSpace;


/**
 * Write a description of class passiveDefense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class passiveDefense extends passiveCard
{

    public passiveDefense()
    {
        init();
        editTitle("Passive Defense");
        editDescription("Automatically adds 1 defense to your ship");
    }

    public void mainAction()
    {
        ship f = getShipToPerformAction();
        f.modifyTotalDefense(1.00);
    }
}
