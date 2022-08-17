package decisionmaking;
import java.util.Scanner;
public class questd4 {
    public static void main(String[] args) {
        String name;float a,b,c,t, avg;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        t=a+b+c;
        avg=t/3;
        System.out.print(avg);
    }
}
