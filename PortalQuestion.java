import java.util.*;
public class PortalQuestion {
    static int Single(int a){
        int sum=0,r;
        while(a!=0){
            r=a%10;
            sum+=r;
            a/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int i,v=0,r=0,k=0;
        int a[]=new int[s];
        int b[]=new int[s];
        char c[]=new char[26];
        for(i=0;i<s;i++){
            a[i]=sc.nextInt();
            v=Single(a[i]);
            if(v>1){
                r=Single(v);
                b[k]=r;
                k++;
            }
        }
        char ch='a';
        for( i=0;i<26;i++){
            c[i]=ch;
            ch++;
        }
        for(i=0;i<s;i++){
            if(b[i]%2==1)
                System.out.print(c[b[i]-1]);
            else
                System.out.print(b[i]);
        }
    }
}
