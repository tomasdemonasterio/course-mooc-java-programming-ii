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
 
public class IOU {
    private HashMap<String, Double> iouMap;
 
    public IOU() {
        this.iouMap = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
         this.iouMap.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.iouMap.getOrDefault(toWhom, 0.0);
    }
    
}
 