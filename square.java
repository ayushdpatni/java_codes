import java.util.Scanner;
public class square extends shape{
    public void setArea(float side) {
        float area = side*side;
        System.out.println("Area of Square is "+ area);
    }
    public void getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Side: ");
        a=sc.nextFloat();
    }
}