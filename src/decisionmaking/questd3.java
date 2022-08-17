package decisionmaking;
import java.util.Scanner;
public class questd3 {
    public static void main(String[] args) {
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);//ch=sc.nextLine().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.print("vowel");
        else
            System.out.print("consonants");
    }
}
