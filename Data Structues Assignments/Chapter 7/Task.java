public class Task implements Comparable<Task>
{
    private int priority;
    private String descrption;

    public Task (int priority, String description)
    {
        this.priority=priority;
        this.descrption=description;
    }

    @Override
    public int compareTo(Task other)
    {
        return Integer.compare(this.priority, other.priority);
    }

    public String toString()
    {
        return descrption+"(Priority: "+priority+")";
    }
}