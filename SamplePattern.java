import  java.util.*;
public class SamplePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
