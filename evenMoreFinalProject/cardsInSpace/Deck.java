package cardsInSpace;


/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;
import java.util.ArrayList;

public class Deck
{
    private ArrayList<card> deck;
    //private ArrayList<card> crdsToRemove;
    private static Random gen = new Random();

    public Deck()
    {
        deck = new ArrayList<card>();
    }
    
    public Deck(ArrayList<card> c)
    {
        deck = c;
    }
 
   
   /*
    public void fireActions()
    {
        crdsToRemove = new ArrayList<card>();
        
        for(int i = 0; i < deck.size(); i++)
        {
            card tmp = deck.get(i);
            tmp.mainAction();
                                          //if the card has expired (been used or its multiple uses were finished) the card's index is placed into an array to be removed later, MUST BE LIKE THIS or causes error   
            if(tmp.cardExpired() == true) //read more here http://stackoverflow.com/questions/8189466/java-util-concurrentmodificationexception
            {
                crdsToRemove.add(tmp);
            }
        }
        
        for(card c : crdsToRemove)
        {
            deck.remove(c);   
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
        //* /
    }
    */
    //Should this really be random? Personally I dont think so, turns it from strat to luck based.
    /*
    public void fillDeck()
    {
        
        
        int num;
        for(int i = 0; i < 40; i++)
        {
            if(i % 2 == 0)
            {
                //When number is even (half of all the numbers) then add one random passive.
                num = gen.nextInt(1);
                switch (num)
                {
                    case 0: deck.add(new defend()); break;
                }
                
            }
            else
            {
                //When number is not even (half of all the numbers) then add one random action.
                num = gen.nextInt(2);
                switch (num)
                {
                    case 0: deck.add(new pieThrow()); break;
                    case 1: deck.add(new attack()); break;
                }
                
            }
        }
    }*/
    
    public void shuffle(int passes)
    {
        int tmpIndex;
        for(int z = 0; z < passes; z++)
        {
            for(int i = 0; i < deck.size(); i++)
            {
                 tmpIndex = gen.nextInt(deck.size());
                 deck.add(deck.get(tmpIndex));
                 deck.remove(tmpIndex);
            }
        }
    }
    
    public void transferCard(Deck d, int index)
    {
        if(deck.isEmpty() == false)
        {
            card tmp = deck.get(index);
            deck.remove(index);
            d.addCard(tmp);
        }
    }
    
    public void transferAllCardTypeTo(Deck d, String type)
    {
        ArrayList<card> tmp = new ArrayList<card>();
        for(card c : deck)
        {
            if(c.getType().equals(type))
            {
                //lazy fix
                d.addCard(c);
                tmp.add(c);
            }
        }
        
        for(card c : tmp)
        {
            deck.remove(c);
        }
    }
    
    public void transferCardRange(Deck d, int start, int finish) //start to finish is inclusive
    {
        if(deck.isEmpty() == false)
        {
            for(int index = start; index <= finish; index++)
            {
                card tmp = deck.get(start);
                deck.remove(start);
                d.addCard(tmp);
            }
        }
    }
    
    public void transferDeckContentsTo(Deck d)
    {
        for(card c : deck)
        {
            d.addCard(0, c);
        }
    }
    
    //finish swap
    public void swap(int index1, int index2)
    {
        card tmp = deck.get(index1);
    }
    
    public void addCard(card c)
    {
        deck.add(c);
    }
    
    public void addCard(int i, card c)
    {
        deck.add(i, c);
    } 
    
    public void removeCard(int index)
    {
        deck.remove(index);
    }
    
    public void removeCard(card c)
    {
        deck.remove(c);
    }
    
    public int sizeOfDeck()
    {
        return deck.size();
    }   
    
    public card getCard(int index)
    {
        return deck.get(index);
    }
    
    
    //Returns deck of expired cards only after fireActions has been called, otherwise null.
    //Will be over written once fireActions is called again.
    /*
    public Deck getExpiredDeck() 
    {
        if(crdsToRemove.size() == 0){return null;}
        return new Deck(crdsToRemove);
    }*/
    
    public String toString()
    {
        return deck.toString();
    }
    
    //public abstract void fillDeck();
}
