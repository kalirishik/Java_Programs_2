import  java.util.*;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=n,sum=0;
        while(n>0){
            int re=n%10;
            for(int i=re-1;i>0;i--){
                re=re*i;
            }
            sum+=re;
            n/=10;
        }
        System.out.println((sum==r)?"Strong number":"Not a Strong Number");

    }
}
