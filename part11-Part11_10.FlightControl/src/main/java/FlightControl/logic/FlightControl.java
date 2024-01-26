/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.*;
import java.util.HashMap;
import java.util.Collection;

/**
 *
 * @author set
 */
public class FlightControl {
    private HashMap<String, Plane> planes;
    private HashMap<String, Flight> flights;

    public FlightControl() {
        this.planes = new HashMap<>();
        this.flights = new HashMap<>();
    }
    
    public void addFlight(String ID, String departure, String target){
        Place placeDeparture = new Place(departure);
        Place placeTarget = new Place(target);
        flights.put(ID + departure + target, new Flight(planes.get(ID), placeDeparture, placeTarget));
    }
    
    public void addAirplane(String ID, int capacity){
        planes.put(ID, new Plane(ID, capacity));
        System.out.println(planes.size());
    }

    public void printFlights() {
        for (String key : this.flights.keySet()) {
            System.out.println(this.flights.get(key));
        }
    }

    public void printPlanes() {
        for (String key : this.planes.keySet()) {
            System.out.println(this.planes.get(key));
        }
    }

    public Collection<Plane> getPlanes() {
        return this.planes.values();
    }

   public Collection<Flight> getFlights() {
        return this.flights.values();
    }
    
    public void printPlaneByID(String ID) {
        System.out.println(planes.get(ID));
    }
    
    public Plane getPlane(String ID) {
        return planes.get(ID);
    }
}
