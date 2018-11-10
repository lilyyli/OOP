import java.io.*; //* means get the entire package

/**
 * This program writes a text file.
 *
 * @author (Lily Li)
 * @version (10.01.18)
 */
public class Write_File
{
    private FileOutputStream out;
    private PrintStream ps;
    
    /**
     * Constructor for objects of class Write_File
     */
    public Write_File()
    {
        //set up output file
        try 
        {
            out = new FileOutputStream("MyFile.txt"); //name of file
            ps = new PrintStream(out);
        }
        catch (Exception e) //something might go wrong, usually will not happen
        {
            System.out.println("Error opening the output file.");
        }
    }
    
    public void write(String s)
    {
        try 
        {
            ps.println(s); //writes string given as parameter to file
        }
        catch(Exception e)
        {
            System.out.println("Error when writing file");
        }
    }
    
    public void close() //closes the file when done writing
    //even if you don't close the file, when the program is done, it will close the file
    {
        try
        {
            ps.close();
        }
        catch(Exception e)
        {
            System.out.println("Error when closing file.");
        }
    }
}
