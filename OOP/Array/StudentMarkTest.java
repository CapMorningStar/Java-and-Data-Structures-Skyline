import java.util.*;
public class StudentMarkTest{
    public static void main(String[] args) 
    {   Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int k=input.nextInt();
        StudentMark student= new StudentMark();
        student.user(k);

    }
}