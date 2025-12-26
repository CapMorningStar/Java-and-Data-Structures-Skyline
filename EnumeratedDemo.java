import EnumeratedDemo.Days;
import EnumeratedDemo.Stoplight;
import EnumeratedDemo.Stoplight;
import java.util.Scanner;

public class EnumeratedDemo{
    public enum Stoplight{
        RED,YELLOW,GREEN
    }

    public static void whichlight(Stoplight myLight){
        switch(myLight){
            case RED: System.out.println("Please stop");
            break;

            case YELLOW: System.out.println("Proceed with caution");
            break;

            case GREEN: System.out.println("Go!");
            break;
        }
    }



    public enum Days{
        MONDAY,TUESDAY
    }

    public static void whichDay(Days user){
        switch(user){
        case MONDAY: System.out.println("YOur lucky Day");
        break;

        case TUESDAY:System.out.println("Busy Day");
    
    }
        

        
    }

    public static void main(String[] args) {
        Stoplight r=Stoplight.YELLOW;
        whichlight(r);
        Scanner input=new Scanner(System.in);
        System.out.println("What color is the light?");
        String color=input.nextLine().toUpperCase();
        Stoplight k=Stoplight.valueOf(color);
        whichlight(k);


        Days user=Days.MONDAY;
        whichDay(user);

        System.out.println("ENter the tuesday");
        String userInput=input.nextLine().toUpperCase();
        Days variable=Days.valueOf(userInput);
        whichDay(variable);


        
    }
}