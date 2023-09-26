import java.util.*;
class Racers
{
	public static void main(String args[])
	{
		int s1,s2,s3,s4,s5,avg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter bike racers speed :: ");
		s1=s.nextInt();
		s2=s.nextInt();
		s3=s.nextInt();
		s4=s.nextInt();
		s5=s.nextInt();
		avg=(s1+s2+s3+s4+s5)/5;
		if(s1<avg)
		{
			System.out.println("1st Racer is Not Eligible for Race ! ");
		}

		if(s2<avg)
		{
			System.out.println("2nd Racer is Not Eligible for Race ! ");
		}

		if(s3<avg)
		{
			System.out.println("3rd Racer is Not Eligible for Race ! ");
		}

		if(s4<avg)
		{
			System.out.println("4th Racer is Not Eligible for Race ! ");
		}

		if(s5<avg)
		{
			System.out.println("5th Racer is Not Eligible for Race ! ");
		}
	}
}
