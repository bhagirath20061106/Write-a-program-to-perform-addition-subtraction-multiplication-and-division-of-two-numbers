package bhagirath;
import java.util.*;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter 1st number");
        int a = s.nextInt();
        System.out.println("Enter 2nd number");
        int b = s.nextInt();
        int u = a+b;
        int t = a-b;
        int m = a*b;
        int d = a/b;
        System.out.println("Sum = " + u);
        System.out.println("Subtraction="+t);
        System.out.println("multiplication = " + m);
        System.out.println("division = " + d);
    }
}