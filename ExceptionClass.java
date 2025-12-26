
class MyCustomException extends Exception{
    public MyCustomException(String message){
        super(message);
    }
}

public class ExceptionClass
{
    public static void riskyOperation(int value) throws MyCustomException
    {
        if(value<0)
        {
            throw new MyCustomException("Value must be non-negative");
        }
    }

    public static void uncheckedOperation()
    {
        int[] array=new int[5];

        try {
            int element=array[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Logging unchecked exception: "+e.getMessage());
            throw e;
        }
    }

    public static void arithmeticOperation()
    {
        int zero=0;
        try 
        {
            int result=0/zero;
        } catch (ArithmeticException e)
        {
            System.out.println("Logging arithmetic exception: "+e.getMessage());
            throw e;
        }
    }



    public static void main(String[] args) 
    {
        try 
        {
            riskyOperation(-1);
        } catch (MyCustomException e)
        {
            System.out.println("Caught MyCustomException: "+e.getMessage());
        }catch(Exception e)
        {
            System.out.println("Caught general exception: "+e.getMessage());
        }finally
        {
            System.out.println("This block is always executed.");
        }

        try
        {
            uncheckedOperation();
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Caught unchecked exception: "+e.getMessage());

        }

        try 
        {
            arithmeticOperation();
        } catch (ArithmeticException e) 
        {
            System.out.println("Caught arithmetic exception: "+e.getMessage());
        }
            System.out.println("Program continues after exception handling");
        
        
    }
}

