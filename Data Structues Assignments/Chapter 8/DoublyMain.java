

public class DoublyMain
{
    public static void main(String[] args)
    {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.addFirst(30);
        dll.addFirst(20);
        dll.addFirst(10);
        dll.addLast(20);
        dll.addLast(10);
        dll.printForward();

        dll.printBackward();
        dll.removeFirst();
        dll.removeLast();
        dll.removeLast();

        dll.printForward();
        dll.printBackward();
        
    }
}