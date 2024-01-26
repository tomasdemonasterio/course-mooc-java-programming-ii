import java.util.Scanner;
 
public class LiquidContainers {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
 
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
 
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] pieces = input.split(" ");
            if (pieces[0].equals("add")) {
                int value = Integer.valueOf(pieces[1]);
                if (value > 0) {
                    first += value;
                }
                if (first > 100) {
                    first = 100;
                }
            }
 
            if (pieces[0].equals("move")) {
                int value = Integer.valueOf(pieces[1]);
                int moveAmount = 0;
                if (value > 0) {
                    first -= value;
                    moveAmount = value;
                }
                if (first < 0) {
                    moveAmount = first + value;
                    first = 0;
                    
                }
                second += moveAmount;
                if (second > 100) {
                    second = 100;
                }
 
            }
 
            if (pieces[0].equals("remove")) {
                int value = Integer.valueOf(pieces[1]);
                if (value > 0) {
                    second -= value;
                }
                if (second < 0) {
                    second = 0;
                }
            }
        }
    }
 
}