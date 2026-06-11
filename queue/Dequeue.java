public class Dequeue {
    int queue[] = {10, 20, 30, 40, 50};
    int front = 0;
    int rear = 4;

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted Element: " + queue[front]);
        front++;
    }

    void display() {
        if (front > rear) {
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
        Dequeue q = new Dequeue();

        q.display();
        q.dequeue();
        q.display();
    }
}