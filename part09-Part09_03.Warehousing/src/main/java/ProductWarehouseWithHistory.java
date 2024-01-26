/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author set
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;
 
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }
    
    public String history() {
        return this.history.toString();
    }
 
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount); //To change body of generated methods, choose Tools | Templates.
        this.history.add(this.getBalance());
    }
 
    @Override
    public double takeFromWarehouse(double amount) {
        double took = super.takeFromWarehouse(amount); //To change body of generated methods, choose Tools | Templates.
        this.history.add(this.getBalance());
        return took;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history);
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
}