package cardsInSpace;

import java.util.ArrayList;
/**
 * Write a description of class teststuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class teststuff
{
    // instance variables - replace the example below with your own
    private int x;
    private static ArrayList<String> dblList;
    
    /**
     * Constructor for objects of class teststuff
     */
    public teststuff()
    {
        // initialise instance variables
        x = 0;
    }

    /*
    public static void main(String args[])
    {
        dblList = new ArrayList<String>();
        dblList.add(new String("The"));
        System.out.println("" + dblList.get(0) + "");
        
        dblList.set(0, dblList.get(0).concat("cat"));
        System.out.println("" + dblList.get(0) + "");
    }
    */
   
    public static void main(String args[])
    {
        actionDeck p = new actionDeck();
        p.fillDeck();
        p.addCard(new pieThrow());
        System.out.println(p);
    }
     /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
