import java.io.*;
import java.util.*;
public class Modulo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        float a = sc.nextFloat();
        System.out.println("Enter 2nd number : ");
        float b = sc.nextFloat();
        float c = a%b;
        System.out.println("Modulo of "+a+" and "+b+ " is "+c);
    }
}