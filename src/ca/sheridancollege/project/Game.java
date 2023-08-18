/* 
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


 // @author Taymour Breiche and Hieu Nguyen 
 // @Author Taymour Breiche and Hieu Nguyen
public class Game {

    
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static ArrayList <Cards> playerOneDeck = new ArrayList<>();
    static ArrayList <Cards> playerTwoDeck = new ArrayList<>();


    
    // @param args the command line arguments

    public static void main(String[] args) {
        System.out.println("Hey let's play a game of war!\nPlayer One type your name, please: ");
        String namePlayerOne = scanner.nextLine();
        playerOneDeck = Cards.createStackOne();
        for (int i = 0; i < playerOneDeck.size(); i++) {
            Collections.swap(playerOneDeck,randomizer(),i);
        }//end for


        System.out.println("Player One type your name, please:");
        String namePlayerTwo = scanner.nextLine();
        playerTwoDeck = Cards.createStackTwo();
        for (int i = 0; i < playerTwoDeck.size(); i++) {
            Collections.swap(playerTwoDeck,randomizer(),i);
        }//end for
        System.out.println("The game begins!");
        Cards playerOneTopCard = playerOneDeck.get(0);
        Cards playerTwoTopCard = playerTwoDeck.get(0);

        System.out.println("Play One's top card is: " + playerOneTopCard);
        System.out.println("VS");
        System.out.println("Play Two's top card is: " + playerTwoTopCard);
        int comparable = playerOneTopCard.compareTo(playerTwoTopCard);

        System.out.println("The winner is: " + determineWinner(playerOneTopCard,playerTwoTopCard,comparable));
    }//end method
    static int randomizer(){
        return random.nextInt(56);
    }//end method
    static String determineWinner(Cards playOneTopCard, Cards playerTwoTopCard, int comparable){
        if (comparable == -1){
            return "Player One!";
        } if (comparable == 1) {
            return "Player Two!";
        } else {
            return "It's a draw";
        }//end if
    }//end method
}//end class