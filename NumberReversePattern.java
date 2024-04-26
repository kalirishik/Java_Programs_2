import java.util.*;
public class NumberReversePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(r+" ");
                r--;
            }
            System.out.println();
        }
    }
}
