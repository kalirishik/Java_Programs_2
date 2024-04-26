import java.util.*;
public class PatternCapsStarAt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        char c1='A';
            for(int s=n-i-1;s>0;s--){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(c1+" ");
                c1++;
            }
            for(int k=0;k<=i;k++){
                if(i%2==0)
                    System.out.print("* ");
                else
                    System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
