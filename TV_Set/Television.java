
/**
 * This class implements a tv set.
 *
 * @author (Lily Li)
 * @version (9.25.18)
 */
public class Television
{
    // instance variables - replace the example below with your own
    // all fields declared private unless otherwise specified
    private String MANUFACTURER; //stores the brand name
    //will be made a constant later
    private int SCREEN_SIZE; //stores the size of the tv screen
    private boolean powerOn; //holds value true is on, false is off
    private int channel; //holds value of station showing
    private int volume; //holds number value representing loudness
    

    /**
     * Constructor for objects of class Television
     */
    public Television(String brand, int size)
    {
        MANUFACTURER = brand; 
        //assigns value of brand parameter to MANUFACTURER field
        SCREEN_SIZE = size;
        //assigns value of size parameter to SCREEN_SIZE field
        powerOn = false;
        //initializes powerOn value as false
        volume = 20;
        //initialize volume value as 20
        channel = 2;
        //initialize channel value as 2
        //if accepting parameter w/ same name as field, use this.fieldname
    }
    /**
     * Accessor method that returns value in volume field
     */
    public int getVolume()
    {
        return volume;
    }
    /**
     * Accessor method that returns value in channel field
     */
    public int getChannel()
    {
        return channel;
    }
    /**
     * Accessor method that returns value in MANUFACTURER field
     */
    public String getManufacturer()
    {
        return MANUFACTURER;
    }
    /**
     * Accessor method that returns value in SCREEN_SIZE field
     */
    public int getScreenSize()
    {
        return SCREEN_SIZE;
    }
    /**
     * Mutator method that accepts a value and stores it in the channel field
     */
    public void setChannel(int station)
    {
        channel = station;
    }
    /**
     * Mutator method that changes state power from true to false of false to true
     */
    public void power()
    {
        powerOn = !powerOn;
        //the not operator changes the state from true to false or false to true
        //the assignment statement then stores this change in state in the powerOn field 
    }
    /**
     * Mutator method that increases the volume by 1
     */
    public void increaseVolume()
    {
        volume = volume + 1;
    }
    /**
     * Mutator method that decreases the volume by 1
     */
    public void decreaseVolume()
    {
        volume = volume - 1;
    }
    /**
     * This method prints the details of the Television class
     */
    public void details()
    {
        System.out.println("Manufacturer: " + MANUFACTURER);
        System.out.println("Screen Size: " + SCREEN_SIZE);
        if (powerOn)
        {
            System.out.println("The TV is on.");
        }
        else
        {
            System.out.println("The TV is off.");
        }
        System.out.println("TV is set to channel: " + channel);
        if (volume > 15)
        {
            System.out.println("Volume: " + volume + " --> too loud");
        }
        else if (volume < 5)
        {
            System.out.println("Volume: " + volume + " --> too quiet");
        }
        else 
        {
            System.out.println("Volume: " + volume);
        }
    }
}
