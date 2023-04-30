package queue;

public class Node<M> {
    M data;
    Node<M> next;

    public Node(M data){
        this.data = data;
    }

}
