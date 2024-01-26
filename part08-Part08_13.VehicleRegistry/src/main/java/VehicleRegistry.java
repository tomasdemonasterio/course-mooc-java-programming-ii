/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author set
 */
import java.util.HashMap;
 
public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
 
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry.containsKey(licensePlate)) {
            return false;
        }
        
        this.registry.put(licensePlate, owner);
        
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return this.registry.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }
        
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate key : this.registry.keySet()) {
            System.out.println(key);
        }
    }
    
    public void printOwners() {
        String print = "";
        
        for (LicensePlate key : this.registry.keySet()) {
            String owner = this.registry.get(key);
            if (!print.contains(owner)) {
                print += owner + '\n';
            }
        }
        System.out.println(print);
    }
}