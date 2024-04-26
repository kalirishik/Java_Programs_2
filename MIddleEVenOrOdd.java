import java.util.*;
public class MIddleEVenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=(int)Math.log10(n)+1;
        int m=(int)(n/Math.pow(10,l/2))%10;
        if(m%2==0)
            System.out.println("EVen");
        else
            System.out.println("odd");
    }
}
