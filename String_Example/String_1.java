
/**
 * This class works with different methods of the string class
 *
 * @author (Lily Li)
 * @version (9.14.18)
 */
public class String_1
{
    /**
     * Constructor for objects of class String_1
     */
    public String_1()
    {
    }
    
    /*
     * Method testing for the longest run in a string
     */
    public void maxRun(String x)
    {
        int len = x.length();
        int count = 0;
       
        char repLetter = x.charAt(0); 
 
        for (int i = 0; i < len; i++)
        {
           int currentCount = 1; 
           //keeps count of how many times the letter repeats
           
           for (int j=i+1; j < len; j++)
           {
               if (x.charAt(i) != x.charAt(j))
                      break; //breaks out of for loop
                    
               currentCount++;  
            }
            
           //updates the longest run data
           if (currentCount > count)
           {
               count  = currentCount;
               repLetter = x.charAt(i);
            }
        }
        
        System.out.println("The string you are testing is: " + x);
        System.out.println("The letter in the longest run is: " + repLetter);
        System.out.println("The longest run is " + count + " characters long");
           
    }
    
    public void Expandstring(String x)
    {
        String y = ""; //empty string that will be updated
        char pastChar = ' '; //to test for number before letter
        
        //runs through every character in the string
        for (int i = 0; i<x.length(); i++)
        {
            // tests if there is a digit then a number
            if(Character.isDigit(pastChar) && Character.isLetter(x.charAt(i)))
            {
                for (int j = 0; j <= Integer.parseInt(String.valueOf(pastChar)); j++)
                {
                    y += x.charAt(i);
                }
            }
            
            //prints out characters even if there is no number
            else if(Character.isLetter(x.charAt(i)))
            {
                y += x.charAt(i);
            }
            
            pastChar = x.charAt(i);
        }
        
        System.out.println("The expanded string is: " + y);
    }
   
    
    public void StringExample(String s)
    {
        
        //System.out.println(s.charAt(num)); 
           
        //System.out.println(s.substring(num));
           
        //System.out.println(s.substring(num,s.length()));
           
        System.out.println(Integer.parseInt(s));
        
    }
}
   
