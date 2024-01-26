 
import java.util.ArrayList;
import java.util.Scanner;
 
public class AverageOfSelectedNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> inputs = new ArrayList<>();
        
        while (true) {
            System.out.println("Input numbers, type \"end\" to stop.");
            String string = scanner.nextLine();
            if (string.equals("end")) {
                break;
            }
            inputs.add(string);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String string = scanner.nextLine();
        if (string.equals("n")) {
            double average = inputs.stream().mapToInt(n -> Integer.valueOf(n)).filter(n -> n < 0).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }
        if (string.equals("p")) {
            double average = inputs.stream().mapToInt(n -> Integer.valueOf(n)).filter(n -> n > 0).average().getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }
    }
}
 