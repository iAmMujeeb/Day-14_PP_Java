package queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enQueue(56);
        queue.enQueue(30);
        queue.enQueue(70);
        queue.printQueue();
        int temp = queue.deQueue();
        System.out.println("Dequeue Element =>> "+temp);
        queue.printQueue();
        int temp1 = queue.deQueue();
        System.out.println("Dequeue Element =>> "+temp1);
        queue.printQueue();
        int temp2 = queue.deQueue();
        System.out.println("Dequeue Element =>> "+temp2);
        queue.printQueue();
    }
}
