public class Book
{   private String title;
    private String author;
    public Book(String newTitle,String newAuthor)
    {
        title=newTitle;
        author=newAuthor;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public String toString()
    {
        return "Title: "+getTitle()+" Author: "+getAuthor();
    }
}