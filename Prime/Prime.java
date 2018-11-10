import java.*;
import java.io.*;
import java.util.*;

/**
 * This finds all the prime numbers.
 *
 * @author (Lily Li)
 * @version (10.25.18)
 */
public class Prime
{
   private static boolean isPrime;
   public static void main(String[] args)
   {
       ArrayList primes = new ArrayList ();
       int i;
       int num = 0;
       int limit = 1000000;
       boolean isPrime = true;
       
       for (i = 1; i <= limit; i++)
       {
           isPrime = checkPrime(i);
           if (isPrime)
           {
               primes.add(i);
           }
       }
       primes.toArray();
       Object w = primes.get(primes.size()-1);
       System.out.println(w);
   }
   
   public static boolean checkPrime(int number)
   {
       int remainder;
       for (int i = 2; i <= number/2; i++)
       {
           remainder = number%i;
           if (remainder == 0)
           {
               return false;
           }
       } 
       return true;
   }
}