import java.io.*;
public class DemoPrimeV3 {
    public static void main(String args[]) {
      int i,num,flag=0;
      num=Integer.parseInt(args[0]);
      for(i=2;i<num;i++)
      {
          
          if(num%i==0)
          {
            System.out.println(num+ " is not a prime number");
            flag=1;
            break;
          }
      }
      if(flag==0)
      {
          System.out.println(num+ " is a prime number");
      }
    }
}
