 
import java.util.Scanner;
 
public class LiquidContainers2 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
 
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
 
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] pieces = input.split(" ");
            
            if (pieces[0].equals("add")) {
                int value = Integer.valueOf(pieces[1]);
                first.add(value);
            }
 
            if (pieces[0].equals("move")) {
                int value = Integer.valueOf(pieces[1]);
                int moveAmount = first.contains();
                first.remove(value);
                if (first.contains() != 0) {
                    moveAmount = value;
                }
                second.add(moveAmount);
            }
 
            if (pieces[0].equals("remove")) {
                int value = Integer.valueOf(pieces[1]);
                second.remove(value);
            }
        }
    }
 
}