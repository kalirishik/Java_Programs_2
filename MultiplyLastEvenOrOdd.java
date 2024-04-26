import java.util.*;
public class MultiplyLastEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n*2;
        int l=m%10;
        System.out.println(((l&1)==1)?"Odd":"Even");
    }
}
