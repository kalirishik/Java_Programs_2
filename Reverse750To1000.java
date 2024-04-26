import java.util.*;
public class Reverse750To1000 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1000;i>=750;i--)
            System.out.println(i);
        int j=1000,k=1000;
        while(j>=750){
            System.out.println(j);
            j--;
        }
        do{
            System.out.println(k);
            k--;
        }while(k>=750);
    }
}
