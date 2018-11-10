import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This GUI will convert celsius to fahrenheit.
 *
 * @author (Lily Li)
 * @version (11.5.18)
 */
public class CelciusConverterGUI extends JFrame 
// JFrame = parent class 
// extends = this class (CelciusConverterGUI) 
// inherits all the methods of the parent class
{
    // instance variables - replace the example below with your own
    private JLabel celsiusLabel;
    private JLabel fahrenheitLabel;
    private JButton convertButton;
    private JTextField tempTextField;

    /**
     * Constructor for objects of class CelciusConverterGUI
     */
    public CelciusConverterGUI()
    {
        setLayout(new FlowLayout());
        
        //initiate fields
        tempTextField = new JTextField(5); //textfield 5 characters long
        celsiusLabel = new JLabel();
        fahrenheitLabel = new JLabel();
        convertButton = new JButton();
        
        //set the text for the labels
        celsiusLabel.setText("Celsius");
        fahrenheitLabel.setText("Fahrenheit");
        convertButton.setText("Convert");
        
        //panel = all-purpose container
        //put components into panel --> add panel into frame
        //cannot add components directly into frame
        JPanel p = new JPanel();
        //added in order 
        //add method from JPanel
        p.add(celsiusLabel);
        p.add(tempTextField);
        p.add(fahrenheitLabel);
        p.add(convertButton);
        
        //appears on top left corner when launched
        setTitle("Celsius Converter"); 
        //good practice to say what will happen when you close the window
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(p); //add panel to JFrame
        pack(); //GUI takes all components and uses the space to make it look nice
        //always pack the frame before you complete the frame
        
        //ActionListener for button
        convertButton.addActionListener(new ActionListener()
        {
            //performs this code when button is clicked
            public void actionPerformed (ActionEvent evt)
            {
                //gets text from field and convertes it to a double
                //then multiplies it by 1.8 and add 32 (formula) and convert to int
                int tempFahr = (int)(Double.parseDouble(tempTextField.getText())*1.8+32);
                //new fahrenheit temp appears with units
                fahrenheitLabel.setText(tempFahr + " Fahrenheit");
            }
        }
        );
    }
    public static void main(String[] args)
    {
        new CelciusConverterGUI().setVisible(true);
        //create new CelciusConverterGUI object and set visible to true
        //new CelciusConverterGUI() = constructor 
        //setVisible() = method for object
    }
}