public class TestBalance
{
   public static void main (String [] args)
   {

   BalanceChecker myBC = new BalanceChecker();

   String parensString = "[(])";
   System.out.println ("Valid (" + parensString + ") = " + myBC.checkBalance (parensString));
   
   parensString = "([(4+5)*(2+3)+6]/(8-7))+9";
   System.out.println ("Valid (" + parensString + ") = " + myBC.checkBalance (parensString));

   parensString = "4*(3+5)-(2*6)";
   System.out.println ("Valid (" + parensString + ") = " + myBC.checkBalance (parensString));

   parensString = "([]";
   System.out.println ("Valid (" + parensString + ") = " + myBC.checkBalance (parensString));

   }
}
