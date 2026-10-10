class CircularQueue {

    int[] queue = new int[5];
    int front = 0;
    int rear = -1;
    int count = 0;

    // Enqueue
    void enqueue(int data) {
        if (count == queue.length) {
            System.out.println("Circular Queue Overflow!");
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = data;
        count++;

        System.out.println(data + " added to queue");
    }

    // Dequeue
    void dequeue() {
        if (count == 0) {
            System.out.println("Circular Queue is empty");
            return;
        }

        System.out.println("Removed: " + queue[front]);

        front = (front + 1) % queue.length;
        count--;
    }

    // Display
    void display() {
        if (count == 0) {
            System.out.println("Circular Queue is empty");
            return;
        }

        System.out.print("Front -> ");

        for (int i = 0; i < count; i++) {
            int index = (front + i) % queue.length;
            System.out.print(queue[index] + " ");
        }

        System.out.println("<- Rear");
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.dequeue();
        q.dequeue();

        q.enqueue(60);
        q.enqueue(70);

        q.display();
    }
}