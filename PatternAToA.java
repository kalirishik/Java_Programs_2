import java.util.*;
public class PatternAToA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
                char c='A';
            for(int s=n-i-1;s>0;s--){
                System.out.print("  ");
            }
            for(int j=0;j<(2*i)+1;j++) {
                if (j < i)
                    System.out.print(c++ + " ");
                else
                    System.out.print(c-- + " ");
            }
            System.out.println();
        }
    }
}
