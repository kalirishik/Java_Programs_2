import java.util.*;
public class TwoFiftyTo5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=250;i<=500;i++)
            System.out.println(i);
        int j=250,k=250;
        while(j<=500){
            System.out.println(j);
            j++;
        }
        do{
            System.out.println(j);
            k++;
        }while(k<=500);
    }
}
