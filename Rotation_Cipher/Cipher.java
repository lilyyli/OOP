import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *  Class that encodes and decodes individual characters using the "Caesar cipher".
 *    
 */
public class Cipher 
{
    private String ALPHABET = "ABCDEFGHIJKLMNOPQERSTUVWXYZ";
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private String SHIFTED =  "QWERTYUIOPASDFGHJKLZXCVBNM";
    private String shifted =  "qwertyuiopasdfghjklzxcvbnm";

    /**
     *  Constructs a Cipher object.
     */
    public Cipher() 
    {
        // currently, does nothing
    }

    /**
     * Encodes a single character.
     *   @param ch the character to be encoded
     *   @return the character three later in the alphabet, with wrap-around
     */
    public char encode(char ch) {
        if (Character.isUpperCase(ch))
        {
            int index = ALPHABET.indexOf(ch);
            ch = SHIFTED.charAt(index);
            rotate();
            return ch;
        }
        else if (Character.isLowerCase(ch))
        {
            int index = alphabet.indexOf(ch);
            ch = shifted.charAt(index);
            rotate();
            return ch;
        }
        else
        {
            rotate();
            return ch;
        }
    }
    
    /**
     * Decodes a single character.
     *   @param ch the character to be decoded
     *   @return the character three earlier in the alphabet, with wrap-around
     */
    public char decode(char ch) 
    {
        if (Character.isUpperCase(ch))
        {
            int index = SHIFTED.indexOf(ch);
            rotate();
            return ALPHABET.charAt(index);
        }
        else if (Character.isLowerCase(ch))
        {
            int index = shifted.indexOf(ch);
            rotate();
            return alphabet.charAt(index);
        }
        else
        {
            rotate();
            return ch;
        }
    }
    
    public void rotate()
    {
        SHIFTED = SHIFTED.substring(1, SHIFTED.length()) + SHIFTED.charAt(0);
        shifted = shifted.substring(1, shifted.length()) + shifted.charAt(0);
    }
}

