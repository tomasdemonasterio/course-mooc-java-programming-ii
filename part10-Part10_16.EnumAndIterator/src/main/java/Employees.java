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
import java.util.List;
import java.util.Iterator;
 
public class Employees {
 
    private ArrayList<Person> persons;
 
    public Employees() {
        this.persons = new ArrayList<>();
    }
 
    public void add(Person personToAdd) {
        this.persons.add(personToAdd);
    }
 
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(p -> this.add(p));
    }
 
    public void print() {
        Iterator<Person> iterator = this.persons.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
 
    public void print(Education education) {
        Iterator<Person> iterator = this.persons.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getEducation() == education) {
                System.out.println(next);
            }
        }
    }
 
    public void fire(Education education) {
        Iterator<Person> iterator = this.persons.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
 
//prints the employees whose education matches the education given as a parameter.
}