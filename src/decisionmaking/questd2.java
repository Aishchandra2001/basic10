package decisionmaking;
import java.util.Scanner;
public class questd2 {

    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b)
        {
            System.out.println((a+b));
            System.out.println(a*b);
        }
        else
        {System.out.println(a-b);
            System.out.print(a%b);
    }
}}
