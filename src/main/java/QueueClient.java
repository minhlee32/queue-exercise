public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(10);
        queue.enqueue(4);
        queue.enqueue(8);
        queue.dequeue();
        queue.enqueue(2);
        queue.dequeue();
        queue.enqueue(16);
        queue.dequeue();
        queue.enqueue(4);
        queue.dequeue();
    }
}
