import java.io.*;
class A
{
    A()
    {
        System.out.println("InsideDefault Constructor");
    }
    A(int x)
    {
        this();
        System.out.println("Inside Parameterized Constructor");
        System.out.println("x value is "+x);
    }
}
public class ThisConstructorDemo
{
    public static void main(String args[])
    {
        A a=new A(247);
    }
}
