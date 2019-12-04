/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author User
 */
public class Cards {
   private String suit;
   private int value;
   

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
   public static final String [] VALUES = {"ONE", "TWO", "THREE", "FOUR", "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
   public int ranSuit()
   {
    int value= (int)(Math.random()*4);
    return value;
}
public int ranValue()
{
 int value= (int)(Math.random()*13);   
 return value;
}
    
}



