/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Player {
    Scanner input = new Scanner(System.in);
    private String name;
    private int playerPoints = 0;
    private int playerMoney = 100;
    
    public void pointsCalculation(){
    for (int i = 0; i<2; i++){
            Cards c = new Cards();

      c.setValue(c.ranValue());//random number 1 to 13
      c.setSuit(Cards.SUITS[c.ranSuit()]);
      
      System.out.println(c.getSuit() +" "+ c.VALUES[c.getValue()]);
      if ((c.getValue() == 11) || (c.getValue() == 10) || (c.getValue() == 12)){
        playerPoints += 10;
    }
      else{ 
      playerPoints +=  (c.getValue()+1);
      
      }
    
    }
    System.out.println("Total point \n" + playerPoints);
    }
    
    public void permission(){
        
            Cards c = new Cards();

      c.setValue(c.ranValue());//random number 1 to 13
      c.setSuit(Cards.SUITS[c.ranSuit()]);
      
      System.out.println(c.getSuit() +" "+ c.VALUES[c.getValue()]);
      if ((c.getValue() == 11) || (c.getValue() == 10) || (c.getValue() == 12)){
        playerPoints += 10;
    }
      else{ 
      playerPoints +=  (c.getValue()+1);

      }
    
    
    System.out.println("Total points " + playerPoints);
    
     
        }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

    /**
     * @return the points
     */
    public int getPoints() {
        return playerPoints;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(int points) {
        this.playerPoints = points;
    }

    /**
     * @return the playerMoney
     */
    public int getPlayerMoney() {
        return playerMoney;
    }

    /**
     * @param playerMoney the playerMoney to set
     */
    public void setPlayerMoney(int playerMoney) {
        this.playerMoney = playerMoney;
    }
}

