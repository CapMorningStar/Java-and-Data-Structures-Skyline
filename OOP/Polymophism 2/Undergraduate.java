public class Undergraduate extends Student{
    int year;

    public Undergraduate(String studentName,int studentNumber,int level){
        super(studentName, studentNumber);
        year=level;
    }

    @Override
    public void writeOutput(){
        super.writeOutput();
        System.out.println("Year: "+year);
    }
}