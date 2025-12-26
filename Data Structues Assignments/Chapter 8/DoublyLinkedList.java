

public class DoublyLinkedList
{   
    private Node head;
    private Node tail;
    private int size;

    private class Node
    {
        int data;
        Node prev;
        Node next;

        public Node(int obj)
        {
            data=obj;
            prev=null;
            next=null;
        }
    }

    public DoublyLinkedList()
    {
        head=null;
        tail=null;
        size=0;
    }
    
    public void addFirst(int data)
    {
        Node newNode=new Node(data);

        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        
    }

    public int removeFirst()
    {  
        
        if(head==null)
        {   throw new  RuntimeException("Cannot remove from an empty list");
        
        }

        int result =head.data;
        if(head==tail)
        {
            head=null;
            tail=null;
        }
        else
        {
            
            head=head.next;
            head.prev=null;
            
        }
        return result;
        
    }

    public void addLast(int value)
    {   Node newNode=new Node(value);
        if(tail==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

    public int removeLast()
    {
        if(tail==null)
        {
            throw new RuntimeException("Cannot remove from an empty list");

        }
        int result=tail.data;
        
            if(tail==head)
            {
                head=null;
                tail=null;
            }
            else
            {
                tail=tail.prev;
                tail.next=null;

            }
        return result;

    }

    public void printForward()
    {
        Node current=head;
        while(current!=null)

        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    public void printBackward()
    {
        Node current=tail;
        while(current!=null)
        {
            System.out.print(current.data+ " ");
            current=current.prev;
        }
        System.out.println();
    }
        
}

   



