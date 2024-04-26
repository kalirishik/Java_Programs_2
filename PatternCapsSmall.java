import java.util.*;
public class PatternCapsSmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        char c1='A',c2='a';
            for(int j=0;j<=i;j++){
                if(i%2==0) {
                    System.out.print(c1 + " ");
                    c1++;
                }
                else {
                    System.out.print(c2 + " ");
                    c2++;
                }
            }
                System.out.println();
        }
    }
}
