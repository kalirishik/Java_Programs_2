import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int re,r,sum=0;
        r=n;
        while(n!=0){
            re=n%10;
            sum=(sum*10)+re;
            n/=10;
        }
        System.out.println((r==sum)?"palindrome":"Not palindrome");
    }
}
