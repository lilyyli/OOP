import java.*;
import java.io.*;
import java.util.*;
public class primeboi {
        public static void main(String[] args) {
        ArrayList primes = new ArrayList();
        int i;
        int num = 0;
        int limit = 1000000;
        boolean isPrime = true;
        //Start loop 1 to limit
        for (i = 1; i <= limit; i++) {
            isPrime = checkboi(i);
            if (isPrime) {
                primes.add(i);
            }
        }
       primes.toArray();
       Object w = primes.get(primes.size()-1);
       System.out.println(w);
    }
    public static boolean checkboi(int numboi) {
        int remainder;
        for (int i = 2; i <= numboi / 2; i++) {
            remainder = numboi % i;
            //if remainder is 0 than numboi is not prime and break loop. Else continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}