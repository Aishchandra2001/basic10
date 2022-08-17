package decisionmaking;
import java.util.Scanner;
public class questd8 {
    public static void main(String[] args) {
        char ch;int a,b,c;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        switch(ch)
        {
            case 'a':
                System.out.println((a+b+c)/3);
                break;
            case 'p':
                System.out.println(a*b*c);
                break;
            case 's':
                System.out.println(a+b+c);
                break;
        }

    }
}
