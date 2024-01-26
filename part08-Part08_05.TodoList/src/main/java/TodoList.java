/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Set
 */
import java.util.ArrayList;
 
public class TodoList {
    private ArrayList<String> tasks;
 
    public TodoList() {
        this.tasks = new ArrayList<>();
    }
    
    public void add(String task) {
        this.tasks.add(task);
    }
    
    public void print() {
        int i = 1;
        for (String task : this.tasks) {
            System.out.println(i + ": " + task);
            i++;
        }
    }
    
    public void remove(int number) {
        this.tasks.remove(number - 1);
    }
}