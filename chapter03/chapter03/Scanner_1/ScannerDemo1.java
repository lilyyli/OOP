import java.util.Scanner;

/**
 * This class is an example of how to use a scanner for getting input.
 *
 * @author (Lily Li)
 * @version (9.21.18)
 */
public class ScannerDemo1
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class ScannerDemo1
     */
    public ScannerDemo1()
    {
        Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine(); //read a string using the scanner
        //System.out.println(name); //echo what was read for name
        //int age = sc.nextInt(); //read an integer using the scanner
        //System.out.println(age);
        double gpa = sc.nextDouble(); //read a decimal number using scanner
        System.out.println(gpa);
        
    }

}