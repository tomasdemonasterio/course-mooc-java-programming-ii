
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
 
public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        System.out.println(readBooks("test.txt").size());
        
    }
    
    public static List<Book> readBooks(String file) {
        ArrayList<Book> books = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(r -> r.split(","))
                    .filter(s -> s.length >= 4)
                    .forEach(s -> books.add(new Book(s[0], Integer.valueOf(s[1]), Integer.valueOf(s[2]), s[3])));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return books;
    }
}