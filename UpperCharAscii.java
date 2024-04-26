import java.util.*;
public class UpperCharAscii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
                System.out.println(s.charAt(i)+"-"+(int)s.charAt(i));
        }
    }
}
