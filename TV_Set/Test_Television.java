
/**
 * This class tests the television class.
 *
 * @author (Lily Li)
 * @version (9.25.18)
 */
public class Test_Television
{
    // creates a main method 
    // when compile have option to start at main
    // static = belongs to this class
    // when running, specify arguments
    // [] = array
    public static void main(String [] args)
    {
        Television tv = new Television("Lily Inc",30); 
        //create new television object
        
        //System.out.println(tv.getManufacturer()); 
        // checks the getManufacturer method
        
        //System.out.println(tv.getScreenSize());
        // checks the getScreenSize method
        
        //System.out.println(tv.getVolume());
        // checks the getVolume method
        
        //System.out.println(tv.getChannel());
        // checks the getChannel method
        
        tv.increaseVolume();
        // calling the increase volume method for the object tv
        System.out.println(tv.getVolume());
        // verifies that increaseVolume method
        
        tv.decreaseVolume();
        System.out.println(tv.getVolume());
        // verifies the decreaseMVolume method
        
        tv.setChannel(222);
        System.out.println(tv.getChannel());
        // verifies the setChannel method
        
        tv.details();
        // verifies the details method
    }
    
}
