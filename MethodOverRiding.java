import java.io.*;
class Bank
{
    double getRateOfIntrest()
    {
        return 0;
    }
}
class Sbi extends Bank
{
    double getRateOfIntrest()
    {
        return 8.3;
    }
}
class Hdfc extends Bank
{
    double getRateOfIntrest()
    {
        return 9.25;
    }
}
class UnionBank extends Bank
{
    double getRateOfIntrest()
    {
        return 10.6;
    }
}
public class MethodOverridingDemo
{
    public static void main(String args[])
    {
        //Sbi s1=new Bank();//Bank cnanot be converted in sbi error
        Sbi s=new Sbi();
        Hdfc h=new Hdfc();
        UnionBank u=new UnionBank();
        System.out.println("SBI RATE OF INTREST IS "+s.getRateOfIntrest());
        System.out.println("HDFC BANK RATE OF INTREST IS "+h.getRateOfIntrest());
        System.out.println("UNION BANK RATE OF INTREST IS "+u.getRateOfIntrest());
        //System.out.println("SBI RATE OF INTREST IS "+s1.getRateOfIntrest());//shows error
    }
}
