package decisionmaking;
import java.util.Scanner;
public class questd6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;int n;float fine;
        name=sc.next();
        n=sc.nextInt();
        if(n<5)
            System.out.println(n*1.5);
        else if(n>=5&&n<10)
            System.out.println(5*1.5+(n-5)*5);
        else if(n>10&&n<15)
            System.out.println(5*1.5+10*5+(n-15)*10);
        else
            System.out.println(5*1.5+10*5+15*10+(n-30)*15);


    }
}
