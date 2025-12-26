//KYAW SOE LWIN
//Lab 4
//March 9
//This program uses a linked list to store library patrons and displays detailed patron information based on the user's selection.
public class Patron 
{
    private String name;
    private String libraryCardNumber;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;

    public Patron(String pName, String pLibraryCardNumber,
                  String pStreetAddress, String pCity, String pState, String pZip) 
    {
        name = pName;
        libraryCardNumber = pLibraryCardNumber;
        streetAddress = pStreetAddress;
        city = pCity;
        state = pState;
        zip = pZip;
    }

    public String getName() 
    {
        return name;
    }

    public String getLibraryCardNumber()
    {
        return libraryCardNumber;
    }

    public String getStreetAddress() 
    {
        return streetAddress;
    }

    public String getCity() 
    {
        return city;
    }

    public String getState() 
    {
        return state;

    }

    public String getZip() 
    {
        return zip;
    }

    @Override
    public String toString() 
    {
        return "Name: " + name + "\n" +
               "Library Card Number: " + libraryCardNumber + "\n" +
               "Address:\n" +
               streetAddress + "\n" +
               city + ", " + state + " " + zip;
    }
}
