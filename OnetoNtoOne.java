import java.util.*;
public class OnetoNtoOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=n;
        for(int i=1;i<=n;i++){
            System.out.println(i);
            System.out.println(r);
            r--;
        }
    }
}
