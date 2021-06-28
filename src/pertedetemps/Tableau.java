/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertedetemps;

/**
 *
 * @author kimngo
 */
public class Tableau {
    private Pile[] pile;
    private Deck deck;
    
    public Tableau()
    {
        pile = new Pile[13];
        deck = new Deck();
        deck.shuffle();
        for(int p=0; p<pile.length; p++)
        {
            pile[p] = new Pile();
            for(int c=0; c<4; c++)
            {
                pile[p].add(deck.deal());
            }
        }
    }
    
    public void play()
    {
        boolean end = false;
        int p=0;
        Card c1=pile[p].draw();
        System.out.println("Got "+c1.toString()+" from pile "+p+".");
        Card c2=null;
        while(end==false)
        {
            if(pile[p].isEmpty())
            {
                for(int x=0; x<pile.length; x++)
                {
                    if(!pile[x].isEmpty())
                    {
                        System.out.println("Pile "+p+" is empty. We lost!");
                        end=true;
                        x=pile.length;
                    }
                }
                if(end==false)
                {
                   System.out.println("We won!");
                   end=true; 
                }
                
            }
            else
            {
                c2 = pile[p].draw();
                System.out.println("Got "+c2.toString()+" from pile "+p+".");
                if(c1.getSuit()==c2.getSuit())
                {
                    p=c1.getRank();
                }
                else
                {
                    p=c2.getRank();
                }
                c1 = c2;
            }
        }
        
    }
}
