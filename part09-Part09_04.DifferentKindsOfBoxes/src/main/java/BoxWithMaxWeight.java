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
 
public class BoxWithMaxWeight extends Box {
    private int capacity;
    
    public BoxWithMaxWeight(int capacity) {
        super();
        this.capacity = capacity;
    }
 
    @Override
    public void add(Item item) {
        int totalWeight = 0;
        for (Item itemInList : super.getItems()) {
            totalWeight += itemInList.getWeight();
        }
        if (totalWeight + item.getWeight() <= this.capacity) {
            super.getItems().add(item);
        }
    }
 
    @Override
    public boolean isInBox(Item item) {
        return super.getItems().contains(item);
    }
    
}