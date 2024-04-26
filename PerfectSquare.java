import java.util.*;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=(int)Math.sqrt(n);
        System.out.println((r*r==n)?"Perfect Square":"Not Perfect Square");
    }
}
