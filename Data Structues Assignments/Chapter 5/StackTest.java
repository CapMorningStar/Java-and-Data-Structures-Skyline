public class StackTest
{
    public static void main(String[] args) {
        Stack stack=new Stack(5);
        stack.push(10);
        stack.push(30);
        System.out.println(stack.peek());

        stack.printStack();
        stack.push(777);
        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        
        System.out.println(stack.pop());

    }
}