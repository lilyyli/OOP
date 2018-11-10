import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintStream;

/**
 *  This class encodes entire files.
 *  Author (Lily Li)
 *  Date (10.30.18)
 */
public class Encrypt 
{
    /**
     * Encodes an entire file using a Cipher object.
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to encode or decode? (e/d) ");
        char response = input.next().toLowerCase().charAt(0);
        
        System.out.println("Input file: ");
        String infile = input.next();
        System.out.println("Output file: ");
        String outfile = input.next();
        
        Cipher coder = new Cipher();
        //try and catch block for reading file
        try 
        {
            FileReader inReader = new FileReader(infile);
            PrintStream outWriter = new PrintStream(outfile);
            while (inReader.ready()) 
            {
                char ch = (char)inReader.read();
                if (response == 'e') 
                {
                    outWriter.print( coder.encode(ch) );
                }
                else if (response == 'd') 
                {
                    outWriter.print( coder.decode(ch) );
                }
	        }
	    //closes two files
	    inReader.close();
	    outWriter.close();
	    }
	    catch (java.io.IOException e) 
	    {
	        System.out.println("FILE NOT FOUND");
	    }  
	}
}
 

