import java.util.*;
public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (isRotation(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are rotations of each other");
        } else {
            System.out.println("Not rotations of each other");
        }
    }
    public  static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }
}
