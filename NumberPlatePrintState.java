import java.util.*;
public class NumberPlatePrintState {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=0;
        String s=sc.next();
        String st=s.substring(0,2);
        switch(st){
            case "TN":
                v++;
                break;
            case "KL":
                v++;
                break;
            case "KA":
                v++;
                break;
            case "AP":
                v++;
                break;
            default:
                v=0;
                break;
        }
        String d=s.substring(6,s.length());
        System.out.println((v==1 &&(d.length()==4 || d.length()==3))?"Valid":"not a Valid");

    }
}
