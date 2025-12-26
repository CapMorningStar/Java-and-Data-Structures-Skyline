//KYAW SOE LWIN
//Lab 7
//10 May 2025
//The program is about double intPower to compute x^n, where n is a positive integer and x is a double precision variable

public class TestIntPower 
{
    public static void main(String[] args) 
    {
        double[][] tests = {
            {2.0, 10},   
            {5.0, 3},    
            {1.5, 4},   
            {2.0, 0},   
            {7.0, 1}     
        };
        for (double[] t : tests) 
        {
            double x = t[0];
            int n      = (int) t[1];
            System.out.printf("intPower(%s, %d) = %s%n", x, n, IntPower.intPower(x, n));
        }
    }
}
