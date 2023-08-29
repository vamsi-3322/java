import java.io.*;
import java.util.*;
public class ElseIf
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2= sc.nextInt();
        int s3 = sc.nextInt();
        int total = s1+s2+s3;
        float avg = total/3;
        System.out.println("The Total marks of the student is "+total);
        if(avg>=90&&avg<=100)
        {
            System.out.println("student average is " +avg+ "   A grade");
        }
        else if(avg>=70&&avg<90)
        {
            System.out.println("student average is " +avg+ "   B grade");
        }
        else if(avg>=50&&avg<70)
        {
            System.out.println("student average is " +avg+ "   C grade");
        }
        else
        {
            System.out.println("student is failed");
        }
    }
}