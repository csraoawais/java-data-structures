import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Integer peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack);
        Integer pop = stack.pop();
        System.out.println("the object popped = " + pop);
        System.out.println(stack);

    }
}
