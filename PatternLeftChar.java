import java.util.*;
public class PatternLeftChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c='A';
        for(int i=0;i<n;i++){
            for(int s=n-i-1;s>0;s--){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
