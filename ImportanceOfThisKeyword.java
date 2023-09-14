import java.io.*;
class Student
{
    int rollnumber;
    String name;
    float fee;
    Student(int rollnumber,String name,float fee)
    {
        rollnumber=rollnumber;
        name=name;
        fee=fee;
    }
    void display()
    {
        System.out.println("Student details are : ");
        System.out.println(rollnumber+ " "+name+" "+fee);
    }
}
public class ThisDemo1
{
    public static void main(String args[])
    {
        Student s1=new Student(4247,"vamsikrishna",47500);
        Student s2=new Student(4220,"phenhas",48000);
        s1.display();
        s2.display();
    }
}
