import java.util.*;
public class PrintMonthName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1)
            System.out.println("January");
        else if(n==2)
            System.out.println("Febraury");
        else if(n==3)
            System.out.println("March");
        else if(n==4)
            System.out.println("April");
        else if(n==5)
            System.out.println("May");
        else if(n==6)
            System.out.println("June");
        else if(n==7)
            System.out.println("July");
        else if(n==8)
            System.out.println("Aagust");
        else if(n==9)
            System.out.println("September");
        else if(n==10)
            System.out.println("October");
        else if(n==11)
            System.out.println("November");
        else
            System.out.println("December");

    }
}
