import java.util.Scanner;

public class Adder1 {
    public int n;
    public int targetSum;
    public int[] array = new int[100];

    public void getdata(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        n = sc.nextInt();
        // creates an array in the memory of length 100
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        System.out.println("Enter the Target Sum: ");
        targetSum=sc.nextInt();

        System.out.println("Array elements are: ");
        // accessing array elements using the for loop
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        System.out.println(n+" is the array size");
        

    }
    public int[] numSum() {
        int arr1[] = new int[2];
        int arr2[] = new int[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == targetSum && array[i] != array[j]) {
                    arr1=new int[]{array[i],array[j]};
                    return arr1;
                }
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        Adder1 obj=new Adder1();
        obj.getdata();
        System.out.println("The Target sum is: "+obj.targetSum);
        System.out.println("The Required array is : ");
        for (int i = 0; i < obj.n; i++) {
            System.out.println(obj.numSum()[i]);
        }
    }
    

}