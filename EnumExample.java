

public class EnumExample {
    Day day;

    public EnumExample(Day day) {
        this.day = day;
    }

    public void printDay() {
        System.out.println("The day is " + day);
    }

    public static void main(String[] args) {
        EnumExample firstDay = new EnumExample(Day.MONDAY);
        firstDay.printDay();
    }
}
