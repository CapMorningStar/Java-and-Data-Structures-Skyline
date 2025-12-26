public class PersonProjectTest
{
    public static void main(String[] args) 
    {
        PersonProject person1 = new PersonProject("Michael", 30);
        PersonProject person2 = new PersonProject("John", 50);
        System.out.println ("Are they equal?" + person1.theyAreEqual(person2));
        person1.olderThanOther(person2);
        person1.youngerThanOther(person2);
        person1.ageCheck(person2);
        
    }
}