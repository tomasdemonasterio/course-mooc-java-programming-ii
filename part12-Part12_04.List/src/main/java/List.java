/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author set
 */
public class List<T> {

    private T[] array;
    private int firstFreeIndex;

    public List() {
        this.array = (T[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(T value) {
        if (this.firstFreeIndex == this.array.length) {
            this.grow();
        }
        this.array[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    public void grow() {
        T[] newArray = (T[]) new Object[this.array.length + this.array.length / 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = this.array[i];
        }
        this.firstFreeIndex = this.array.length;
        this.array = newArray;
    }

    public boolean contains(T value) {
        return this.indexOf(value) > 0;
    }

    public void remove(T value) {
        if (this.contains(value)) {
            this.moveToTheleft(this.indexOf(value));
            this.firstFreeIndex--;
        }
    }

    public int indexOf(T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void moveToTheleft(int index) {
        for (int i = index; i < firstFreeIndex; i++) {
            this.array[i] = this.array[i + 1];
        }
    }

    public T value(int index) {
        if (index < 0 || index > this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.array[index];
    }
    
    public int size() {
        return this.firstFreeIndex;
    }
}
