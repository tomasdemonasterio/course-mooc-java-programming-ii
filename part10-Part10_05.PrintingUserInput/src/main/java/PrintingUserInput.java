 
import java.util.ArrayList;
import java.util.Scanner;
 
public class PrintingUserInput {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        while (true) {
            String string = scanner.nextLine();
            if (string.isEmpty()) {
                break;
            }
            inputs.add(string);
        }
        inputs.stream().forEach(s -> System.out.println(s));
    }
}
 