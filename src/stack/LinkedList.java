package stack;

public class LinkedList<M> {
    Node<M> head;
    Node<M> tail;

    public void push(M data){
        Node<M> newNode = new Node<>(data);
        if (head==null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void append(M data){
        Node<M> newNode = new Node<>(data);
        if (head==null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public M peak(){
        M peakElement = head.data;
        return peakElement;
    }

    public M pop(){
        M popElement = head.data;
        head = head.next;
        return popElement;
    }

    public M popLast(){
        M popLastElement = tail.data;
        Node<M> temp = head;
        while(temp!=null){
            System.out.println(temp.data+ " => ");
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return popLastElement;
    }

    public void display(){
        Node<M> temp = head;
        while(temp!=null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

}
