
/**
 * Creates a tree using a triangle and square.
 *
 * @author (Lily Li)
 * @version (9.27.18)
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Triangle leaves;
    private Square trunk;

    /**
     * Constructor for objects of class Tree
     */
    public Tree()
    {
        leaves = new Triangle();
        trunk = new Square();
    }

    /**
     * Method that sets up the tree
     */
    public void setup()
    {
        trunk.moveVertical(100);
        trunk.moveHorizontal(-60);
        trunk.changeSize(30);
        trunk.changeColor("brown");
        trunk.makeVisible();
        
        leaves.moveVertical(-20);
        leaves.moveHorizontal(55);
        leaves.changeSize(100, 80);
        leaves.changeColor("green");
        leaves.makeVisible();
    }
}
