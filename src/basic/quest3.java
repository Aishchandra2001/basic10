package basic;
import java.util.Scanner;
public class quest3 {
    public static void main(String[] args) {

        String name;double rate,n,a,f;
        Scanner sc =new Scanner(System.in);
        name=sc.next();
        rate=sc.nextDouble();
        n=sc.nextInt();
        a=rate-(10.0/100)*rate;
        f=a+(2.0/100)*a;
        System.out.println("amount"+(f*n));
    }
}
