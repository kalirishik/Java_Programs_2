import java.util.*;
public class SumOfMiddleTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=(int)Math.log10(n)+1;
        int r=(int)(n/Math.pow(10,(l/2)-1));
        int mid1=r%10;
        int mid2=(r/10)%10;
        System.out.println(mid1+mid2);
    }
}
