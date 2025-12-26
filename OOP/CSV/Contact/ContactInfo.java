public class ContactInfo
{
    private String name;
    private String businessPhone;
    private String cellPhone;
    private String email;
    private String address;

    public ContactInfo(String data)
    {
        String[] fields=data.split(",");
        name=fields[0];
        businessPhone=fields[1];
        cellPhone=fields[2];
        email=fields[3];
        address=fields[4];

    }

    @Override
    public String toString()
    {
        return "Name: "+name+
               "\nBusiness Phone: "+businessPhone+
               "\nCellPhone: "+cellPhone+
               "\nEmail Address: "+email+
               "\nAddress: "+address;
    }


}