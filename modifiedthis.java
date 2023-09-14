import java.io.*;
class Student
{
    int rollnumber;
    String name;
    float fee;
    Student(int rollnumber,String name,float fee)
    {
        this.rollnumber=rollnumber;
        this.name=name;
        this.fee=fee;
    }
    void display()
    {
        System.out.println(rollnumber+ " "+name+" "+fee);
    }
}
public class ThisDemo1
{
    public static void main(String args[])
    {
        System.out.println("Students details are : ");
        System.out.println("regdno   student name     fee");
        Student s1=new Student(4247,"--->vamsikrishna--->",47500);
        Student s2=new Student(4220," --->phenhas---> ",48000);
        s1.display();
        s2.display();
    }
}
