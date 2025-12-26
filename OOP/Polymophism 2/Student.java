public class Student extends Person{
    int ID;

    public Student(String studentName,int studentNumber){
        super(studentName);
        ID=studentNumber;

    }

    @Override
    public void writeOutput(){
        super.writeOutput();
        System.out.println("Student Number: "+ID);
    }
}