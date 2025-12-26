public class BookCollection
{   private String[] books;
    private int bookCount;


    public BookCollection()
    {
        books = new String[5];
        bookCount = 0;  
    }

    /**
     * Adds a book to the collection.
     * @param book the book to add
     * @return true if the book was added, false if the collection is full
     */

     public boolean addBook(String book)
     {
         if (bookCount < books.length)
         {
             books[bookCount] = book;
             bookCount++;
             return true;
         }
         else
         {
             return false;
         }
    }

         /**
        * Checks if the collection contains a book.
         *@param book The book to find
         *@return true if the book is in the collection, false otherwise
          */
         public boolean hasBook(String book)
         {
            for (int i=0;i<bookCount;i++)
            {
                if (books[i].equals(book))
                {
                    return true;
                }
            }
            return false;
         
        }

        /**
         * Main Method to demonstrate the use of BookCollection
         * @param args Coomand line arguments(not used)
         */
        
         public static void main(String[] args) {
             BookCollection myCollection=new BookCollection();
             myCollection.addBook("The Da Vinci Code");
                myCollection.addBook("The Catcher in the Rye");

                System.out.println("Doest the colletion have 'The Da Vinci Code'"+ myCollection.hasBook("The Da Vinci Code"));
                System.out.println("Does the collection have 'The Catcher in the Rye'"+ myCollection.hasBook("The Catcher in the Rye"));
         }
}

