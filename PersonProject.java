public class PersonProject
{
    public String name;
    public int age;

//constructor
   public PersonProject(String personName, int personAge)
   {
        name = personName;
        age = personAge;
   }

   public boolean theyAreEqual (PersonProject otherPerson)
   {
      return name.equals(otherPerson.name) && age == otherPerson.age;
   }  
   public boolean nameAreEqual (PersonProject otherPerson)
   {
      return name.equals(otherPerson.name);
   }
   public void olderThanOther (PersonProject otherPerson)
   {     
      String ageResult = age > otherPerson.age?name:otherPerson.name;
      System.out.println (ageResult + " is older"); 
   }
   public void youngerThanOther (PersonProject otherPerson)
   {     
      String ageResult = age < otherPerson.age?name:otherPerson.name;
      System.out.println (ageResult + " is younger"); 
   }
   public void ageCheck (PersonProject otherPerson)
   {     
      if (age > otherPerson.age)
      {
         int ageNum = age - otherPerson.age;
         String ageResult = name;
         System.out.println (ageResult + " is " +" " + ageNum + "  older than " + otherPerson.name);
         System.out.println (otherPerson.name + " is " + ageNum + " younger than " + ageResult);
      }
      else if (age < otherPerson.age)
      {
         int ageNum = otherPerson.age - age;
         String ageResult = otherPerson.name;
         System.out.println (ageResult + " is " + ageNum + " older than " + name);
         System.out.println (name + " is " + ageNum + " younger than " + ageResult);
      }
           
   }

}