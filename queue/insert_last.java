

import java.util.Scanner;

public class insert_last 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[20];

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to insert at last: ");
        int value = sc.nextInt();

        arr[n] = value;
        n++;

        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}
