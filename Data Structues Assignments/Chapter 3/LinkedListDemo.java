public class LinkedListDemo
{
    static class LinkedList<E>
    {
        private Node<E> head;
        private int currentSize;

        private static class Node<E>
        {
            E data;
            Node<E> next;

            public Node(E obj)
            {
                data=obj;
                next=null;
            }
        }
        public LinkedList()
        {
            head=null;
            currentSize=0;
        }

        public boolean isEmpty()
        {
            return head==null;
        }

        public int size()
        {
            return currentSize;
        }

        public void addFirst(E obj)
        {
            Node<E> node=new Node<E>(obj);
            node.next=head;
            head=node;
            currentSize++;
        }

        public E removeFirst()
        {
            if(isEmpty())
            {
                return null;
            }
            E removedData=head.data;
            head=head.next;
            return removedData;

        }

        public void printList()
        {
            Node<E> current=head;
            while(current!=null)
            {   System.out.println(current.data+"->");
                current=current.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) 
        {
            LinkedList<String> myList=new LinkedList<>();

            System.out.println("Is the list empty? "+myList.isEmpty());

            myList.addFirst("C");
        }
    }
}