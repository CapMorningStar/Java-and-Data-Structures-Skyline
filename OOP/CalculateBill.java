//KYAW SOE LWIN
//Aug21
//Lab2, Demonstration Lab
//This program calculates a customer's bill
package Exercise;

public class CalculateBill {

	public static void main(String[] args) {
		int charges=100;
		int salesTax=12;
		int totalowed=charges + salesTax;
		System.out.print("You purchased $"+ charges
						+". Sales tax is $"+salesTax
						+". You owe $"+ totalowed+".");
	}

}
