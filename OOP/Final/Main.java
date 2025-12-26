public class Main 
{
    public static void main(String[] args) 
    {
        String[] name={"Jane","Tom","Mary","Sue","Jack"};
        int[]score={4,1,2,3,4};
        int[]salary={80000,80000,80000,80000,80000};

        Salary se = new Salary(name, score, salary);
        se.calculateBonus();

    }    
}
