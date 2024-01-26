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

public class Pipe<T> {
    ArrayList<T> pipe;
    
    public Pipe() {
        pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        pipe.add(value);
    }
    
    public T takeFromPipe() {
        T value = pipe.get(0);
        pipe.remove(0);
        
        return value;
    }
    
    public boolean isInPipe() {
        if (pipe.isEmpty()) {
            return false;
        }
        return true;
    }
}
