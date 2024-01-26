 
import java.util.Objects;
 
public class LicensePlate {
    // don't modify existing parts of this class
 
    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;
 
    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }
 
    @Override
    public String toString() {
        return country + " " + liNumber;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        
        if (!(obj instanceof LicensePlate)) {
            return false;
        }
 
        if (obj == this) {
            return true;
        }
        
        LicensePlate newObj = (LicensePlate) obj;
        if (!newObj.country.equals(this.country)) {
            return false;
        }
        if (!newObj.liNumber.equals(this.liNumber)) {
            return false;
        }
        return true;
    }
    
    public int hashCode() {
        return this.country.hashCode() + this.liNumber.hashCode();
    }
    
    
 
}
 