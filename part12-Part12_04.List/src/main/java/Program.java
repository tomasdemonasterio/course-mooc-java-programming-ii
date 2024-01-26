
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
        List<Integer> list = new List<>();
        list.add(10);
        list.add(5);
        list.add(4);
        list.add(16);
        
        System.out.println(list.value(0));
        System.out.println(list.value(1));
        System.out.println(list.value(2));
        System.out.println(list.value(3));
        System.out.println();
        list.remove(5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.value(i));
        }
    }

}
