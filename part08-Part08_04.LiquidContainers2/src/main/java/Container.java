/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Set
 */
public class Container {
    private int contain;
 
    public Container() {
        this.contain = 0;
    }
    
    public int contains() {
        return contain;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.contain += amount;
        }
        if (this.contain > 100) {
            this.contain = 100;
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.contain -= amount; 
        }
        if (this.contain < 0) {
            this.contain = 0;
        }
    }
 
    @Override
    public String toString() {
        return this.contain + "/100";
    }
}
 