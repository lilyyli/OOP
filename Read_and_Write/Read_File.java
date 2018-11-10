import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * This class reads a text file.
 *
 * @author (Lily Li)
 * @version (10.01.18)
 */
public class Read_File
{
    public static void main (String [] args) throws FileNotFoundException
    {
        File text = new File("States.txt");
        Scanner scan = new Scanner(text);
        String line = "";
        while(scan.hasNextLine()) 
        //as long as there is a next line, the loop will continue
        {
            line = scan.nextLine();
            String[] states = line.split(" ");
            // split the line at the space
            System.out.println("States: " + states[0] + "; " + "State Capital: " + states[1]);
            //access state name states[0]
            //access state capital states[1]
            
        }
    }
}
