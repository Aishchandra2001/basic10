package basic;
import java.util.Scanner;
public class quest6 {
    public static void main(String[] args) {
        int a,b,c,d,f;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=a>b?a:b;
        f=d>c?d:c;
        System.out.print(f);


    }
}
