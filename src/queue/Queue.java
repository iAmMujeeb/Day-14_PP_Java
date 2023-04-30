package queue;

public class Queue<M> {
    LinkedList<M> linkedList = new LinkedList();

    public void enQueue(M item){
        linkedList.append(item);
    }

    public M deQueue(){
        return linkedList.pop();
    }

    public void printQueue(){
        System.out.print("Queue is =>> ");
        linkedList.display();
    }

}
