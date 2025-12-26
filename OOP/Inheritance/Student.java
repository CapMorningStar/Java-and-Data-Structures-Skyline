public class Student extends Person{
    private  int studentID;

    public Student(){
        super();
        studentID=0;
    }

    public Student(String studentName,int number){
        super(studentName);
        studentID=number;
    }

    public void setStudentNumber(int number){
        studentID=number;

    }

    public int getstudentNumber(){
        return studentID;
    }

    @Override
    public void writeOutput(){
        super.writeOutput();
        System.out.println("ID "+studentID);
    }
}