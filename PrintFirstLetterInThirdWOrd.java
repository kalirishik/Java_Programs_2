import java.util.*;
public class PrintFirstLetterInThirdWOrd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        char c=s1[3-1].charAt(0);
        System.out.println(c);
    }
}
