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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
 
public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> quantities;
 
    public Warehouse() {
        this.products = new HashMap<>();
        this.quantities = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.quantities.put(product, stock);
    }
    
    public int price(String product) {
        return this.products.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return this.quantities.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        int stock = this.stock(product);
        if (stock > 0) {
            this.quantities.replace(product, stock - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        return this.products.keySet();
    }
}