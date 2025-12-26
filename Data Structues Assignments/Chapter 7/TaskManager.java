import java.util.PriorityQueue;

public class TaskManager
{
    public static void main(String[] args) 
    {
        PriorityQueue<Task> taskQueue=new PriorityQueue<>();

        taskQueue.add(new Task(5, "Complete the quarterly report"));
        taskQueue.add(new Task(1, "Emergency meeting with the team"));
        taskQueue.add(new Task(3, "Schedule annual review"));
        taskQueue.add(new Task(2, "Update project roadmap"));
        taskQueue.add(new Task(4, "Reply to client emails"));

        System.out.println("Processing tasks based on priority: ");

    
        while(!taskQueue.isEmpty())
        {
            System.out.println(taskQueue.poll());
        }
    }
}