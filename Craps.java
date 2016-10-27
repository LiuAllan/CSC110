/*
V00806981: Allan Liu
Craps

In this program, the user inputs a desired amount of money as well as thier bets.
Two random integers from 1 to 6 are generated and added up. The sum are then compared
to see if the user is a winner or loser. If the sum does not equal to either of the numbers 
7, 11, 2, 3, 12 on the initial roll, then it continues to roll until it matches the first roll or recieves a 7.
The bet is subtracted from the bankroll if lost, and added to the bankroll if won.

User inputs the: bankroll, bet, and yes or no depending if they want to continue playing or not.
The program outputs the: start out bankroll, bet, bankroll result, die sums, win, lose and if the user wants to play again.
*/

import java.util.*;
public class Craps {
	public static void main(String[] args) {
		
		//Variables
		double bet;
		String input;
		boolean result = true;
		Scanner console = new Scanner(System.in);
		
		System.out.println("How much is your bankroll?");
		double bankroll = console.nextDouble();
		do {
		    do {
		    	    System.out.println("Please place your bet less than $" + bankroll);
		    	    bet = console.nextDouble();
		    	    if (bet > bankroll) {
		    	    	    System.out.println("Your bet is too high.");
		    	    }//if
		    	    else {
		    	    	    System.out.println("Bet is: $" + bet);
		    	    	    System.out.println("Bankroll is: $" + bankroll);
		    	    	    System.out.println("Bet has been laid");
		    	    	    for(int x=1; x<=25;x++){
		    	    	    	    System.out.print("=");
		    	    	    }// for loop
		    	    	    System.out.println();
		    	    }//else
		    }//do while 2
		    while (bet > bankroll);
		    
		    int sumDice = 0;
		    sumDice = rollDice();
		    result = checkWin(sumDice);
		
		    if (result == true) {
		    	    bankroll = bankroll + bet;
		    	    System.out.println("You win! Your Bankroll is now: " + bankroll);
		    }//if 
		    else {
		    	    bankroll = bankroll - bet;
		    	    System.out.println("You lose! Your Bankroll is now: " +bankroll);
		    }//else
		    
		    //type in all lowercase, "yes" or "no"
		    System.out.println("Do you want to play again? Enter yes or no");
		    input = console.next();
		    
		}//do while 1 
		while (input.equals("yes") && (bankroll > 0));
	
		System.out.println("Thank you for playing.");	
	} //main
	
	//This method generates two random numbers and adds them together, and returning them to rollDice();
	public static int rollDice() {
		Random roll = new Random();
		
		/*
		generate numbers from 0 to 5. Add +1 because dice numbers are 1 to 6.
		Generate two random numbers from 1 to 6 to act as the two die values.
		*/
		
		int die1 = roll.nextInt(6) +1;
		int die2 = roll.nextInt(6) +1;
		
		System.out.println("Dice rolls: " +die1 + " and " +die2);
		
		//Sum of the two die values
		int both = die1 + die2;
		System.out.println("The sum of the two die are: " + both);
		return both;
	}//method rollDice
	
	public static boolean checkWin(int comeoutRoll) {
		while(true) {
			//If the sum of the two die is equal to 7 or 11 at the first attempt, user wins.
			if (comeoutRoll == 7 || comeoutRoll == 11) {
				return true;
			}
			
			//If the sum of the two die is equal to 2, 3 or 12 at the first attempt, user loses.
			else if (comeoutRoll == 2 || comeoutRoll == 3 || comeoutRoll == 12) {
				return false;
			}
			
			/*
			If the sum of the two die is any other number on the first roll, it rolls again. If the sum of the dice in 
			the first roll is equal to the sum of the dice in the second roll, user wins.
			If the sum of the dice in the second roll is equal to 7, user loses.
			*/
			
			else {
				System.out.println("Keep rolling!");
				System.out.println("Your next roll is...");
				System.out.println();
				
				int attemptTwo = 0;
				attemptTwo = rollDice();
				while(true) {
					if (attemptTwo == comeoutRoll) {
						return true;
					}//if
					
					else if (attemptTwo == 7) {
						return false;
					}//else if
					
					else {
						System.out.println("Keep rolling!");
						System.out.println("Your next roll is...");
						System.out.println();
						
						//continues to roll until a number matches the comeoutRoll or equals to 7.
						attemptTwo = rollDice();
			
					}//else
				}//while
			}//else
		}//while
	}//method checkWin
}//class



	
