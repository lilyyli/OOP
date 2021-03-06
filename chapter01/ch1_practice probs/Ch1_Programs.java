
/**
 * This program displays a flag and converts a decimal number to binary.
 *
 * @Lily Li
 * @8.31.18
 */
public class Ch1_Programs
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class Program_1
     */
    public Ch1_Programs()
    {
    }
//  This method displays the flag on the window terminal. 
    public void Flag()
    {
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println(" * * * * * * ==================================");
        System.out.println("  * * * * *  ==================================");
        System.out.println(" * * * * * * ==================================");
        System.out.println("  * * * * *  ==================================");
        System.out.println(" * * * * * * ==================================");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
    }
// This method converts decimal number to binary.
    public int Convert(int decimal)
    {
        int n = 0;
        int remainder = 0;
        int binary = 0;
        
        while (decimal > 0)
        {  remainder = decimal % 2; 
            // result is the remainder of decimal divded by 2
            binary = (int)(remainder * Math.pow(10,n)) + binary;
          
            // Math.pow(10,n) raises 10 to the nth power
            // remainder * Math.pow(10,n) adds remainder to beginning
            decimal /= 2;
            // divides decimal by 2 and puts result in decimal
            n++; 
            // increment (adds 1 to n)
        }
        return binary;
    }
    
}