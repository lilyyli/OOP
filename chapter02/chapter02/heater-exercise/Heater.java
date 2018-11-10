import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;
/**
 * Creates a heater than changes temperature 
 *
 * @author (Lily Li)
 * @version (9.1..18)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private double temperature;
    private int min;
    private int max;
    private double increment;
    
    /**
     * Constructor for objects of class Scene
     */
    public Heater(int minimum, int maximum)
    {
        Canvas canvas = Canvas.getCanvas();
        Font b = new Font("Courier", Font.BOLD + Font.ITALIC, 35);
        canvas.font(b);
        min = minimum;
        max = maximum;
        temperature = 15.0;
        increment = 5.0;
    }

    /**
     * Mutator method that increases value of temperature by 5.0
     */
    public void warmer()
    {
        double newTemperature = temperature + increment;
        
        if (newTemperature <= max) {
            temperature = newTemperature;
        }
    }
    /**
     * Mutator method that decreases value of temperature by 5.0
     */
    public void cooler()
    {
        double newTemperature = temperature - increment;
        
        
    }
    
    
}
