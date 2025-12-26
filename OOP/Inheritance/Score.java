import java.util.*;
public class Score

{   public static void main(String[] args)
    {
        
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the number of people: ");
            int number=input.nextInt();
           
            Animal[] living=new Animal[number];
            
            
            for(int i=0;i<number;i++)
            {   int numberPerson=i+1;
                input.nextLine();
                System.out.println("Enter "+numberPerson+" person name: ");
                
                String name=input.nextLine();
                
                System.out.println("Enter "+numberPerson+" person age: ");
                int age=input.nextInt();
            
                living[i]=new Animal(name,age);
                System.out.println();
            }
            System.out.println("Before Sort: ");
            for(Animal a: living)
            {
                System.out.println(a);
            }
        
            for (int i = 0; i < living.length-1; i++)
            {
                int max=i;
                for (int j = i+1; j <living.length ; j++) 
                {
                    if(living[max].getAge()<living[j].getAge())
                    {
                        max=j;
                    }

                    
                    Animal temp=living[max];
                    living[max]=living[i];
                    living[i]=temp;
              
                }
                System.out.println("After Sort: ");
                for(Animal a: living)
                {
                    System.out.println(a);
                }

            }
    }
}