/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author set
 */
public enum Education {
    PHD("Doctoral degree"),
    MA("Masters degree"), 
    BA("Bachelors degree"),
    HS("High School diploma");
    
    private String description;
 
    private Education(String description) {
        this.description = description;
    }
}