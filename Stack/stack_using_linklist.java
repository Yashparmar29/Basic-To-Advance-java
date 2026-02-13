class stack_using_linklist 
{
    private Node top;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    public int peek() {
        if (top == null) {
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        stack_using_linklist stack = new stack_using_linklist();
        stack.push(50);
        stack.push(100);
        
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
    }
}