//KYAW SOE LWIN
//Lab 6
//10 May 2025
// The progam is about library line simulator

public class Customer 
{
    private final String name;
    private final String cardNumber;
    private final String reason;
    private final int serviceTime;
    private final int arrivalTick;

    public Customer(String name, String cardNumber, String reason, int serviceTime, int arrivalTick)
    {
        this.name        = name;
        this.cardNumber  = cardNumber;
        this.reason      = reason;
        this.serviceTime = serviceTime;
        this.arrivalTick = arrivalTick;
    }

    public String getName()        
    { 
        return name; 
    }

    public String getCardNumber()  
    { 
        return cardNumber; 
    }

    public String getReason()      
    { 
        return reason; 
    }

    public int    getServiceTime() 
    { 
        return serviceTime; 
    }
    
    public int    getArrivalTick() 
    { 
        return arrivalTick; 
    }

    @Override
    public String toString() 
    {
        return String.format("%s (Card: %s) — %s [%d tick%s]",
            name, cardNumber, reason,
            serviceTime, serviceTime == 1 ? "" : "s");
    }
}
