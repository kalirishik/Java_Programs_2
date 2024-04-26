import java.util.*;
public class SquareNoEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=(int)Math.pow(n,2);
        System.out.println(((c&1)==1)?"Odd":"Even");
    }
}
