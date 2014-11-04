package cardsInSpace;


/**
 * Write a description of class attack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class attack extends actionCard
{
    public attack()
    {
        init();
        editTitle("Generic Attack");
        editDescription("Generic attack that deals 5 damage.");
    }

    public void mainAction()
    {
        ship s = getShipToRecieveAction();
        s.recievesDamage(-5.00);
    }
}
