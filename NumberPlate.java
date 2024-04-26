import java.util.*;
public class NumberPlate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        int i,j,v1=0,d1=0,v2=0,d2=0;
        for(i=0;i<s1.length;i++) {
            if(i==0) {
                if (s1[0].equals("TN"))
                    v1++;
                else if (s1[0].equals("KL"))
                    v1++;
                else if (s1[0].equals("KA"))
                    v1++;
                else if (s1[0].equals("AP"))
                    v1++;
                else
                    v1= 0;
            }
            else if(i==1){
                for(j=0;j<2;j++){
                    if(s1[i].charAt(j)>=47 && s1[i].charAt(j)<=58)
                        d1++;
                }
            }
            else if(i==3){
                for(j=0;j<2;j++){
                    if(s1[i].charAt(j)>=65 && s1[i].charAt(j)<=90)
                        v2++;
                }
            }
            else if(i==4){
                for(j=0;j<4;j++){
                    if(s1[i].charAt(j)>=47 && s1[i].charAt(j)<=58)
                        d2++;
                }
            }

        }
        if(v1==1 && d1==2 && (v2==1 || v2==2) && d2==4)
            System.out.println("valid");
        else
            System.out.println("not valid");
    }
}
