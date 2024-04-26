import java.util.*;
public class UpperOfFIrstLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c=s.charAt(0);
        String up=(c>=65 && c<=90)?"Upper":"not";
        System.out.println(up);

    }
}
