//KYAW SOE LWIN
//Lab 7
//10 May 2025
//The program is about double intPower to compute x^n, where n is a positive integer and x is a double precision variable

public class IntPower 
{
    public static double intPower(double x, int n) 
    {
        if (n < 0) 
        {
            throw new IllegalArgumentException("Exponent must be non-negative");
        }
        if (n == 0) 
        {
            return 1.0;
        }
        if (n == 1) 
        {
            return x;
        }

        double half = intPower(x, n / 2);
        double result = half * half;
        return (n % 2 == 0) ? result : result * x;
    }
}
