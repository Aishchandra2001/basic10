package decisionmaking;
import java.util.Scanner;
public class questd7 {
    public static void main(String[] args) {
        float r;int ch;
        Scanner sc=new Scanner(System.in);
        r=sc.nextFloat();
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("area"+(3.14*r*r));
                break;
            case 2:
                System.out.println("perimter"+(2*3.14*r));
                break;
            default:
                System.out.println("diameter"+(2*r));
        }
    }
}
