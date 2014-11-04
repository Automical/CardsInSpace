package cardsInSpace;
import java.util.ArrayList;

/**
 * Write a description of class attack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fireEverything extends actionCard
{
    public fireEverything()
    {
        init();
        editTitle("fireEverything");
        editDescription("Every weapon goes through one firing cycle");
    }

    public void mainAction()
    {
        ship s = getShipToRecieveAction();
        ship f = getShipToPerformAction(); //this is the ship that has all the hardpoints.
        //When the ship is recieved from this function, say if player1 has basicShip, does it return it as a basicship?
        for(hardpoint h: f.returnHardpoints())
        {//not implemented completely yet)
            for(int i = 0;i<h.returnAttackRate();i++)
            {
                s.recievesDamage(-h.returnAttack());
            }
        }
    }
}