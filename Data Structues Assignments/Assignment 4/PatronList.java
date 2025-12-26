//KYAW SOE LWIN
//Lab 4
//March 9
//This program uses a linked list to store library patrons and displays detailed patron information based on the user's selection.

import java.util.LinkedList;
import java.util.Scanner;

public class PatronList {
    public static void main(String[] args) {
        // 1. Build a linked list of Patrons
        LinkedList<Patron> patronList = new LinkedList<>();
        patronList.add(new Patron("George Washington", "LW111",
                                  "1 Constitution Way", "Mount Vernon", "VA", "22121"));
        patronList.add(new Patron("John Adams", "A345CAX90T",
                                  "123 Main St.", "Redwood City", "CA", "94062"));
        patronList.add(new Patron("Thomas Jefferson", "TJ222",
                                  "2 Liberty Ln", "Monticello", "VA", "22902"));
        patronList.add(new Patron("James Madison", "JM333",
                                  "3 Federal Ave", "Orange", "CA", "92867"));
        patronList.add(new Patron("James Monroe", "JM444",
                                  "4 Independence Blvd", "Richmond", "VA", "23220"));
        patronList.add(new Patron("John Quincy Adams", "JQA555",
                                  "5 Patriot Dr.", "Boston", "MA", "02115"));
        patronList.add(new Patron("Andrew Jackson", "AJ666",
                                  "6 Democracy Rd.", "Nashville", "TN", "37214"));
        patronList.add(new Patron("Martin Van Buren", "MVB777",
                                  "7 Liberty St.", "Kinderhook", "NY", "12106"));
        patronList.add(new Patron("William Henry Harrison", "WHH888",
                                  "8 President Ln", "North Bend", "OH", "43701"));
        patronList.add(new Patron("John Tyler", "JT999",
                                  "9 Executive Ct", "Richmond", "VA", "23220"));

        // 2. Display the list of names directly from the linked list
        System.out.println("Patron List");
        int idx = 1;
        for (Patron p : patronList) {
            System.out.println(idx++ + "\t" + p.getName());
        }

        // 3. Prompt the user and look up the selected Patron
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhich patron's information would you like to see? ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > patronList.size()) {
            System.out.println("Patron not found.");
        } else {
            // LinkedList#get(int) walks the list internally, no array needed
            Patron selected = patronList.get(choice - 1);
            System.out.println("\n" + selected);
        }

        scanner.close();
    }
}
