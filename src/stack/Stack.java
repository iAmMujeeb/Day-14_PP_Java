package stack;

public class Stack<M> {
    LinkedList<M> linkedList = new LinkedList();

    public void push(M item){
        linkedList.push(item);
    }

    public M peak(){
        return linkedList.peak();
    }

    public M pop(){
        return linkedList.pop();
    }

    public void printStack(){
        System.out.print("Stack is =>> ");
        linkedList.display();
    }

}
