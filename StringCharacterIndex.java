import java.util.*;
public class StringCharacterIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c=sc.next().charAt(0);
        int i=s.indexOf(c);
        System.out.println(i);
    }
}
