/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Set
 */
import java.util.ArrayList;
 
public class Box implements Packable {
    private double capacity; 
    private ArrayList<Packable> items;
 
    public Box(double capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }
 
    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable item : this.items) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }
 
    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }
    
    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.capacity) {
            this.items.add(item);
        }
    }
    
}
 