/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Set
 */
import java.util.List;
import java.util.ArrayList;
 
public class Herd implements Movable {
    private List<Movable> herd;
 
    public Herd() {
        this.herd = new ArrayList<>();
    }
 
    @Override
    public String toString() {
        String string = "";
        
        for (Movable organism : this.herd) {
            string += organism + "\n";
        }
        
        return string;
    }
    
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable organism : this.herd) {
            organism.move(dx, dy);
        }
    }
}
 