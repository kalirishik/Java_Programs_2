import java.util.*;
public class PrintCharacterSpecify {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        System.out.println(s.charAt(n-1));

    }
}
