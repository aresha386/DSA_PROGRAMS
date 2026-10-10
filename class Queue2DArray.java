class Queue2DArray {

    int[][] queue = new int[5][2];
    int front = 0;
    int rear = -1;
    int count = 0;

    // Enqueue
    void enqueue(int data) {
        if (count == queue.length) {
            System.out.println("Queue Overflow!");
            return;
        }

        rear++;
        queue[rear][0] = data;
        queue[rear][1] = 1;
        count++;

        System.out.println(data + " added to queue");
    }

    // Dequeue
    void dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Removed: " + queue[front][0]);

        queue[front][1] = 0;
        front++;
        count++;
        count--;
    }

    // Display
    void display() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = front; i <= rear; i++) {
            if (queue[i][1] == 1) {
                System.out.print(queue[i][0] + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Queue2DArray q = new Queue2DArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        q.dequeue();
        q.display();
    }
}