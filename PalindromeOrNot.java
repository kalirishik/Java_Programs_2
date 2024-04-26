import java.util.*;
public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,r=n;
        while(r>0){
            int re=r%10;
            sum=(sum*10)+re;
            r/=10;
        }
        System.out.println((sum==n)?"Palindrome":"Not palindrome");
    }
}
