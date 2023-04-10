import java.sql.Array;
import java.util.Scanner;


public class Main {

    static void showArray(int array[]){
        int size= array.length;
        for (int i = 0; i <= size-1; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        System.out.println("Please enter an array");
        int[] arr= new int[size]; //1,2,3,4,5
        for (int i = 0; i <= size - 1; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("\nBefore reverse");
        showArray(arr);

        System.out.println("\n-----------------------\nAfter reverse");
        reverseArray(arr,size);
        showArray(arr);

    }

    private static void reverseArray(int[] arr, int size) {
        int temp=0, start=0, end= size-1;
        while (start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}