import java.util.*;
import java.util.regex.*;

public class NumberPlateValid {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        Pattern NumberPlate = Pattern.compile("^(TN|AP|KA|KL)\\d{1,2}[A-Za-z]{1,2}\\d{1,4}$");
        Matcher c = NumberPlate.matcher(s);

        if (c.matches()) {
            System.out.println("Valid number plate");
        } else {
            System.out.println("Not a valid number plate");
        }
    }
}