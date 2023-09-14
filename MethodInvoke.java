import java.io.*;
class A
{
    void m()
    {
        System.out.println("Inside method m ");
    }
    void n()
    {
        this.m();
        System.out.println("Inside method n ");
        
    }
}
public class THisDemo
{
    public static void main(String args[])
    {
        A a=new A();
        a.n();
    }
