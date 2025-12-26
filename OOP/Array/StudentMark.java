import java.util.*;
public class StudentMark
{   double high=0.0;
    double low=0.0;
    int count=0;

    
    
    


    public void user(int k)
    {
        double[] marks=new double[k];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the marks: ");
        for(int i=0; i<marks.length;i++)
        {   
            marks[i]=input.nextDouble();    
            if(marks[i]>= 500)
            {
                count++;
            }

           
            
        }
        
        System.out.println();
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]>high)
            {
                high=marks[i];
            }

        
        }

        System.out.println("Highest: "+high);
            low=marks[0];
            for(int j=1; j<marks.length;j++)
            {
            if(marks[j]<low){
                low=marks[j];
            }
            }
        
        System.out.println("Lowest: "+low);
        
        System.out.println("Pass: "+count);
        int fail=k-count;
        System.out.println("Fail: "+fail);


    }

   
}