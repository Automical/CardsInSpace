package cardsInSpace;


/**
 * Write a description of class mainDeck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * Notes:
 * Use this deck when needing to fireActions on all cards in a certain deck.
 */

import java.util.ArrayList;

public class executionDeck extends Deck
{
    private ArrayList<card> crdsToRemove;
    
    public executionDeck()
    {
        super();
    }
    
    public executionDeck(ArrayList<card> c)
    {
        super(c);
    }
    
    public void fireActions()
    {
        //Execute cards
        crdsToRemove = new ArrayList<card>();
        
        for(int i = 0; i < sizeOfDeck(); i++)
        {
            card tmp = getCard(i);
            tmp.mainAction();
                                          //if the card has expired (been used or its multiple uses were finished) the card's index is placed into an array to be removed later, MUST BE LIKE THIS or causes error   
            if(tmp.cardExpired() == true) //read more here http://stackoverflow.com/questions/8189466/java-util-concurrentmodificationexception
            {
                crdsToRemove.add(tmp);
            }
        }
        
        for(card c : crdsToRemove)
        {
            removeCard(c);   
        }
        
        /*
        //Broken code, uncomment to see error
        for(card c : deck)
        {
           c.mainAction();
           
           if(tmp.cardExpired() == true)
           {
               deck.remove(c);   
           }
        }
        */
    }
    
    public Deck getExpiredDeck() 
    {
        if(crdsToRemove.size() == 0){return null;}
        return new Deck(crdsToRemove);
    }

}
