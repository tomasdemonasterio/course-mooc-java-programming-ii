import java.lang.StringBuilder;
 
public class Checker {
    public boolean isDayOfWeek(String string) {
        //(mon, tue, wed, thu, fri, sat, sun)
        String regex = "mon|tue|wed|thu|fri|sat|sun";
        return string.matches(regex);
    }
    
    public boolean allVowels(String string) {
        return string.matches("(a|e|i|o|u)*");
    }
    
    public boolean timeOfDay(String string) {
        return string.matches("([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
    }
}
 