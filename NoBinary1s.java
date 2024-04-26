import java.util.*;
public class NoBinary1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                c++;
        }
        System.out.println(c);
    }
}
