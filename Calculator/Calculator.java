import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This class implements a calculator as a GUI.
 * The user can use the calculator as a phyiscal calculator
 *
 * @author (Lily Li)
 * @version (11.6.18)
 */
public class Calculator extends JFrame
{
    JTextField f;
    String s1;
    String s2;
    String s3;
    String s4;
    String s5;
    String s6;
    boolean add;
    boolean subtract;
    boolean multi;
    boolean divi;
    boolean deci;
   
    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {
        //set the layout 
        //border layout
        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        //set text field to enter numbers and to display the results
        f = new JTextField(); //unspecified number of characters --> 20 characters
        f.setHorizontalAlignment(JTextField.RIGHT); //number aligned on right
        add(f, BorderLayout.NORTH);
        //buttons
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton c = new JButton("c"); //clear text fields
        JButton ba = new JButton("+");
        JButton bs = new JButton("-");
        JButton bm = new JButton("*");
        JButton bd = new JButton("/");
        JButton be = new JButton("=");
        JButton bdec = new JButton(".");
        JButton bpi = new JButton("pi");
        JButton bsin = new JButton("sin");
        JButton bcos = new JButton("cos");
        JButton blog = new JButton("log");
        p.setLayout(new GridLayout(4,4));
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b0);
        p.add(ba);
        p.add(bs);
        p.add(bm);
        p.add(bd);
        p.add(be);
        p.add(bdec);
        p.add(c);
        add(p, BorderLayout.CENTER);
        pack();
        setVisible(true);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setText(f.getText()+"1");
            }
        }
        );
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setText(f.getText()+"2");
            }
        }
        );
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setText(f.getText()+"3");
            }
        }
        );
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setText(f.getText()+"4");
            }
        }
        );
        b5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setText(f.getText()+"5");
            }
        }
        );
        b6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setText(f.getText()+"6");
            }
        }
        );
        b7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setText(f.getText()+"7");
            }
        }
        );
        b8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setText(f.getText()+"8");
            }
        }
        );
        b9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setText(f.getText()+"9");
            }
        }
        );
        b0.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setText(f.getText()+"0");
            }
        }
        );
        ba.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s1 = f.getText(); //save the current number from the textfield;
                f.setText("");//set textfield to space
                add = true; 
            }
        }
        );
        bs.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s1 = f.getText(); //save the current number from the textfield;
                f.setText("");//set textfield to space
                subtract = true; 
            }
        }
        );
        bm.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s1 = f.getText(); //save the current number from the textfield;
                f.setText("");//set textfield to space
                multi = true; 
            }
        }
        );
        bd.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s1 = f.getText(); //save the current number from the textfield;
                f.setText("");//set textfield to space
                divi = true; 
            }
        }
        );
        bdec.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s1 = f.getText();
                f.setText(s1+".");
                deci = true;
            }
        }
        );
        c.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setText("");
            }
        }
        );
        be.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s2 = f.getText(); //save the current number from the textfield;}
                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);
                if (add) //check whether the operation is addition
                {
                    f.setText(""+(num1+num2));
                    add = false;
                }
                else if (subtract)
                {
                    f.setText(""+(num1-num2));
                    subtract = false;
                }
                else if (multi)
                {
                    f.setText(""+(num1*num2));
                    multi = false;
                } 
                else if (divi)
                {
                    f.setText(""+(num1/num2));
                    divi = false;
                }
                else if (deci)
                {
                }
            }
        }   
        );
    }
}