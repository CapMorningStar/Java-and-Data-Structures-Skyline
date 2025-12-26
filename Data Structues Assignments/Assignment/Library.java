//KYAW SOE LWIN
//Lab1
//30 Jan 2025
//The program is about a library system simulating book storage, random add/remove operations, and non-interactive execution.

public class Library
{
    private String bookName;
    private String author;
    private String decimalNumber;
    private int floor=0;
    private int section=0;

    public Library(String newBookName, String newAuthor, String NewDecimalNumber, int newFloor,int newSection)
    {
        bookName=newBookName;
        author=newAuthor;
        decimalNumber=NewDecimalNumber;
        floor=newFloor;
        section=newSection;

    }

    public String getnewBookName()
    {
        return bookName;
    }

    public String getnewAuthor()
    {
        return author;
    }

    public String getdecimalNumber()
    {
        return decimalNumber;
    }

    public int getfloor()
    {
        return floor;
    }
    
    public int getSection()
    {
        return section;
    }

    public String toString()
    {
        return "Name: "+getnewBookName()+
                "\nAuthor: "+getnewAuthor()+
                "\nDecimal Number: "+getdecimalNumber()+
                "\nFloor: "+getfloor()+

                "\nSection: "+getSection();
    }
}