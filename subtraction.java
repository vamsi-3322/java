import java.io.*;
import java.util.*;
public class Subtraction
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        int c = a-b;
        System.out.println("Subtraction of "+a+" and "+b+ "is "+c);
    }
}