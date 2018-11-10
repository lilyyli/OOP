
/**
 * This program creates a class for Cellphone.
 * This program sets the cellphone's memory, processor, longlife battery, and cost.
 *
 * @author (Lily Li)
 * @version (10.15.18)
 */
public class Cellphone
{
    // instance variables 
    private int memory;
    private String processor;
    private boolean longlife;
    private double cost;

    /**
     * Constructor for objects of class Computer
     */
    public Cellphone()
    {
            cost = 0;
            cost = calcCost(); //sets the cost of the computer
            
            // intitial state of the computer (default values)
            memory = 8;
            processor = "i3";
            longlife = false;
    }
    
    //second constructor that allows the user to set the state of the object
    public Cellphone(int memory, String processor, boolean longlife)
    {
            cost = calcCost(); //sets the cost of the computer
            
            //memory must be between 8 and 64
            if (memory >= 8 && memory <=64)
            {
                this.memory = memory;
            }
            else
            {
                this.memory = 8; //otherwise sets as default memory 8GB
            }
            
            //processor must be i3, i5, or i7
            if (processor.equals("i3") || processor.equals("i5") || processor.equals("i7"))
            {
                this.processor = processor;
            }
            else
            {
                this.processor = "i3"; //otherwise sets as default processor i3
            }
            
            this.longlife = longlife; //sets longlife
    }
    
    //returns longlife 
    public boolean getLonglife()
    {
        return longlife;
    }
    
    //returns processor
    public String getProcessor()
    {
        return processor;
    }
    
    //returns memory
    public int getMemory()
    {
        return memory;
    }
    
    //prints out the details of the cellphone
    public void printDetails()
    {
        System.out.println("The memory for your cellphone is: " + memory + " GB");
        System.out.println("The processor for your cellphone is: " + processor);
        System.out.println("Your cellphone has a longlife battery: " + longlife);
        System.out.println("Your cellphone's total cost is: " + cost + " dollars");
    }
    
    //gets the cost of the cellphone
    public double getCost()
    {
        cost = calcCost();
        return cost;
    }
    
    //calculates the cost of the cellphone
    public double calcCost()
    {
        cost = 500; //cost of basic cellphone
        
        if (memory > 8) //adds additonal cost if cellphone has a memory over 8
        {
            int addMem = memory - 8; //finds additonal memory
            double addCost = addMem * 15; //$15 per GB of extra memory
            cost = cost + addCost; //adds additonal cost of memory
        }
        else 
        {
            cost = cost; //no additonal cost for 8 GB of memory
        }
       
        if (processor == "i5") //adds additonal cost for i5 and i7 processors
        {
            cost = cost + 200; //adds $200 for i5
        }
        else if (processor == "i7")
        {
            cost = cost + 400; //adds $400 for i7
        }
        else
        {
            cost = cost; //no additonal cost for i3
        }
        
        if(longlife == true) //adds additional cost for longlife battery
        {
            cost = cost + 400; //adds $400 for longlife battery
        }
        else
        {
            cost = cost; //no additonal cost for no longlife battery
        }
        
        return cost; //returns the cost of the cellphone
    }

    
}
