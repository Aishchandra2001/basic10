package decisionmaking;
import java.util.Scanner;
public class questd5 {
    public static void main(String[] args) {
        int y;
        Scanner sc=new Scanner(System.in);
        y=sc.nextInt();
        if (y%4==0 && y%100!=0 ||y%400==0)
            System.out.println("leap year");
        else
            System.out.print("not a leap year");
    }
}
