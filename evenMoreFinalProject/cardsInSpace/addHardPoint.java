package cardsInSpace;


/**
 * Write a description of class addGunTurret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;

public class addHardPoint extends actionCard
{
    //This card works by randomly selecting a hardpoint type to be set
    //as this cards hardpoint. Depending on how powerful a certain hardpoint is, its turn decay will
    //be modified as a setup timer.
    private static Random gen = new Random();
    hardpoint h;
    
    public addHardPoint()
    {
        init();
        h = pickRandomHardpointType();
        editTitle("Add Attachment" + h.getName());
        editDescription("Adds an attachment to your ship to deal extra damage!");
        editTurnDecay(h.returnInstallTime());
    }
    
    public hardpoint pickRandomHardpointType()
    {
        int z = gen.nextInt(13);
        switch(z)
        {
            case 0: return new standardLaser();
            case 1: return new beamLaser();
            case 2: return new spreadLaser();
            
            case 3: return new standardMissile();
            case 4: return new doubleMissile();
            case 5: return new tripleMissile();
            case 6: return new quadMissile();
            case 7: return new octoMissile();
           
            case 8: return new gunTurret();
            case 9: return new autoCannon();
            case 10: return new spreadGun();
            case 11: return new sniperCannon();
            case 12: return new railCannon();
        }
        return null;
    }
    
    public void mainAction()
    {
        ship s = getShipToPerformAction();
        
        if(getTurnDecay() == 0)
        {
            s.addHardpoints(h);
        }
        else
        {
            modifyTurnDecay(-1);
        }
    }
}
