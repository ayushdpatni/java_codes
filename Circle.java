import java.util.Scanner;
public class Circle extends shape{
    public void setArea(float radius) {
        float area = 3.14f*radius*radius;
        System.out.println("Area of Circle is "+ area);
    }
    public void getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius: ");
        a=sc.nextFloat();
    }
}
