package boundedQueue;

public class Main {
    public static void main(String[] args) {
        // Create a queue with a max size of 5
        QueueX queue = new QueueX(5);

        // Enqueue some elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Attempting to enqueue when the queue is full
        queue.enqueue(60);  // This should print "Queue is full"

        // Peek the front element
        System.out.println("Front element: " + queue.peek());  // Expected: 10

        // Dequeue some elements
        System.out.println("Dequeue: " + queue.dequeue());  // Expected: 10
        System.out.println("Dequeue: " + queue.dequeue());  // Expected: 20

        // Peek after dequeuing
        System.out.println("Front element after dequeue: " + queue.peek());  // Expected: 30

        // Enqueue more elements
        queue.enqueue(60);
        queue.enqueue(70);

        // Print all remaining elements in the queue
        System.out.println("Dequeue: " + queue.dequeue());  // Expected: 30
        System.out.println("Dequeue: " + queue.dequeue());  // Expected: 40
        System.out.println("Dequeue: " + queue.dequeue());  // Expected: 50
        System.out.println("Dequeue: " + queue.dequeue());  // Expected: 60
        System.out.println("Dequeue: " + queue.dequeue());  // Expected: 70
    }
}
