import java.util.*;
public class ReplaceAllALphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       String s1=s.replaceAll("[A-Za-z]","@");
        System.out.println(s1);
    }
}
