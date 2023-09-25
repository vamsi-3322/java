import java.io.*;
class OuterClass {
    static int outer_x=10;
    int outer_y=20;
    private  int outer_z=30;
   
    class InnerClass {
        void display(){
            
            System.out.println("Outer X is "+outer_x);
            System.out.println("Outer Y is "+outer_y);
            System.out.println("Outer Z is "+outer_z);
        }
    }
}
public class InnerClassDemo {
    public static void main(String args[]){
       OuterClass oc = new OuterClass();
       OuterClass.InnerClass ic=oc.new InnerClass();
       ic.display();
    }
}
