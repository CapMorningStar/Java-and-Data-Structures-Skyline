

public class ArrayStackTest
{
    public static void main(String[] args) 
    {
        ArrayStack stack=new ArrayStack(5);
        stack.push(30);
        stack.push(40);
        stack.push(10);

        stack.printStack();

        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();

        stack.push(12);
        int topElement=stack.peak();
        stack.printStack();
        System.out.println("Top: "+topElement);

        

    }
}