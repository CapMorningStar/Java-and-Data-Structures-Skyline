public class BookTest
{
    public static void main(String[] args) 
    {
        Book[] books=new Book[3];
        books[0]=new Book("Java","James Gosling");
        books[1]=new Book("C++", "Kyaw Gyi");
        books[2]=new Book("Python", "Guido van Rossum");  

        for(Book item:books)
        {
            System.out.println(item);
        }
    }
}