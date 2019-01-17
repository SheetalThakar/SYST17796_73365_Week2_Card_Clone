/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

/**
 *
 * @author mehta
 */
public class Card {

   private String suit;//hearts,spades,clubs,diamonds
   private int value;//1-13

   //A constructor accepts givenSuit and 
   //givenValue
   public Card(String givenSuit,int givenValue)
   {
       suit=givenSuit;
       value=givenValue;
   }
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        if(suit.equals("Hearts")||suit.equals("Diamonds")||suit.equals("Spades")||suit.equals("Clubs"))
        {
        this.suit = suit;
        }
        else
        {
            System.out.println("The suit name is not correct");
        }
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        if((value>13)||(value<1))
        {
            System.out.println("Value not in range 1-13");
        }
        else
        {
        this.value = value;
        }
    }
   
}
