import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList
{
    public static void main(String[] args) 
    {
        Queue<String> queue=new LinkedList<>();

        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");
        queue.offer("Diana");
        queue.offer("Evan");

        System.out.println("Dequeued: "+queue.poll());
        System.out.println("Dequeued: "+queue.poll());

        System.out.println("Front element: "+queue.peek());
        System.out.println("Is the queue empty? "+queue.isEmpty());
    }

}