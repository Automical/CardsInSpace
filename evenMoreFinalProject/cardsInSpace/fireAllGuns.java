package cardsInSpace;
import java.util.ArrayList;

/**
 * Write a description of class attack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fireAllGuns extends actionCard
{
    public fireAllGuns()
    {
        init();
        editTitle("fireAllGuns");
        editDescription("Every gun hardpoint is fired.");
    }

    public void mainAction()
    {
        ship s = getShipToRecieveAction();
        ship f = getShipToPerformAction(); //this is the ship that has all the hardpoints.
        //When the ship is recieved from this function, say if player1 has basicShip, does it return it as a basicship?
        for(hardpoint h: f.returnHardpoints())
        {//not implemented completely yet)
            if(h instanceof gun)
            {
                for(int i = 0;i<h.returnAttackRate();i++)
                {
                    s.recievesDamage(-h.returnAttack());
                }
            }
        }
    }
}