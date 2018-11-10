
/**
 * This class models a classroom
 *
 * @author (Lily)
 * @version (9/4/18)
 */
public class Classroom
{
    //class variables
    private String location;
    private int size;
    private int number_of_tables;
    private int number_of_chairs;
    
    /**
     * Constructor for objects in Classroom
     */
    public Classroom()
    {
        location = "IMSA";
        size = 0;
        number_of_tables = 0;
        number_of_chairs = 0;
    }
    /**
     * Constructor for adding location, size parameters
     */
    public Classroom(String loc, int size)
    {
        location = loc;
        this.size = size; //use this.size to get rid of amiguity 
        //this.size means field, size means parameter
    }
}