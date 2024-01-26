/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Set
 */
import java.util.HashMap;
import java.util.Map;
 
public class ShoppingCart {
    private Map<String, Item> cart;
 
    public ShoppingCart() {
        this.cart = new HashMap<>();
    }
    
    
    public void add(String product, int price) {
        if(cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
        } else {
            cart.put(product, new Item(product, 1, price));
        } 
    }
    
    public int price() {
        int totalPrice = 0;
        for (String item : this.cart.keySet()) {
            totalPrice += this.cart.get(item).price();
        }
        
        return totalPrice;
    }
    
    public void print() {
        for(String item : this.cart.keySet()) {
            System.out.println(item + ": " + this.cart.get(item).getQty());
        }
    }
}
 