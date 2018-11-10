import java.util.ArrayList;

/**
 * Write a description of class PrimeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrimeTest
{
    private static ArrayList<String>prime;
    public static boolean isPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        
        int numberOfDivisor = 0;
        
        for (int i = 1; i <= (n/2); i++)
        {
            if (n % i == 0)
            {
                numberOfDivisor++;
            }
        }
        
        return numberOfDivisor == 2;
    }
    
    public static void main(String[] args)
    {
        ArrayList<String>prime = new ArrayList<String>();
        for (int n =2; n <= 1000000; n++)
        {
            if (isPrime(n))
            {
                prime.add(Integer.toString(n));
            }
        }
        
        System.out.println(prime.get(prime.size()-1));
    }
}
