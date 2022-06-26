package com.learner;
import java.util.*;

abstract class Vehicle {
    abstract void typeVehicle();
}

class Helicopter extends Vehicle {
    void typeVehicle() {
        System.out.println("moving Helicopter");
    }
}

class Train extends Vehicle {
    void typeVehicle() {
        System.out.println("moving Train");
    }
}

class Car1 extends Vehicle {
    void typeVehicle() {
        System.out.println("moving Car");
    }
}

class assignment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for Car\n2 for Helicopter\n3 for Train\nInput: ");
        int a = sc.nextInt();
        if (a == 1) {
            Vehicle s1 = new Car1();
            s1.typeVehicle();
        } else if (a == 2) {
            Vehicle s2 = new Helicopter();
            s2.typeVehicle();
        } else if (a == 3) {
            Vehicle s3 = new Train();
            s3.typeVehicle();
        }
        sc.close();
    }
}