package basic;
import java.util.Scanner;
public class quest4 {
    public static void main(String[] args)
    {   int age;float salary,f;int bonus;
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        salary=sc.nextFloat();
        bonus=age>50?10000:5000;
        f=bonus+salary;
        System.out.println("final amount"+f);
        System.out.print("bonus"+bonus);


    }
}
