package cardsInSpace;
import java.util.ArrayList;

/**
 * Write a description of class attack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fireAllMissiles extends actionCard
{
    public fireAllMissiles()
    {
        init();
        editTitle("fireAllMissiles");
        editDescription("Every missile hardpoint is fired.");
    }

    public void mainAction()
    {
        ship s = getShipToRecieveAction();
        ship f = getShipToPerformAction(); //this is the ship that has all the hardpoints.
        //When the ship is recieved from this function, say if player1 has basicShip, does it return it as a basicship?
        for(hardpoint h: f.returnHardpoints())
        {//not implemented completely yet)
            if(h instanceof missile)
            {
                for(int i = 0;i<h.returnAttackRate();i++)
                {
                    s.recievesDamage(-h.returnAttack());
                }
            }
        }
    }
}