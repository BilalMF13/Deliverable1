package javaapplication2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // in order for the system to read our names and rules we used scanner.
        Scanner p = new Scanner(System.in);
        Player  player = new Player();
        Computer computer = new Computer();
        boolean valid = false;

        


    // Here we would print out the welcoming player.
    System.out.println(" Welcome player to BlackJack! "); 
        
    // Here we set the ground rules for the player to read.
    System.out.println(" Here are the Rules: \n ");
        
    // in order for the player to enter the match, 
    // They are requierd to pay an up front of $10.
    System.out.println
        (" To start the game you will need to pay a fee of 10 dollars. \n ");
    
    // Here we attempt to ask if the player wants to play or not.
    System.out.println(" Pay $10 to play, or don't pay anything to not play... \n "
                + " After you pay your $10.. \n \n"
                + "      The Dealer will now draw. \n \n"
                + " A set of 2 for you, another set of 2 for the computer."
                + " 21 is jackpot. \n \n "
                + " You may ask the dealer to 'Hit Me' for an additional card"
                + " you must attempt to reach 21. \n "
                + "  To win the game either you or the computer must reach "
                + " near or achive the 21 BlackJack. \n \n  "
                + " \n Winner will get 10 dollars to their account. \n "
                + " Loser will be taken -10 from their account. \n \n");
        
    // We are organizing the numbers from lower to higher
    System.out.println(" numbers are in asecnding order: ");
        
    // We start by calling the Ace = 1 etc.
    System.out.println(" (Ace = 1), 2, 3, 4, 5, 6, 7, 8 , 9, 10, \n (Joker = 11), "
                + "(Queen = 12), (King = 13)");
    
        System.out.println(" Would you like to play again? \n \n "
                + " An additional $10 would be required to play again \n \n \n");
    // Begin to play    
    System.out.print("Do you want to play? (type 'yes' or 'no': ");
    String statement = p.nextLine();
    
    
    do
        {
        
        if(checkYes(statement) || checkNo(statement))
        {
            valid = true;
        }
        else
        {
            System.out.println("Please enter yes or no to continue");
            statement = p.nextLine();
            
        }
        
        }while(!valid);
       
        
    while(statement.equalsIgnoreCase("yes")){
    player.setPoints(0);
    computer.setDealerPoints(0);
    System.out.println("You drew: \n");
    player.pointsCalculation();
    
    System.out.println("Do you want to hit or stand? (type: 'hit' or 'stand')");
    String secondStatement = p.nextLine();
    
    do
        {
        
        if(checkHit(secondStatement))
        {
            valid = true;
        }
        else
        {
            System.out.println("Please enter hit or stand to continue");
            secondStatement = p.nextLine();
            
        }
        
        }while(!valid);
    
    while(secondStatement.equalsIgnoreCase("hit")){
        player.permission();
        System.out.println("Do you want to hit or stand? (type: 'hit' or 'stand') ");
        secondStatement = p.nextLine();        
    }
    
    if (secondStatement.equalsIgnoreCase("stand")){
        computer.pointsCalculation();
        if((computer.getDealerPoints() > player.getPoints()) && (computer.getDealerPoints() < 22)){
            System.out.println("You lose, your points is: " + player.getPoints()
                    + ",and less than Dealer's points: " + computer.getDealerPoints());
            player.setPlayerMoney(player.getPlayerMoney() - 10);
            System.out.println("you lose $10, your total money is : " + player.getPlayerMoney() +" \n");
        }
       /* else if((computer.getDealerPoints() > player.getPoints()) && (computer.getDealerPoints() > 21)){
            System.out.println("You win, your points is: " + player.getPoints()
                    + ",and less than Dealer's points: " + computer.getDealerPoints() +
                    ", but the dealer's point is out of 21");
            player.setPlayerMoney(player.getPlayerMoney() + 10);
            System.out.println("you win $10, your total money is : " + player.getPlayerMoney() );
        */
        }
        if((computer.getDealerPoints() >21) && (player.getPoints() >21) || ((computer.getDealerPoints() == player.getPoints()))){
            System.out.println("You draw, your points is: " + player.getPoints()
                    + ",and Dealer points: " + computer.getDealerPoints());
            
            System.out.println("your money is stable, your total money is : " + player.getPlayerMoney() + " \n");
    }
        if((computer.getDealerPoints() < player.getPoints()) && (player.getPoints() > 21 )){
            System.out.println("You lose, your points is: " + player.getPoints()
                    + ",larger than Dealer points: " + computer.getDealerPoints() +
                    ", but your point is out of 21.");
            player.setPlayerMoney(player.getPlayerMoney() - 10);
            System.out.println("your lose $10, your total money is : " + player.getPlayerMoney() +" \n");
    }
        if((computer.getDealerPoints() < player.getPoints()) && (player.getPoints() < 22 )){
            System.out.println("You win, your points is: " + player.getPoints()
                    + ", larger than Dealer's points: " + computer.getDealerPoints());
            player.setPlayerMoney(player.getPlayerMoney() + 10);
            System.out.println("you win $10, your total money is : " + player.getPlayerMoney() +" \n");
    }
        if((computer.getDealerPoints() > player.getPoints()) && (computer.getDealerPoints() > 21 )){
            System.out.println("You win, your points is: " + player.getPoints()
                    + ", Dealer's points: " + computer.getDealerPoints() + " that is out of 21.");
            player.setPlayerMoney(player.getPlayerMoney() + 10);
            System.out.println("you win $10, your total money is : " + player.getPlayerMoney() +" \n");
    }
        
        
       System.out.print("Do you want to continue? \n \n ");
    statement = p.nextLine(); 
    
    if (statement.equalsIgnoreCase("no")){
        System.out.println("Come back when you are ready.");
        System.exit(0);

        } 
    
    
    }
    
    }
     
    

 public static boolean checkYes(String pass)
    {
        if("yes".equals(pass))
        {
            return true;
        }
        return false;
    }
  public static boolean checkNo(String pass)
    {
        if("no".equals(pass))
        {
            return true;
        }
        return false;
    }
  
    public static boolean checkHit(String pass)
    {
        if("hit".equals(pass))
        {
            return true;
        }
        return false;
    }
    
    public static boolean checkStand(String pass)
    {
        if("stand".equals(pass))
        {
            return true;
        }
        return false;
    }
}

    