public class ArrayQueue
{   
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public ArrayQueue(int size)
    {
        capacity=size;
        queue= new int[capacity];
        rear=-1;
        front=-1;

    }

    public boolean isEmpty()
    {
        return front==-1;
    }

    public boolean isFull()
    {
        return (rear+1)%capacity==front;
    }

    public void enqueue(int value)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
            return;
        }
        else
        if(isEmpty())
        {
            front=0;
        }

        rear=(rear+1)%capacity;
        queue[rear]=value;

        
    }

    public int dequeue()
    {
        if(isEmpty())
        {   System.out.println("Queue");
            return -1;
        }
        int result=queue[front];
        if(front==rear)
        {
            return front=rear=-1;
        }
        else
        {
           
        front=(front+1)%capacity;
        }
        
        System.out.println("Dequeue: "+result);
        return result;
    }

    public int getFront()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }

    public void displayQueue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
        }

        int i=front;
        for(int count=0;count<queue.length;count++)
        {
            System.out.print(queue[i]+" ");
            if(rear==i)
            
                break;
            i=(i+1)%capacity;

        }
    }

    public static void main(String[] args) 
    {
        ArrayQueue queue=new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        
        queue.displayQueue();

        queue.enqueue(60);
        queue.dequeue();
        queue.dequeue();

        System.out.println("Front element "+queue.getFront());
        queue.displayQueue();
        System.out.println();
        queue.enqueue(60);
        queue.enqueue(70);

        
        queue.displayQueue();

        queue.enqueue(80);
    }
}