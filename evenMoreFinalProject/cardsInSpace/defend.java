package cardsInSpace;


/**
 * Write a description of class defend here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class defend extends actionCard
{

    public defend()
    {
      init();
      editTitle("Generic Defend"); 
      editDescription("Generic defend that adds 3 defense points.");
    }
    
    public void mainAction()
    {
      ship s = getShipToPerformAction();
      s.modifyTotalDefense(3.00);
    }
}
