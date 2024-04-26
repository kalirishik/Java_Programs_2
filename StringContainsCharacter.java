import java.sql.SQLOutput;
import java.util.*;
public class StringContainsCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.next();
        System.out.println(s1.contains(s2)?"True":"False");

    }
}
