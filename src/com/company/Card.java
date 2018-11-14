package com.company;

/*
 * Card.java
 *
 * A (blueprint) class to represent an individual playing card.
 *
 * starter code by course staff, CS 111, Boston University
 *
 * completed by: Laura K. Gross, grossL@bu.edu
 *         date: October, 2018
 *
 *
 * UPDATED by: Emily O'Brien
 *          date: November 14, 2018
 */

public class Card {

    // constants for the ranks of non-numeric cards
    // It's convenient to use ACE to mean integer rank 1, etc.
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    // constants for the suits
    // It's convenient to use DIAMONDS to mean integer suit 0, etc.
    public static final int DIAMONDS = 0;
    public static final int HEARTS = 1;
    public static final int CLUBS = 2;
    public static final int SPADES = 3;

    // Array of Strings for the rank names
    // We have an integer for each rank r, and we have a corresponding String RANK_NAMES[r] for the name of the rank.
    private static final String[] RANK_NAMES = {
            null, "Ace", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "Jack", "Queen", "King"
    };

    // Array of Strings for the rank abbreviations
    // We have an integer for each rank r, and we have a corresponding String RANK_ABBREVS[r] for the name of
    // the rank abbreviation.
    private static final String[] RANK_ABBREVS = {
            null, "A", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "J", "Q", "K"
    };

    // Arrays of Strings for the suit names and abbreviations.
    // The name of the suit s is given by SUIT_NAMES[s].
    // The abbreviation of the suit s is given by SUIT_ABBREVS[s].
    private static final String[] SUIT_NAMES = {
            "Diamonds", "Hearts", "Clubs", "Spades"
    };
    private static final String[] SUIT_ABBREVS = {
            "D", "H", "C", "S"
    };

    /*
     * fields that capture the state of a Card object
     * We make them private to prevent direct access from outside the class.
     */
    private int rank;
    private int suit;
    private int value;

    /*
     * a constructor that allows clients to specify initial values for all of the fields
     */
    /*
     * (a) a constructor that allows clients to specify initial values for all of the fields
     * It throws IllegalArgumentExceptions when passed invalid values for rank or suit.
     * It calls setValue (which checks for invalid input).
     */
    public Card(int rank, int suit, int value) {
        if (rank < 1 || rank > 13) {
            throw new IllegalArgumentException("Rank invalid");
        }
        if (suit < 0 || suit > 3) {
            throw new IllegalArgumentException("Suit invalid");
        }
        this.rank = rank;
        this.suit = suit;
        setValue(this, value);
    }

    /*
     * (b) a constructor that allows clients to specify initial values for rank and suit only
     * The first line in the body of the method is a call to the previous constructor.
     * This constructor also calls setValue (which checks for invalid input),
     * assigning numeric and face cards a value that is equal to their rank
     * and aces a value of 14.
     */

    public Card(int rank, int suit) {
        if (this.rank == 1) {
            new Card(rank, suit, 14);
        }
        else {
            new Card(rank, suit, rank);
        }
    }



    /*
     * (a) a constructor that allows clients to specify initial values for rank and suit only
     * It assumes that numeric and face cards have a value that is
     * equal to their rank, and that aces are high; aces have value 14.
     */

    // Write constructor here.


    /*
     * getRank - an accessor method that returns the rank of the calling Card object
     */
    public int getRank() {
        return rank;
    }

    /*
     * getSuit - an accessor method that returns the suit of the calling Card object
     */
    public int getSuit() {
        return suit;
    }

    /*
     * getValue - an accessor method that returns the value of the calling Card object
     */
    public int getValue() {
        return value;
    }

    /*
     * (b) isAce - an accessor method that returns true if the calling Card object is an ace and false if
     * the calling Card object is not an ace
     */
    public boolean isAce() {
       if (this.rank == 1) {
           return true;
       }
       else{
           return false;
       }
    }

    /*
     * (c) toString - an accessor method that returns a string representation of the Card of the form
     * "rank_name of suit_name"
     * For example, if a Card object represents a 10 of Diamonds, this method
     * should return "10 of Diamonds". If a Card object represents a Queen of Spades,
     * this method should return "Queen of Spades".
     * This method uses the arrays RANK_NAMES and SUIT_NAMES.
     */
    public String toString() {
        return RANK_NAMES[this.rank] + " of " + SUIT_NAMES[this.suit];

    }

    /*
     * (d) getAbbrev - an accessor method that returns a string representing the abbreviation
     * of the Card, which is formed by combining the abbreviations of its rank and suit
     * For example, if a Card object represents a King of Hearts, this method
     * should return "KH". If a Card object represents 7 of Clubs, this method should return
     * "7C".
     * This method uses the arrays RANK_ABBREVS and SUIT_ABBREVS.
     */
    public String getAbbrev() {
        return RANK_ABBREVS[this.rank] + SUIT_ABBREVS[this.suit];
    }
    /*
     * (c) setValue - a mutator method that changes a Card's value
     * It throws an argument when a precondition is not met.
     * The precondition is that value must be non-negative.
     */
    public void setValue(Card card, int value) {
        if (value < 0){
            throw new IllegalArgumentException("Value must be non-negative");
        }
        else {
            card.value = value;
        }
    }

    /*
     * (e) versus - an accessor method that returns "win" if the calling Card object has a higher value
     * than the Card object specified by the parameter, returns "loss" if the calling Card object has a lower
     * value than the Card object specified by the parameter, and returns "war" if the calling Card object
     * has the same value as the object specified by the parameter.
     *
     */
    public String versus(Card card) {
        if (this.value == card.value){
            return "war";
        }
        else if (this.value < card.value){
            return "loss";
        }
        else {
            return "win";
        }
    }

}
