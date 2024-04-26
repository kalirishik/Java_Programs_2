import java.util.*;
public class PatternRightReverseChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=64;
        int sum=(n*(n+1))/2;
        int f=sum+c;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)f+" ");
                f--;
            }
            System.out.println();
        }
    }
}
