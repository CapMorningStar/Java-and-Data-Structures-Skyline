//KYAW SOE LWIN
//Lab 6
//10 May 2025
// The progam is about library line simulator

import java.util.Random;

public class WaitLine 
{
    private QueueInterface<Customer> line;
    private int numberOfArrivals;
    private int numberServed;
    private int totalTimeWaited;

    public WaitLine() 
    {
        line = new LinkedQueue<>();
    }

    /**
     * Simulates a waiting line over given ticks with arrival probability.
     * @param duration           Total clock ticks to simulate
     * @param arrivalProbability Probability (0.0–1.0) a new customer arrives each tick
     */
    public void simulate(int duration, double arrivalProbability) 
    {
        int serviceTimer = 0;
        Customer current = null;
        Random rand = new Random();

        System.out.println("=== Library Queue Simulation ===");

        for (int tick = 1; tick <= duration; tick++) 
        {

            // 1) Arrival
            if (rand.nextDouble() < arrivalProbability) 
            {
                numberOfArrivals++;
                Customer next = makeRandomCustomer(tick, rand);
                line.enqueue(next);
                System.out.printf("Tick %2d: ENQUEUE → %s%n", tick, next);
            }

            // 2) Processing current
            if (serviceTimer > 0) 
            {
                serviceTimer--;
                if (serviceTimer == 0) 
                {
                    System.out.printf("Tick %2d: DEQUEUE → done with %s%n", tick, current);
                    numberServed++;
                    int waited = tick - current.getArrivalTick() - current.getServiceTime() + 1;
                    totalTimeWaited += waited;
                    current = null;
                }
            }

            // 3) Start next if free
            if (serviceTimer == 0 && current == null && !line.isEmpty()) 
            {
                current = line.dequeue();
                serviceTimer = current.getServiceTime();
            }
        }

        // Finish remaining after duration
        int tick = duration + 1;
        while (serviceTimer > 0 || !line.isEmpty()) 
        {
            if (serviceTimer == 0 && !line.isEmpty()) 
            {
                current = line.dequeue();
                serviceTimer = current.getServiceTime();
            }
            serviceTimer--;
            if (serviceTimer == 0) 
            {
                System.out.printf("Tick %2d: DEQUEUE → done with %s%n", tick, current);
                numberServed++;
                int waited = tick - current.getArrivalTick() - current.getServiceTime() + 1;
                totalTimeWaited += waited;
                current = null;
            }
            tick++;
        }

        // Summary
        System.out.println("\n=== Simulation complete ===");
        System.out.println("Number served      = " + numberServed);
        System.out.println("Total time waited  = " + totalTimeWaited);
        System.out.printf("Average time waited= %.2f%n", (double) totalTimeWaited / numberServed);
        System.out.println("Number left in line= " + (numberOfArrivals - numberServed));
    }

    private Customer makeRandomCustomer(int tick, Random rand) 
    {
        String[] names = {"Alice","Bob","Carol","David","Eve","Frank",
                          "Grace","Hank","Irene","Jack","Karen","Leo"};
        String name = names[rand.nextInt(names.length)];
        String card = String.format("%010d", rand.nextInt(1_000_000_000));
        double p = rand.nextDouble();
        String reason;
        int extra;
        if (p < 0.5) 
        {
            int books = 1 + rand.nextInt(5);
            reason = "Checking out " + books + " book" + (books > 1 ? "s" : "");
            extra = books;
        } 
        else if (p < 0.8) 
        {
            reason = "Getting a library card";
            extra = 0;
        } 
        else 
        {
            reason = "Paying a fine";
            extra = 1;
        }
        int serviceTime = 1 + extra;
        return new Customer(name, card, reason, serviceTime, tick);
    }
}
