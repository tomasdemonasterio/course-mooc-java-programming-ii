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
public class Flight {
    private Plane plane;
    private Place placeDeparture;
    private Place placeTarget;

    public Flight(Plane plane, Place placeDeparture, Place placeTarget) {
        this.plane = plane;
        this.placeDeparture = placeDeparture;
        this.placeTarget = placeTarget;
    }

    @Override
    public String toString() {
        return this.plane + " (" + this.placeDeparture + "-" + this.placeTarget + ")";
    }
}
