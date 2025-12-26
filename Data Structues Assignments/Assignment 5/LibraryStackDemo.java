//KYAW SOE LWIN
//Lab 5
//10 May 2025
// The program is aboout managing a stack of returned library books

public class LibraryStackDemo 
{
    public static void main(String[] args) 
    {
        // 1) Create an array of returned books
        Book[] returns = 
        {
            new Book("1984",                   "George Orwell",         "B001"),
            new Book("To Kill a Mockingbird", "Harper Lee",            "B002"),
            new Book("The Great Gatsby",      "F. Scott Fitzgerald",   "B003"),
            new Book("Pride and Prejudice",   "Jane Austen",           "B004"),
            new Book("Moby Dick",             "Herman Melville",       "B005")
        };

        // 2) Create the stack
        LinkedStack<Book> stack = new LinkedStack<>();

        // 3) Interleave pushes and pops
        System.out.println("=== Begin Returns Processing ===");
        System.out.println("PUSH: " + returns[0]);
        stack.push(returns[0]);
        System.out.println("PUSH: " + returns[1]);
        stack.push(returns[1]);
        System.out.println("PUSH: " + returns[2]);
        stack.push(returns[2]);

        System.out.println("POP:  " + stack.pop());
        System.out.println("PUSH: " + returns[3]);
        stack.push(returns[3]);

        System.out.println("POP:  " + stack.pop());
        System.out.println("PUSH: " + returns[4]);
        stack.push(returns[4]);

        // 4) Finally pop everything to empty
        System.out.println("\n=== Shelving Remaining Books ===");
        while (!stack.isEmpty()) 
        {
            System.out.println("POP:  " + stack.pop());
        }
        System.out.println("=== All done. Stack is empty. ===");
    }
}
