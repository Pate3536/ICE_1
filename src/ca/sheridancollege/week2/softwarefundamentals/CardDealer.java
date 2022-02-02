

/**
 * name: Prince Patel
 * ID : 991653893
 * 
*/
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        Card king = new Card("clubs",5);
        king.setSuit("spades");
        Card king1 = new Card("diamonds",2);
        king1.setSuit("diamonds");
       Card king2 = new Card("hearts",3);
       king2.setSuit("hearts");
        
        System.out.println("king1.getSuit");
        System.out.println("king2.getSuit");
        
    }
    
  
   
}
