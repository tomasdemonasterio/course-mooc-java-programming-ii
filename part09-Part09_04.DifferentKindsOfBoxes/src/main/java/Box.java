
import java.util.ArrayList;
 
public abstract class Box {
    private ArrayList<Item> items;
 
    public ArrayList<Item> getItems() {
        return items;
    }
 
    public Box() {
        this.items = new ArrayList<>();
    }
    
    public abstract void add(Item item);
 
    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            Box.this.add(item);
        }
    }
 
    public abstract boolean isInBox(Item item);
}