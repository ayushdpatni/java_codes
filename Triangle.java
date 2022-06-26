import java.util.Scanner;
public class Triangle extends shape{
    public void setArea(double base, double height) {
        double area = 0.5*base*height;
        System.out.println("Area of Triangle is "+ area);
    }
    public void getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base: ");
        a=sc.nextFloat();
        System.out.println("Enter height: ");
        b=sc.nextFloat();
    }
}