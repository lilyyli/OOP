import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * This is a game involving the numbers 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Birthday
{

    /**
     * Constructor for objects of class BirthdayGame
     */
    public Birthday()
    {
    }

    public void BirthdayGame()
    {
        System.out.println("These are the instructions for the game: ");
        System.out.println("1. Determine the number that corresponds to your birthday month (January = 1, February = 2, etc)");
        System.out.println("2. Multiply that number by 5.");
        System.out.println("3. Add 6 to that number.");
        System.out.println("4. Multiply that number by 4.");
        System.out.println("5. Add 9 to the number.");
        System.out.println("6. Multiply that number by 5.");
        System.out.println("7. Add your birth day to the number (10 if the 10th and so on)");
        System.out.println("Give me the number you calculated: ");
        Scanner sc = new Scanner(System.in);
        int calcNum = sc.nextInt();
        calcNum = calcNum - 165;
        int birthMonth = calcNum / 100;
        int birthDay = calcNum % 100;
        System.out.println("Your birthday is: " + birthMonth+ "/" + birthDay);
        
        
    }
}
