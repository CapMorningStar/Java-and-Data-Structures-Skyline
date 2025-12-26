public class ContactTest
{
    public static void main(String[] args) 
    {
        ContactInfo[] contact=new ContactInfo[3];
        contact[0]=new ContactInfo("KYAW SOE LWIN, 68969, 645234, isaac@my.smccd.edu, 82 San Miguel Avenue ");
        contact[1]=new ContactInfo("Swan Yi,847636,4734636,swan@my.smccd.edu, 69 San Francisco Avenue");

       for (int i = 0; i < contact.length; i++) 
       {
           System.out.println(contact[i].toString());
           System.out.println("-------------------------------");
       }
        
    }
}