 
import java.util.ArrayList;
import java.util.Scanner;
 
public class AverageOfNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> inputs = new ArrayList<>();
        
        while (true) {
            System.out.println("Input numbers, type \"end\" to stop.");
            String string = scanner.nextLine();
            if (string.equals("end")) {
                break;
            }
            inputs.add(string);
        }
        double average = inputs.stream().mapToInt(n -> Integer.valueOf(n)).average().getAsDouble();
        System.out.println("average of the numbers: " + average);
        
    }
}