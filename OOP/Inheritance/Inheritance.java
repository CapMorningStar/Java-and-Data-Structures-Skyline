public class Inheritance{
    public static void main(String[] args) {
        Person person=new Person("Alice Smith");
        
        person.setName("Wutyee");
        person.writeOutput();

        Student student=new Student("KYAW SOE LWIN",22);
        student.writeOutput();
        student.setName("Putuu");
        student.writeOutput();

        Undergraduate undergraduate=new Undergraduate("Wai Yan Htun",60,2);
        undergraduate.writeOutput();
        undergraduate.setLevel(4);
        undergraduate.setName("Swan");
        undergraduate.setStudentNumber(588);
        undergraduate.writeOutput();


    }
}