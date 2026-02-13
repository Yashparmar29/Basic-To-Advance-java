import java.util.EmptyStackException;

class simple_stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public simple_stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    public int peek() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        simple_stack myStack = new simple_stack(5);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println(myStack.pop()); 
        System.out.println(myStack.peek());
    }
}