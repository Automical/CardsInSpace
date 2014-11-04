package cardsInSpace;


/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class player
{
    //private ArrayList<card> playerDeck;
    private Deck playerDeck;
    private Deck mainDeckRef;
    private ship playerShip;
    private String name;
    
    public player(String tmpName, Deck mainD)
    {
        // initialise instance variables
        //playerDeck = new ArrayList<card>();
        name = tmpName;
        mainDeckRef = mainD;
        playerDeck = new Deck();
        playerShip = new fighter(name);
        //initPlayer();
    }
    
    /*
    public void initPlayer()
    {
        playerDeck.fillDeck();
        playerDeck.shuffle(5);
    }*/
    
    public void pickACard(Deck recDeck, int index)
    {
        card tmp = recDeck.getCard(index);
        tmp.setShipToPerformAction(playerShip);
        if(tmp instanceof passiveCard)
        {
            tmp.mainAction();
            recDeck.removeCard(tmp);
            //recDeck.transferCard(mainDeckRef, index);
        }
        
        if(tmp instanceof actionCard)
        {
            recDeck.transferCard(playerDeck, index);
        }
    }
    
    public void playCard(int index, player p2)
    {
        card tmp = playerDeck.getCard(index);
        tmp.setShipToRecieveAction(p2.getShip());
        playerDeck.transferCard(mainDeckRef, index);
    }
    
    public Deck getPlayerDeck()
    {
        return playerDeck;
    }

    public ship getShip()
    {
        return playerShip;
    }
}
