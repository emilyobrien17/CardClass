package com.company;

import java.io.*;

public class CardDemo {


    public static void main(String[] args) throws IOException {


        FileWriter fw = new FileWriter("CardDemoOutput.txt",false);

        // Create an object outputFile from the Printwriter class.
        PrintWriter outputFile = new PrintWriter(fw);

        // Use the Card constructor with three parameters
        // to create an Ace of Diamonds with a value of 14.
        Card c1 = new Card(Card.ACE, Card.DIAMONDS, 14);

        // Use the Card constructor with two parameters.
        Card c2 = new Card(7, Card.HEARTS);          // 7 of Hearts
        Card c3 = new Card(Card.JACK, Card.SPADES);  // Jack of Spades
        Card c4 = new Card(Card.ACE, Card.CLUBS);    // Ace of Clubs

        outputFile.println("c1 = " + c1);    // toString() is called
        outputFile.println("     rank: " + c1.getRank());
        outputFile.println("     suit: " + c1.getSuit());
        outputFile.println("    value: " + c1.getValue());
        outputFile.println("   abbrev: " + c1.getAbbrev());
        outputFile.println("      ace? " + c1.isAce());
        outputFile.println();

        outputFile.println("c2 = " + c2);    // toString() is called
        outputFile.println("     rank: " + c2.getRank());
        outputFile.println("     suit: " + c2.getSuit());
        outputFile.println("    value: " + c2.getValue());
        outputFile.println("   abbrev: " + c2.getAbbrev());
        outputFile.println("      ace? " + c2.isAce());
        outputFile.println();

        outputFile.println("c3 = " + c3);    // toString() is called
        outputFile.println("     rank: " + c3.getRank());
        outputFile.println("     suit: " + c3.getSuit());
        outputFile.println("    value: " + c3.getValue());
        outputFile.println("   abbrev: " + c3.getAbbrev());
        outputFile.println("      ace? " + c3.isAce());
        outputFile.println();

        outputFile.println("c4 = " + c4);    // toString() is called
        outputFile.println("     rank: " + c4.getRank());
        outputFile.println("     suit: " + c4.getSuit());
        outputFile.println("    value: " + c4.getValue());
        outputFile.println("   abbrev: " + c4.getAbbrev());
        outputFile.println("      ace? " + c4.isAce());
        outputFile.println();

        outputFile.println("c1.versus(c2) = " + c1.versus(c2));
        outputFile.println("c1.versus(c3) = " + c1.versus(c3));
        outputFile.println("c1.versus(c4) = " + c1.versus(c4));
        outputFile.println("c2.versus(c3) = " + c2.versus(c3));
        outputFile.println();

        outputFile.close();
    }


}