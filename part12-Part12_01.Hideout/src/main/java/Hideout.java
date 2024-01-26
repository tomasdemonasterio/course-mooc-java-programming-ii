/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author set
 */
public class Hideout<T> {
    T hideout;
    
    public void putIntoHideout(T toHide) {
        this.hideout = toHide;
    }
    
    public T takeFromHideout() {
        return this.hideout;
    }
    
    public boolean isInHideout() {
        if (this.hideout == null) {
            return false;
        }
        return true;
    }
}
