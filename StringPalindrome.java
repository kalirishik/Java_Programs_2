import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=s;
        StringBuffer s2=new StringBuffer(s);
        s2.reverse();
        String s3=s2.toString();
        if(s1.equals(s3))
            System.out.println("equal");
        else
            System.out.println(" not Equal");
    }
}
