import java.util.*;
public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if( c[i]>=97 && c[i]<=122) {
               if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                    System.out.println("vowel-"+c[i]);
                }
               else
                   System.out.println("Consonant-"+c[i]);
            }
            else
                System.out.println("not a letter-"+c[i]);
        }
    }
}
