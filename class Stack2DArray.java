class Stack2DArray {

    int[][] stack = new int[5][2];
    int top = -1;

    // Push
    void push(int data) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow!");
            return;
        }

        top++;
        stack[top][0] = data;
        stack[top][1] = 1;

        System.out.println(data + " pushed into stack");
    }

    // Pop
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return;
        }

        System.out.println("Popped: " + stack[top][0]);

        stack[top][1] = 0;
        top--;
    }

    // Peek
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stack[top][0]);
        }
    }

    // Display
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack (Top to Bottom):");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i][0]);
        }
    }

    public static void main(String[] args) {
        Stack2DArray s = new Stack2DArray();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}