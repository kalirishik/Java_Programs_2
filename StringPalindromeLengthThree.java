import java.sql.SQLOutput;
import java.util.*;
public class StringPalindromeLengthThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="abacdcaaba";
        String p=s.substring((3-1),s.length()-(3));
        System.out.println(p);
        StringBuffer sb=new StringBuffer(p);
        sb.reverse();
        String e= sb.toString();
        System.out.println(e);
        if(p.equals(e))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Plaindrome");

    }
}
