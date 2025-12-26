//KYAW SOE LWIN
//Lab 5
//10 May 2025
// The program is aboout managing a stack of returned library books

public class Book 
{
    private String title;
    private String author;
    private String bookID;

    public Book(String newTitle, String newAuthor, String newBookID) 
    {
        title  = newTitle;
        author = newAuthor;
        bookID = newBookID;
    }

    public String getTitle()   
    { 
        return title;  
    }
    public String getAuthor()  
    { 
        return author; 
    }
    public String getBookID()  
    { 
        return bookID; 
    }

    @Override
    public String toString() 
    {
        return String.format("\"%s\" by %s (ID: %s)", title, author, bookID);
    }
}
