import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator; //deleting objects form ArrayList

/**
 * Write a description of class RandomNum here.
 *
 * @author (Lily Li)
 * @version (11.2.18)
 */
public class RandomNum
{
    /**
     * Constructor for objects of class RandomNum
     */
    public RandomNum()
    {
            
    }

    public static void main(String [] args) 
    {
        int i = 0;
        int j = 1;
        ArrayList <String> randomNumber = new ArrayList<String> ();
        int N = Integer.parseInt(args[i]);
        int M = Integer.parseInt(args[j]);
        for (int k = 0; k <= N; k++)
        {
            int numberI = (int)(Math.random()*M);
            String numberS = Integer.toString(numberI);
            randomNumber.add(numberS);
        }
        
        int maxCount = 0;
        for (String numberS : randomNumber)
        {
            int count = 0;
            int number = Integer.parseInt(numberS);
            while (number > 0)
            {
                number = number/10;
                count ++;
            }
            
            if (count > maxCount)
            {
                maxCount = count;
            }
        }
        
        for (int k = 0; k < randomNumber.size(); k++)
        {
            int count = 0;
            int number = Integer.parseInt(randomNumber.get(k));
            String numberS = randomNumber.get(k);
            while (number > 0)
            {
                number = number/10;
                count ++;
            }
            
            if (count != maxCount)
            {
                int diff = maxCount - count;
                String space = "";
                for (int l = 0; l < diff; l++)
                {
                    space = space + " ";
                }
                numberS = space + randomNumber.get(k); 
                randomNumber.set(k, numberS);
            }
        }
        
        int remainder = N % 10;
        for (int l = 0; l <= N-remainder-10; l += 10)
        {
            System.out.println(randomNumber.get(l) + "  " + randomNumber.get(l+1) + "  " + randomNumber.get(l+2) + "  " + randomNumber.get(l+3) + "  " + randomNumber.get(l+4) + "  " + randomNumber.get(l+5) + "  " + randomNumber.get(l+6) + "  " + randomNumber.get(l+7) + "  " + randomNumber.get(l+8) + "  " + randomNumber.get(l+9)); 
        }
        if (remainder == 1)
        {
            System.out.println(randomNumber.get(N));
        }
        else if (remainder == 2)
        {
            System.out.println(randomNumber.get(N-remainder+1) + "  " + randomNumber.get(N));
        }
        else if (remainder == 3)
        {
            System.out.println(randomNumber.get(N-remainder+1) + "  " + randomNumber.get(N-remainder+2) + "  " + randomNumber.get(N));
        }
        else if (remainder == 4)
        {
            System.out.println(randomNumber.get(N-remainder+1) + "  " + randomNumber.get(N-remainder+2) + "  " + randomNumber.get(N-remainder+3) + "  " + randomNumber.get(N));
        }
        else if (remainder == 5)
        {
            System.out.println(randomNumber.get(N-remainder+1) + "  " + randomNumber.get(N-remainder+2) + "  " + randomNumber.get(N-remainder+3) + "  " + randomNumber.get(N-remainder+4) + "  " + randomNumber.get(N));
        }
        else if (remainder == 6)
        {
            System.out.println(randomNumber.get(N-remainder+1) + "  " + randomNumber.get(N-remainder+2) + "  " + randomNumber.get(N-remainder+3) + "  " + randomNumber.get(N-remainder+4) + "  " + randomNumber.get(N-remainder+5) + "  " + randomNumber.get(N));
        }
        else if (remainder == 7)
        {
            System.out.println(randomNumber.get(N-remainder+1) + "  " + randomNumber.get(N-remainder+2) + "  " + randomNumber.get(N-remainder+3) + "  " + randomNumber.get(N-remainder+4) + "  " + randomNumber.get(N-remainder+5) + "  " + randomNumber.get(N-remainder+6) + "  " + randomNumber.get(N));
        }
        else if (remainder == 8)
        {
            System.out.println(randomNumber.get(N-remainder+1) + "  " + randomNumber.get(N-remainder+2) + "  " + randomNumber.get(N-remainder+3) + "  " + randomNumber.get(N-remainder+4) + "  " + randomNumber.get(N-remainder+5) + "  " + randomNumber.get(N-remainder+6) + "  " + randomNumber.get(N-remainder+7) + "  " + randomNumber.get(N));
        }
        else if (remainder == 9)
        {
            System.out.println(randomNumber.get(N-remainder+1) + "  " + randomNumber.get(N-remainder+2) + "  " + randomNumber.get(N-remainder+3) + "  " + randomNumber.get(N-remainder+4) + "  " + randomNumber.get(N-remainder+5) + "  " + randomNumber.get(N-remainder+6) + "  " + randomNumber.get(N-remainder+7) + randomNumber.get(N-remainder+8) + "  " + randomNumber.get(N));
        }
    }
}
