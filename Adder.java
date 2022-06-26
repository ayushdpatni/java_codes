import java.util.Scanner;

public class Adder {

    public int arr[];
    public int targetSum;

    public Adder(int arr[], int targetSum) {
        this.arr = arr;
        this.targetSum = targetSum;
    }

    public int[] numsum() {
        int arr1[] = new int[2];
        int arr2[] = new int[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum && arr[i] != arr[j]) {
                    arr1[0] = arr[i];
                    arr1[1] = arr[j];
                    return arr1;
                }
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Adder a = new Adder(arr, target);
        int nArr[] = a.numsum();
        if(nArr.length==0){
            System.out.println("[ ]");
        }else{
            System.out.println("["+nArr[0]+","+nArr[1]+"]");
        }
    }
}