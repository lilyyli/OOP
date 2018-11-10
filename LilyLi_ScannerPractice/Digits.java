import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * This class displays the tens and ones digit of a 2 digit number provided by the user.
 *
 * @author (Lily Li)
 * @version (10.02.18)
 */
public class Digits
{
    public Digits() 
    {
    }
    
    public void displayDigits()
    {
        System.out.println("Enter a two digit number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int onesDigit = i % 10;
        int tensDigit = (i - onesDigit)/10;
        System.out.println("Tens Digit: " + tensDigit);
        System.out.println("Ones Digit: " + onesDigit);
    }
}
