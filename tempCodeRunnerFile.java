import java.util.Scanner;

class Triangle extends Shape {
    float height, base;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the triangle: ");
        height = sc.nextFloat();
        System.out.println("Enter the base of the triangle: ");
        base = sc.nextFloat();

    }

    void setArea() {
        float area = 0.5f * height * base;
        System.out.println("The area of the triangle is: " + area);
    }
}

class Square extends Shape {
    int side;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the Square: ");
        side = sc.nextInt();
    }

    void setArea() {
        long area = side * side;
        System.out.println("The area of the Square is: " + area);
    }

}

class Circle extends Shape {
    static float pi=3.14f;
    float radius;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = sc.nextFloat();
        sc.close();
    }

    void setArea() {
        float area = pi * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}

class Shape {
    void getInput() {
        System.out.println("In the base class");
    }
}

public class Lab3 {
    public static void main(String[] args) {
        Triangle obj1 = new Triangle();
        obj1.getInput();
        obj1.setArea();

        Square obj2 = new Square();
        obj2.getInput();
        obj2.setArea();

        Circle obj3 = new Circle();
        obj3.getInput();
        obj3.setArea();

    }
}
