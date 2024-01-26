 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
 
public class LiteracyComparison {
 
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(r -> r.split(","))
                    .filter(s -> s.length >= 6)
                    .sorted((s1, s2) -> {
                        double result = Double.valueOf(s1[5]) - Double.valueOf(s2[5]);
                        if (result > 0) {
                            return 1;
                        } else if (result < 0) {
                            return -1;
                        }
                        return 0;
 
                    })
                    .forEach(s -> System.out.println(s[3] + " (" + s[4] + "), " + s[2].replace("(%)", "").trim() + ", " + s[5]));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
 