import java.util.*;
public class StringItearteIndividual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char s1[]=s.toCharArray();
        for(char c:s1)
            System.out.println(c);

        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}
