//KYAW SOE LWIN
//Aug21
//Lab3
//This program measure plant grow day by day

import java.util.Scanner;

public class MeasuringPlantGrow
 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Type your plant's height(inches) of yesterday: ");
		int yesterday=input.nextInt();
		System.out.println("Type your plant's height(inches) of today: ");
		int today=input.nextInt();
		
		int difference= today-yesterday;
		System.out.println("Your plant is "+difference+" inches higher");
		

	}

}