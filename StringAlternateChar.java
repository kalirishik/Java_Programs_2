import java.util.*;
public class StringAlternateChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i+=2)
            System.out.print(s.charAt(i)+" ");
    }
}
