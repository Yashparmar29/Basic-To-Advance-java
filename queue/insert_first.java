import java.util.Scanner;

public class insert_first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[20];

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to insert at first: ");
        int value = sc.nextInt();

        for (int i = n; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = value;
        n++;

        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}