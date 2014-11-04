package cardsInSpace;


/**
 * Write a description of class passiveDeck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class passiveDeck extends Deck
{
    
    public passiveDeck()
    {
       super(); 
       fillDeck();
       shuffle(5);
    }
    
    public passiveDeck(ArrayList<card> c)
    {
       super(c); 
    }
    
    public void fillDeck()
    {
        int z = 0;
        for(int i = 0; i < 20; i++)
        {
                switch (z)
                {
                    case 0: addCard(new passiveDefense()); z = 0; break;
                }
        }
    }
}
