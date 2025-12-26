import java.io.Serializable;

public class User implements Serializable
{
    String name;
    String password;

    public User(String newName, String newPassword)
    {
        name = newName;
        password = newPassword;
    }

    public void sayHello()
    {
        System.out.println("Hello: " + name);
    }
}
