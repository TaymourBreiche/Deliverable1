/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;
import java.util.ArrayList;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author Taymour Breiche and Hieu Nguyen 
 */

public class Cards implements Comparable<Cards> {
    private Suit suit;
    private Value value;
    private int rank;
    private static ArrayList<Cards> cardsDeckOne = new ArrayList<Cards>();
    private static ArrayList<Cards> cardsDeckTwo = new ArrayList<Cards>();

    public Cards(Suit suit, Value value, int rank) {
        this.suit = suit;
        this.value = value;
        this.rank = rank;
    }

    static ArrayList<Cards> createStackOne() {
        for (int i = 1; i < 15; i++) {
            switch (i) {
                case 1:
                    for (Value value : Value.values()
                    ) {
                        cardsDeckOne.add(new Cards(Suit.Hearts, value, i++));
                    }
                    i = 1;
                case 15:
                    for (Value value : Value.values()
                    ) {
                        cardsDeckOne.add(new Cards(Suit.Diamonds, value, i++));
                    }
                    i = 1;
                case 30:
                    for (Value value : Value.values()
                    ) {
                        cardsDeckOne.add(new Cards(Suit.Clubs, value, i++));
                    }
                    i = 1;
                case 45:
                    for (Value value : Value.values()
                    ) {
                        cardsDeckOne.add(new Cards(Suit.Spades, value, i++));
                    }
                    i = 1;

            }

        } return cardsDeckOne;

    }
    static ArrayList<Cards> createStackTwo() {
        for (int i = 1; i < 15; i++) {
            switch (i) {
                case 1:
                    for (Value value : Value.values()
                    ) {
                        cardsDeckTwo.add(new Cards(Suit.Hearts, value, i++));
                    }
                    i = 1;
                case 15:
                    for (Value value : Value.values()
                    ) {
                        cardsDeckTwo.add(new Cards(Suit.Diamonds, value, i++));
                    }
                    i = 1;
                case 30:
                    for (Value value : Value.values()
                    ) {
                        cardsDeckTwo.add(new Cards(Suit.Clubs, value, i++));
                    }
                    i = 1;
                case 45:
                    for (Value value : Value.values()
                    ) {
                        cardsDeckTwo.add(new Cards(Suit.Spades, value, i++));
                    }
                    i = 1;

            }

        } return cardsDeckTwo;

    }

    public static void main(String[] args) {
    }


    @Override
    public String toString() {
        return "Cards{" +
                "suit=" + suit +
                ", value=" + value +
                ", rank=" + rank +
                '}';
    }

    @Override
    public int compareTo(Cards opponentCardRank) {
    if (this.rank > opponentCardRank.rank) {
        return -1;
    } if (this.rank < opponentCardRank.rank){
        return 1;
    } else {
        return 0;
        }
    }
}

