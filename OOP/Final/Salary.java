public class Salary 
{
    String[]name;
    int []score;
    int[]salary;
    double bonus;
    double total;

    public Salary(String[]newName,int[]newScore,int[]newSalary)
    {
        name=newName;
        score=newScore;
        salary=newSalary;
    }

    public void calculateBonus()
    {
        for (int i = 0; i < score.length; i++) 
        {
            switch (score[i]) 
            {
                case 3:
                    bonus= salary[i] * 0.01;
                    total= bonus + salary[i];
                    break;
                
                case 4:
                    bonus = salary[i] * 0.03;
                    total = bonus +salary[i];
                    break;

                default:
                    bonus = 0;
                    total = bonus + salary[i];
                    break; 
            }

        System.out.printf("%s\t%d\t%d\t%.0f\t%.0f", name[i],score[i],salary[i],bonus,total);
        System.out.println();
        }
    }
}
