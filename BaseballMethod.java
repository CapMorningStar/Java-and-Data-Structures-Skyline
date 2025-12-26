//KYAW SOE LWIN
//20 October 2024
//Lab 11
//The program is about indicating the scoring teamn and the number of points scored.

public class BaseballMethod
{
    String team1Name="Cats";
    String team2Name="Dogs";
    int team1Score=0;
    int team2Score=0;
    String status="In Progress";

    public void onePoint(char team)
    {
        if(team == 'a')
        {
            team1Score+=1;
        }
        else if (team == 'b')
        {
            team2Score+=1;
        }
        else
        {
            System.out.println("Invalid input!. . .Enter team (a for Cats, b for Dogs): ");
        }
    }

    public void twoPoint(char team)
    {
        if(team == 'a')
        {
            team1Score+=2;
        }
        else if (team == 'b')
        {
            team2Score+=2;
        }
        else
        {
            System.out.println("Invalid input!. . .Enter team (a for Cats, b for Dogs): ");
        }
    }
    public void threePoint(char team)
    {
        if(team == 'a')
        {
            team1Score+=3;
        }
        else if (team == 'b')
        {
            team2Score+=3;
        }
        else
        {
            System.out.println("Invalid input!. . .Enter team (a for Cats, b for Dogs): ");
        }
    }

    
    public void getWinningTeam()
    {
        String winningTeam= team1Score>team2Score?team1Name:team2Name;
        System.out.println(team1Name + " " +team1Score + ", " + team2Name + " " + team2Score + ";");
        if(team1Score != team2Score)
        {
            System.out.println(winningTeam + " are winning");
        } 
        else 
        {
            System.out.println("It's a tie.");
        }
 
    }
    public String getStatus()
    {
        return status;
    }

    public void finishGame(){
        status="Finished";
        System.out.println(status);
    }
}
