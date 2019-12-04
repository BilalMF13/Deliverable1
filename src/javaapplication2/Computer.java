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
public class Computer {
        private int dealerPoints = 0;
        
    public void pointsCalculation(){
            
        System.out.println("Dealer is drawing...");
        while (dealerPoints < 17){
            Cards c = new Cards();

      c.setValue(c.ranValue());//random number 1 to 13
      c.setSuit(Cards.SUITS[c.ranSuit()]);
      
      System.out.println(c.getSuit() +" "+ c.VALUES[c.getValue()]);
      if ((c.getValue() == 11) || (c.getValue() == 10) || (c.getValue() == 12)){
        dealerPoints += 10;
    }
      else{ 
      dealerPoints +=  (c.getValue()+1);
      
      }
    
    }
    System.out.println("Total points " + dealerPoints + "\n");
    }
    /**
     * @return the dealerPoints
     */
    public int getDealerPoints() {
        return dealerPoints;
    }

    /**
     * @param dealerPoints the dealerPoints to set
     */
    public void setDealerPoints(int dealerPoints) {
        this.dealerPoints = dealerPoints;
    }
}    

