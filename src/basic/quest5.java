package basic;
import java.util.Scanner;
public class quest5 {
    public static void main(String[] args) {
        int n;String f;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        f=n%2==0?"even":"odd";
        System.out.println(f);
    }
}
