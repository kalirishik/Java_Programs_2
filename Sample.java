import java.util.*;
public class Sample {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        while(n>0){
            int r=n%10;
            if(n%2!=0){
                f=n;
                break;
            }
            n/=10;
        }

        if(f>0)
            System.out.println(f);
        else
            System.out.println("Odd Number Does not exist");
      }
}
