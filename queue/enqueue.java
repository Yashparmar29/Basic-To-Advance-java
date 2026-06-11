import java.util.Scanner;

public class enqueue {
    int queue[] = new int[5];
    int front = -1, rear = -1;

    void enqueue(int data) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        queue[++rear] = data;
        System.out.println(data + " inserted into queue");
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue Elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        enqueue q = new enqueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
    }
}