package stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.printStack();
        stack.peak();
        System.out.println("Peak Element =>> "+stack.peak());
        stack.printStack();
        int temp = stack.pop();
        System.out.println("Pop Element =>> "+temp);
        stack.printStack();
        System.out.println();
        stack.peak();
        System.out.println("Peak Element =>> "+stack.peak());
        stack.printStack();
        int temp1 = stack.pop();
        System.out.println("Pop Element =>> "+temp);
        stack.printStack();
        System.out.println();
        stack.peak();
        System.out.println("Peak Element =>> "+stack.peak());
        stack.printStack();
        int temp2 = stack.pop();
        System.out.println("Pop Element =>> "+temp);
        stack.printStack();
    }
}
