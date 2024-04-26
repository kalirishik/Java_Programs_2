import java.util.*;
public class StringFirstLastASciiSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        String c1=s.substring(0,2);
        String c3=s.substring(l-2,l);
        char c4=c1.charAt(0);
        char c5=c1.charAt(1);
        char c6=c1.charAt(0);
        char c7=c1.charAt(1);
        int ascii=c4+c5+c6+c7;
        System.out.println(ascii);





    }
}
