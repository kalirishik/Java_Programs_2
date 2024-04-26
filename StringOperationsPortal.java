import java.util.*;
public class StringOperationsPortal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=" ";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                s1+=s.charAt(i);
            }
        }
        s1=s1.toUpperCase();
        s=s.replaceAll("a",s1).replaceAll("e",s1).replaceAll("i",s1).replaceAll("o",s1).replaceAll("u",s1).replaceFirst("tr","@@").replaceFirst("tr","").replaceFirst("@@","tr");
        System.out.println(s);

    }
}