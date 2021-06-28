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
public class Pile {
    
    private class Layer
    {
        private Card card;
        private Layer next;
        private Layer(Card card, Layer next)
        {
            this.card = card;
            this.next = next;
        }
    }
    
    private Layer top;
    
    public Pile()
    {
        top = null;
    }
    
    public void add(Card card)
    {
        top = new Layer(card, top);
    }
    
    public Card draw()
    {
        if(isEmpty())
        {
            throw new IllegalStateException();
        }
        else
        {
            Card d = top.card;
            top = top.next;
            return d;
        }
    }
    
    public boolean isEmpty()
    {
        return top==null;
    }
}
