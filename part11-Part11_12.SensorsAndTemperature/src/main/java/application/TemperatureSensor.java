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

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isOn;

    public TemperatureSensor() {
        this.setOff();
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public int read() {
        if (!this.isOn) {
            throw new IllegalStateException();
        }
        Random random = new Random();
        return random.nextInt(61) - 30;
    }
    
}
