package cardsInSpace;


/**
 * Write a description of class pieThrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pieThrow extends actionCard
{
    public pieThrow()
    {
        init();
        editTitle("Pie Throw");
        editDescription("Throws pie at opponents ship and deals 3 raw damage initially and then 1 raw damage per turn for 3 turns after inital throw.");
        editTurnDecay(4);
    }
    
    //Ship s is the ship you are attacking
    public void mainAction()
    {
        ship s = getShipToRecieveAction();
        if(getTurnDecay() == 4)
        {
            s.recievesDamage(-3.00);
            modifyTurnDecay(-1);
        }
        else
        {
            s.recievesDamage(-1.00);
            modifyTurnDecay(-1);
        }
    }
}
