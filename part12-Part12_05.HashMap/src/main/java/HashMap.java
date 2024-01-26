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
import java.lang.Math;

public class HashMap<K, V> {

    private ArrayList<Pair<K, V>>[] hashmap;
    private int firstFreeIndex;

    public HashMap() {
        this.hashmap = new ArrayList[32];
        this.firstFreeIndex = 0;
    }

    public V get(K key) {
        int hashCode = Math.abs(key.hashCode() % this.hashmap.length);

        List<Pair<K, V>> pairs = this.hashmap[hashCode];

        for (Pair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null;
    }

    public void add(K key, V value) {
        List<Pair<K, V>> pairs = getListBasedOnKey(key);
        int index = getIndexOfKey(pairs, key);

        if (index != -1) {
            pairs.get(index).setValue(value);
        } else {
            pairs.add(new Pair<>(key, value));
            firstFreeIndex++;
        }

        if (1.0 * this.firstFreeIndex / this.hashmap.length > 0.75) {
            grow();
        }
    }

    public List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashCode = Math.abs(key.hashCode() % this.hashmap.length);

        if (this.hashmap[hashCode] == null) {
            this.hashmap[hashCode] = new ArrayList<>();
        }

        return this.hashmap[hashCode];
    }

    public int getIndexOfKey(List<Pair<K, V>> list, K key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public void grow() {
        ArrayList<Pair<K, V>>[] newHashMap = new ArrayList[this.hashmap.length * 2];
        for (int i = 0; i < newHashMap.length; i++) {
            copy(newHashMap, i);
        }

        this.hashmap = newHashMap;
    }

    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
    for (int i = 0; i < this.hashmap[fromIdx].size(); i++) {
        Pair<K, V> value = this.hashmap[fromIdx].get(i);

        int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
        if(newArray[hashValue] == null) {
            newArray[hashValue] = new ArrayList<>();
        }

        newArray[hashValue].add(value);
    }
}

    public V remove(K key) {
        List<Pair<K, V>> pairs = getListBasedOnKey(key);
        if (pairs.size() == 0) {
            return null;
        }
        
        int index = getIndexOfKey(pairs, key);
        if (index == -1) {
            return null;
        }
        
        V value = pairs.get(index).getValue();
        pairs.remove(index);
        return value;
    }
}
