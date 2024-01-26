/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author set
 */
public class OneItemBox extends Box {
 
    @Override
    public void add(Item item) {
        if (super.getItems().isEmpty()) {
            super.getItems().add(item);
        }
    }
 
    @Override
    public boolean isInBox(Item item) {
        return super.getItems().contains(item);
    }
 
    
}