/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author set
 */
public class Plane {

    private String ID;
    private int capacity;

    public Plane(String ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return this.ID + " (" + this.capacity + " capacity)";
    }

    public String getID() {
        return ID;
    }
}
