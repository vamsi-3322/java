import java.io.*;
class OuterClass
{
    static int outer_x=10;
    int outer_y=20;
    private static int outer_z=30;
    static class StaticNestedClass
    {
        void display()
        {
            System.out.println("Outer_x value is "+outer_x);
            System.out.println("Outer_z value is "+outer_z);
            OuterClass out=new OuterClass();
            System.out.println("Outer_y value is "+out.outer_y);
        }
    }
}
public class StaticNestedClassDemo
{
    public static void main(String args[])
    {
        OuterClass.StaticNestedClass snc=new OuterClass.StaticNestedClass();
        snc.display();
    }
}
