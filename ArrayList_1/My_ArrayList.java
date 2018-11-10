import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator; //deleting objects form ArrayList

/**
 * This program works with an arraylist.
 *
 * @author (Lily Li)
 * @version (10.22.18)
 */
public class My_ArrayList
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList <String> list1 = new ArrayList<String> (); //creates array list of type string
        String s = "";
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Input a string: ");
            s = scan.nextLine(); //read the input and store in string
            list1.add(s); //add string to arraylist
        }
        
        //all the loops below will print every string in the arraylist
        //the following loop would extract the strings from the arraylist
        //may be able to delete from the arraylist but it will move your indexes --> might have errors
        for (int i = 0; i < list1.size(); i++)
        //list1.size() --> length of arrayList
        {
            String p = list1.get(i);
            //System.out.println(p);
        }
        
        //for-each loop (for each string in the arraylist)
        //CANNOT delete from the arraylist
        for (String p : list1)
        {
            //System.out.println(p);
        }
        
        //CAN delete from the arraylist
        Iterator <String> it = list1.iterator();
        // put whatever type of object is in the ArrayList in the <>
        while (it.hasNext()) //so long as there is a next element in the ArrayList
        {
            String p = it.next(); //iterator method to get next object in ArrayList
            //System.out.println(p); //process the element from the arraylist
            
            //removes the string "three"
            //will manage your indices for you
            if (p.equals("three"))
            {
                it.remove();
            }
        }
        
        for (String p : list1)
        {
            System.out.println(p);
        }
    }
}