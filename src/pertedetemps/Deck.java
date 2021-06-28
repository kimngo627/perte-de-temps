/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertedetemps;

import java.util.Random;

/**
 *
 * @author kimngo
 */
public class Deck {
    private Card[] deck;
    private Random random = new Random();
    private int card;
    
    public Deck()
    {
        deck = new Card[52];
        card = deck.length-1;
        for(int c=0; c<deck.length; c++)
        {
            deck[c] = new Card(Math.abs(random.nextInt()) % 13, Math.abs(random.nextInt()) % 4);
        }
    }
    
    public Card deal()
    {
        if(card>=0)
        {
            Card dealt = deck[card];
            card--;
            return dealt;
        }
        else
        {
            throw new IllegalStateException();
        }
    }
    
    public void shuffle()
    {
        if(card!=deck.length-1)
        {
            throw new IllegalStateException();
        }
        else
        {
            for(int i=deck.length-1; i>0; i--)
            {
                int j = Math.abs(random.nextInt())%(i+1);
                Card swap = deck[i];
                deck[i] = deck[j];
                deck[j] = swap;
            }
        }
        
    }
}
