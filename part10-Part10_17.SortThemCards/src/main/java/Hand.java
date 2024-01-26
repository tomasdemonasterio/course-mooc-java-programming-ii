/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author set
 */
import java.util.ArrayList;
import java.util.Collections;
 
public class Hand implements Comparable<Hand> {
 
    private ArrayList<Card> cards;
 
    public Hand() {
        this.cards = new ArrayList<>();
    }
 
    public void add(Card card) {
        cards.add(card);
    }
 
    public void print() {
        cards.stream().forEach(c -> System.out.println(c));
    }
    
    public void sort() {
        Collections.sort(cards);
    }
 
    public ArrayList<Card> getCards() {
        return cards;
    }
 
    @Override
    public int compareTo(Hand hand) {
        return this.cards.stream().mapToInt(c -> c.getValue()).sum() - hand.getCards().stream().mapToInt(c -> c.getValue()).sum();
    }
    
    public void sortBySuit() {
        BySuitInValueOrder compare = new BySuitInValueOrder();
        Collections.sort(this.cards, compare);
    }
}