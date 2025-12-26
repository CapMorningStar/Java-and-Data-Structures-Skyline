public class ArrayStack
{   private int[] stack;
    private int top;
    private int capacity;

    public ArrayStack(int size)
    {
        stack=new int[size];
        capacity=size;
        top=-1;
    }

    public int push(int item)
    {   
        if(isFull())
        {
            System.out.println("StackOverFlow");
        }
        return stack[++top]=item;
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack UnderFlow");
        }
        return stack[top--];
    }

    public int peak()
    {   if(!isEmpty())
        {
            return stack[top];
        }
        else
        {
            System.out.println("Stack is empty");
        }
        return -1;
    }

    public boolean isEmpty()
    {
        return top==-1;
    }

    public boolean isFull()
    {
        return top==capacity-1;
    }

    public void printStack()
    {
        for (int i = 0; i <=top; i++) 
        {
            System.out.println(stack[i]+" ");
        }
        System.out.println();
    }


}