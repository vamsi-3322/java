import java.io.*;
class Student
{
    public String Sname;
    private String Sphone;
    public String getSphone()
    {
        return Sphone;
    }
    public void setSphone(String ph)
    {
        this.Sphone=ph;
    }
}
public class EncapsulationDemo
{
    public static void main(String args[])
    {
        Student s=new Student();
        s.Sname="vamsi";
        s.setSphone("xxxxxx083");
        System.out.println("Student name is "+s.Sname);
        System.out.println("Student phone number is "+s.getSphone());
    }
}
