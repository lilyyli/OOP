
/**
 * This program tests the classroom --> Tests every line of code
 *
 * @author (Lily Li)
 * @version (9.5.18)
 */
public class Test_Classroom
{
    public Test_Classroom()
    {
        Classroom c = new Classroom(); //creating object of class Classroom
        //c.classroom_Information(); //method of object --> shows me everything about this object
        Classroom c1 = new Classroom("A156", 30); //tests parameters
        //c1.classroom_Information();
        //System.out.println("Location: " + c1.get_Loc()); //tests getLocation()
        //System.out.println("Size: " + c1.get_Size());
        c1.set_Number_Of_Tables(10);
        c1.set_Number_Of_Chairs(50);
        System.out.println("Number of Tables: " + c1.get_Number_Of_Tables());
        System.out.println("Number of Chairs: " + c1.get_Number_Of_Chairs());
    }
}
