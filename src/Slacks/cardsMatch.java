package Slacks;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*ArrayList<String> CARDS=new ArrayList<>(Arrays.asList("2","3","4","5","6","7","8","9","10","J","Q","K","A"));
        ArrayList<String> SUITS=new ArrayList<>(Arrays.asList("DIAMOND","SPADE","HEARTS","CLUBS"));*/
public class cardsMatch {

    public static void main(String[] args) {
        ArrayList<String> CARDS = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"));
        ArrayList<String> SUITS = new ArrayList<>(Arrays.asList("DIAMOND", "SPADE", "HEARTS", "CLUBS"));

        ArrayList<String> deck = new ArrayList<>();
        deck = getDeck(CARDS, SUITS);
        System.out.println(deck);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        player1 = deal(deck);
        player2 = deal(deck);
        System.out.println(player1);
        System.out.println(player2);

        ArrayList<String> player1cards = new ArrayList<>();
        ArrayList<String> player1Suits = new ArrayList<>();
        player1cards.addAll(getCards(player1));
        player1Suits.addAll(getSuits(player1));
        System.out.println("===================================================");

        System.out.println(getCards(player2));
        System.out.println(getSuits(player2));

        System.out.println("==================================================");
        System.out.println(fourOfAKind(player1));
        System.out.println(fourOfAKind(player2));

        System.out.println("==================================================");

        System.out.println("==================================================");
        System.out.println(deck);
        System.out.println("How many cards did the players play? " + (player1.size() + player2.size()));
        System.out.println("The size of the remaining deck " + deck.size());
        System.out.println(player1cards);
        System.out.println(straightFlush(player1cards));


    }

    public static ArrayList<String> getDeck(ArrayList<String> CARDS, ArrayList<String> SUITS) {
        ArrayList<String> deck = new ArrayList<>();
        for (String card : CARDS) {
            for (String suit : SUITS) {
                deck.add(card + " " + suit);
            }
        }
        Collections.shuffle(deck);
        return deck;
    }

    public static ArrayList<String> deal(ArrayList<String> deck) {
        ArrayList<String> player = new ArrayList<>();
        for (int i = 0; i <= 4; i++) { //5cards to player1
            player.add(deck.get(i));
        }
        deck.removeAll(player);
        return player;
    }

    public static ArrayList<String> getCards(ArrayList<String> player) {
        ArrayList<String> cards = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            cards.add(player.get(i).split(" ")[0]);
        }
        return cards;
    }

    public static ArrayList<String> getSuits(ArrayList<String> player) {
        ArrayList<String> suits = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            suits.add(player.get(i).split(" ")[1]);
        }
        return suits;
    }

    public static String fourOfAKind(ArrayList<String> player) {
        ArrayList<String> cards = new ArrayList<>();
        cards = getCards(player);
        ArrayList<String> suits = new ArrayList<>();
        suits = getSuits(player);
        System.out.println(cards);
        System.out.println(suits);
        // This is for a Four Of A Kind
        String playerRank = "NO";
        for (String each : cards) {
            if (Collections.frequency(cards, each) >= 4) {
                playerRank = "Four Of A Kind";
            }
        }
        // This is for Straight
        for (String each : cards) {
        }
        return playerRank;
    }

    public static ArrayList<String> straightFlush(ArrayList<String> cards) {
        ArrayList<String> cardValue = new ArrayList<>();
        System.out.println(cards);
        for (String each : cards) {
            if (each.equals('J')) {
                cardValue.add("11");
            } else if (each.equals("Q")) {
                cardValue.add("12");
            } else if (each.equals("K")) {
                cardValue.add("13");
            } else if (each.equals("A")) {
                cardValue.add("14");
            }else{
               // cardValue=each;
            }
        }

        return  cardValue;

    }
}













