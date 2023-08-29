import java.util.*;
import java.lang.*;
class Quadratic
{
	public static void main(String args[])
	{
		int a,b,c,d;
		double r1,r2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Value :: ");
		a=s.nextInt();
		System.out.println("Enter B Value :: ");
		b=s.nextInt();
		System.out.println("Enter C Value :: ");
		c=s.nextInt();
		d=(b*b)-4*a*c;
		if(d==0)
		{
			r1=-b/(2*a);
			r2=-b/(2*a);
			System.out.println("Root (r1) = "+r1);
			System.out.println("Root (r2) = "+r2);
		}
		else if(d>0)
		{
			r1=(-b+Math.sqrt(d))/(2*a);
			r2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Root (r1) = "+r1);
			System.out.println("Root (r2) = "+r2);
		}
		else
		{
			System.out.println("Root are imaginary ");
		}
	}
}