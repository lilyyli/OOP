import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * This class displays the time in hours and minutes.
 *
 * @author (Lily Li)
 * @version (10.02.18)
 */
public class TimeConversion
{
    /**
     * Constructor for objects of class TimeConversion
     */
    public TimeConversion()
    {
    }
    
    public void convertTime()
    {
        System.out.println("Please give me a time in minutes: ");
        Scanner sc = new Scanner(System.in);
        int timeMin = sc.nextInt();
        int hours = timeMin / 60;
        int min = timeMin % 60;
        if (min >= 10)
        {
            System.out.println("The time is " + hours + ":" + min);
        }
        else if (min < 10)
        {
            System.out.println("The time is " + hours + ":0" + min);
        }
    }
}
