import java.util.HashMap;
 
public class Program {
 
    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String string : hashmap.keySet()) {
            System.out.println(string);
        }
    }
    
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String string : hashmap.keySet()) {
            if (string.contains(text)) {
                System.out.println(string);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String string : hashmap.keySet()) {
            if (string.contains(text)) {
                System.out.println(hashmap.get(string));
            }
        }
    }
 
}