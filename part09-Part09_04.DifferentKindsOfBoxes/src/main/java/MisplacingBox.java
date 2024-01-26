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
 
public class MisplacingBox extends Box{
 
    @Override
    public void add(Item item) {
        super.getItems().add(item);   
    }
 
    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
    
}