
/**
 * Write a description of class Lab1 here.
 *
 * @author (Lily Li)
 * @version (9.24.18)
 */
public class Lab
{
    /**
     * Constructor for objects of class Lab
     */
    public Lab()
    {
    }

    /**
     * This method finds all the occurrences of S2 in S1
     * and replaces it to capitalized S2 and displays the string S1
     */
    public void changeCase(String S1, String S2)
    {
        String newString = S1.replaceAll(S2, S2.toUpperCase());
        
        System.out.println("S1 was: " + S1);
        System.out.println("S2 was: " + S2);
        System.out.println("The new string is: " + newString);
    }
    
    /**
     * This method counts and displays how many times S2 appears in S1
     */
    public void countString(String S1, String S2)
    {
        int count = 0; 
        
        for (int i = 0; i < S1.length(); i++)
        {
           if (S1.charAt(i) == S2.charAt(0)) 
           {
               count ++;
           }
        }
        
        System.out.println("The character " + S2 + " appears " + count + " times in the string " + S1);
    }
    
    /** 
     * This method creats a password from the two strings
     * The first 2 characters of S1 are in lowercase,
     * followed by special characters @*
     * and then followed by S2
     */
    public void genPassword(String S1, String S2)
    {
        String newS1 = S1.substring(0,2); 
        // stores the first two characters of S1 in a new string
        
        String password = newS1.toLowerCase() + "@*" + S2;
        
        System.out.println("S1 was: " + S1);
        System.out.println("S2 was: " + S2);
        System.out.println("The password is: " + password);
    }
    
    /**
     * This method creates and displays a string.
     * The string is S1 with all occurences of S2 removed if S2 is a letter.
     * If S2 is a digit, all occurences of S2 are removed, 
     * and the next is repeated as many times as S2
     */
    public void addDelete(String S1, String S2)
    {
        char S2Char = S2.charAt(0); 
        // storing the single character string S2 as a character 
        
        String s = "";
        //s is an empty string that is updated 
       
        //checks if S2 is a letter
        if (Character.isLetter(S2Char))
        {
            s = S1.replaceAll(S2, ""); 
            //removes all occurences of S2 in S1
        }
        
        // checks if S2 is a digit
        else if (Character.isDigit(S2Char))
        {
            for (int i = 0; i < S1.length(); i++)
            {
                if (S1.charAt(i) == S2Char)
                {
                    /**
                     * If the same number as S2 shows up in S1,
                     * then the number is removed, 
                     * and the next character is repeated 
                     * as many times as S2.
                     */
                    for (int j = 1; j <= Integer.parseInt(String.valueOf(S2));j++)
                    {
                        s += S1.charAt(i+1);
                    }
                }
                
                else if (S1.charAt(i) != S2Char)
                {
                    // all the other letters in S1 are printed normally
                    s += S1.charAt(i);
                }
            }
        }
        System.out.println("S1 was: " + S1);
        System.out.println("S2 was: " + S2);
        System.out.println("The new add/delete string is: " + s);
    }
    
   }

