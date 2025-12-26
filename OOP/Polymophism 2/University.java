public class University{
    public static void main(String[] args) {
        Person[] person=new Person[3];
        person[0]=new Person("Human");
        person[1]=new Student("KYAW SOE LWIN", 1358852);
        person[2]=new Undergraduate("Ted", 8785, 2);

        for(Person num:person){
            num.writeOutput();
            System.out.println();
        }
    }
}