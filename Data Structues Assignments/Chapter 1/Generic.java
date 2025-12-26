public class Generic<T>
{   private T t;

    public void set(T t)
    {
        this.t = t;
    }

    public T get()
    {
        return t;
    }
    public static void main(String[] args) {
        Generic<Integer> integerBox=new Generic<>();
        Generic<String> stringBox=new Generic<>();
        
        integerBox.set(10);
        stringBox.set("Hello World");

        System.out.println("Integer Value: "+integerBox.get());
        System.out.println("String Value:"+stringBox.get());

    }
}