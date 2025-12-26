//KYAW SOE LWIN
//20 October 2024
//Lab 11
//The program is about indicating the scoring teamn and the number of points scored.

import java.util.Scanner;

public class BaseballMainTest
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       BaseballMethod game=new BaseballMethod();
        String input="";

       while(game.status.equals("In Progress"))
       {
            System.out.print("Enter team (a for Cats, b for Dogs) and"+
            " score (E.g 1,2, or 3) and type 'end' to finish the game: ");
            input=sc.nextLine(); 

            if(input.equals("end"))
            {
                break;
            }
            char team=input.charAt(0);
            int points=Character.getNumericValue(input.charAt(2));
            if(points==1)
            {
                game.onePoint(team);
                game.getWinningTeam();
            }
            else  if(points==2)
            {
                game.twoPoint(team);
                game.getWinningTeam();
            }
            else  if(points==3)
            {
                game.threePoint(team);
                game.getWinningTeam();
            }
            else 
            {
                System.out.println("Invalid input!. . .Enter score (E.g 1,2, or 3):");
            }
            
       }
        
       game.finishGame();
       
    }
}