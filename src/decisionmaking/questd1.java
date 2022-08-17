package decisionmaking;
import java.util.Scanner;
public class questd1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
            System.out.print("sum"+(a+b));
        else
            System.out.print("difference"+(a-b));

    }
}
