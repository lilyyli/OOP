
/**
 * This program creates a classroom (location, size, number of chairs and tables)
 *
 * @author (Lily Li)
 * @version (9.5.18)
 */
public class Classroom
{
// instance variables - replace the example below with your own
    private String location;
    private int size;
    private int number_of_tables;
    private int number_of_chairs;
    
    /**
     * Constructor for objects in class Classroom
     */
    public Classroom()
    {
        location = "IMSA";
        size = 0;
        number_of_tables = 0;
        number_of_chairs = 0;
    }
    public Classroom(String loc, int size)
    {
        location = loc;
        this.size = size; //this.size is the field and size is the parameter
        //using this. gets rid of ambiguity bc both field and parameter are named size
        number_of_tables = 0;
        number_of_chairs = 0;
    }
//this is the accessor method (labeled w "get") for location.
    public String get_Loc()
    {
        return location; 
    }
//this is the accessor method for size
    public int get_Size()
    {
        return size;
    }
//this is the accessor method for number of tables
    public int get_Number_Of_Tables()
    {
        return number_of_tables;
    }
//this is the accessor method for number of chairs
    public int get_Number_Of_Chairs()
    {
        return number_of_chairs;
    }
//this is the mutator method (labeled w "set") for location
    public void set_Loc(String location)
    {
        this.location = location; 
    }
//this is the mutator method (labeled w "set") for size
    public void set_Size(int size)
    {
        if (size > 50 || size < 10) // "||" means "or"
        {
            System.out.println("Invalid size. Size out of range.");
        }
        // restriction for size of class Classroom (if statement)
        else
        {
            this.size = size; 
        }
    }
//this is the mutator method (labeled w "set") for number of tables
    public void set_Number_Of_Tables(int number_of_tables)
    {
        this.number_of_tables = number_of_tables;
    }
//this is the mutator method (labeled w "set") for number of chairs
    public void set_Number_Of_Chairs(int number_of_chairs)
    {
        this.number_of_chairs = number_of_chairs; 
    }
//this method gives all information about a classroom (description)
    public void classroom_Information()
    {
        System.out.println("Location of classroom: " + location);
        System.out.println("Size of classroom: " + size);
        System.out.println("Number of tables in classroom: " + number_of_tables);
        System.out.println("Number of chairs in classroom: " + number_of_chairs);
    }
//have at least one line describing each method
}
