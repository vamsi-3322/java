import java.io.*;
import java.util.*;
public class Multiplication
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter multiplication table: ");
        int n = sc.nextInt();
        System.out.println("Enter min range: ");
        int min = sc.nextInt();
        System.out.println("Enter max range: ");
        int max = sc.nextInt();
        for(int i=min;i<=max;i++)
        {
           System.out.println(n+" * "+i+" = "+n*i); 
        }
    }
}