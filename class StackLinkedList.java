class StackLinkedList {

    Node top;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Push: Add element
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;

        System.out.println(data + " pushed into stack");
    }

    // Pop: Remove top element
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow!");
            return;
        }

        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    // Peek: Show top element
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    // Display stack
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;

        System.out.println("Stack elements:");

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}