/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author set
 */
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }
    
    @Override
    public void setOff() {
        this.sensors.stream().forEach(s -> s.setOff());
    }

    @Override
    public void setOn() {
        this.sensors.stream().forEach(s -> s.setOn());
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        
        return true;
    }

    @Override
    public int read() {
        if (this.sensors.isEmpty() || !this.isOn()) {
            throw new IllegalStateException();
        }
        int reading = (int) this.sensors.stream().mapToInt(s -> s.read()).average().getAsDouble();
        this.readings.add(reading);
        return reading;
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
}
