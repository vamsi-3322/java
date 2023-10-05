import java.io.*;
public class MatrixDemo1
{
    public static void main(String args[])
    {
        int a[][]=new int[2][2];
        a[0][0]=11;
        a[0][1]=22;
        a[1][0]=33;
        a[1][1]=44;
        System.out.println("Displaying the matrix elements: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
