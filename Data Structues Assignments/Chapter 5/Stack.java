public class Stack
{
    public int top=-1;
    public int size;
    public int[] elements;

    public Stack(int currentsize)
    {
        elements=new int[currentsize];

    }


    public void push (int item)
    {
        if(top==elements.length-1)
        {
            expandCapacity();
        }

        elements[++top]= item;

    }

    public int pop()
    {   
        if(isEmpty())
        {
            throw new IllegalStateException("Pop operation cannot performed is empty");
        }
        int result=elements[top--];
        return result;
    }

    public int peek()
    {   if(isEmpty())
        {
            throw new IllegalStateException("Peek operation is empty");
        }
        return elements[top];
    }
    public boolean  isEmpty()
    {
        return top ==-1;
    }

    public void expandCapacity()
    {
        int[] newStack=new int[elements.length*2];
        System.arraycopy(elements, 0, newStack, 0, elements.length);
        elements=newStack;
    }
   
    public void printStack()
    {
        for(int a: elements)
        {
            System.out.println(a);
        }
    }

    

}