import java.util.Scanner;

public class shape {
    protected float a,b;
    public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
    }
    public void setArea(){
        System.out.println("Inside the shape class");
    }

    public float getA(){
        return a;
    }
    public float getB(){
        return b;
    }
}
