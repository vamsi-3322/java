import java.io.*;
import java.util.*;
public class ArrayDemo1
{
    public static void main(String args[])
    {
        int a[];
        a[]=new int[5];
        a[0]=11;
        a[1]=22;
        a[3]=33;
        a[5]=55;
        System.out.println("The Array elements are ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
