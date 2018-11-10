import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays; 
import javax.swing.*;
import java.awt.*;
import java.awt.Color;

/**
 * A class for methods involving the Texas population.
 *
 * @author (Lily Li)
 * @version (10.05.18)
 */
public class Population
{
    // instance variables - replace the example below with your own
    private static File text;
    private static Scanner scan;
    private static String[] counties;
    private static int[] population;
    private static double[] percentages;
    private static Canvas canvas;
    private static Font font1;
    private static Font font2;
    private static Font font3;
    
    public static void main(String [] arg) throws FileNotFoundException
    {
        // initializes fields
        counties = new String[254];
        population = new int[254];
        percentages = new double[9]; //array to store the percentages
        
        //reading text file
        text = new File("TexasCountyPopulation.txt");
        scan = new Scanner(text); // scanner to read the text
        
        // creates arrays
        populate();
        
        
        // provides user with menu
        
        Scanner scan1 = new Scanner(System.in);
        String answer = "";
        boolean loop = true;
       
        // asks user if they want to use the program
        while (loop) //do the loop until the user inputs no
        {
            System.out.println("Would you like to look at the Texas population? yes/no: ");
            answer= scan1.nextLine();
            
            if (answer.equals("yes"))
            {
                System.out.println("Please select one of the following:");
                System.out.println("1. Print the data from the file.");
                System.out.println("2. Find Texas' total population.");
                System.out.println("3. Randomly choose a county and display its population.");
                System.out.println("4. Find counties' population with a leading digit, entered by the user.");
                System.out.println("5. Find total number of counties/percentage of population with each leading digit."); 
                System.out.println("6. Graph the percentage of counties of each leading digit.");
                
                // asking the user which option they would like to use
                System.out.println("Which option would you like to select? 1-6: ");
                Scanner scan2 = new Scanner(System.in);
                String option = scan2.nextLine();
            
                // calls the method that corresponds to the option they select
                if (option.equals("1"))
                {
                    printData();

                }
            
                else if (option.equals("2"))
                {
                    findTotal();
                }
        
                else if(option.equals("3"))
                {
                    randomCounty();
                }
        
                else if(option.equals("4"))
                {
                    showLeadingDigit();
                }
        
                else if(option.equals("5"))
                {
                    analysis();
                }
                
                else if(option.equals("6"))
                {
                    graph();
                }
                
                else
                {
                    System.out.println("That is not an option.");
                }
            }
        
            // if user doesn't want to use the program, prints goodbye message
            else 
            {
                System.out.println("Thank you for visiting my program!");
                loop = false; // user stops loop by saying no
            }
        }
    }

    // method that reads the data from the file using Scanner
    // populates 2 arrays: 1 with the counties and the other with the populations
    public static void populate() 
    {
        String line = ""; // creates an empty string 
        
        // while loop that stops when there are no more lines in the file
        while (scan.hasNextLine())
        {
            // for loop for every value in the array (254 total)
            for (int i = 0; i < 254; i++)
            {
                // the string that line is set to is the next line in the scanner
                line = scan.nextLine();
                // gets rid of all the tabs
                line = line.replaceAll("\t", "");
                
                // new array for the 3 seperate strings in one line
                String[] sArray = new String[3];
                // splits the line at the space (3 strings)
                // the 3 strings are stored as values in the array
                sArray = line.split(" ");
                
                // the counties array is made up of the first two strings (name and county)
                counties[i] = sArray[0] + " " + sArray[1];
                //the population array is made up of the last string (number) which is converted to an integer
                population[i] = Integer.parseInt(sArray[2]);
             }
        }
    }
    
    // method that prints the counties and population arrays 
    // printf is used to format 
    public static void printData()
    {
        System.out.println("Reading data from a file into an array: ");
        
        // prints every county and population is the 2 arrays
        for (int i = 0; i < 254; i++)
        {
            System.out.printf("\n %-25s %15d", counties[i], population[i]); 
            System.out.println("");
        }
    }

    // method that returns the total population of Texas
    public static void findTotal()
    {
        int totalPop = 0; // initializes total population as 0
        
        // iterates through every value of the population array
        for (int i = 0; i < 254; i++)
        {
            // adds one value of the population array to the running total population
            totalPop = totalPop + population[i];
        }
        
        //returns the total population of Texas
        System.out.println("Total population of Texas: " + totalPop); 
    }
    
    // method that asks the user for a leading digit
    // it prints the name of the county and its population 
    // with the leading digit that matches the user's input
    public static void showLeadingDigit()
    {
        // asks the user for a leading digit and stores it
        System.out.println("Enter a leading digit 1-9: ");
        Scanner scan1 = new Scanner(System.in);
        String leadingDigit = scan1.nextLine();
        
        System.out.println("Showing data with a leading digit of: " + leadingDigit);
        
        // iterates through all the populations 
        for (int i = 0; i < 254; i++)
        {
            // converts the population to a string
            String pop = Integer.toString(population[i]);
            // stores the leading digit of the population as a string
            String leadingDig = Character.toString(pop.charAt(0));
           
            // checking if the leading digit given by the user
            // is the same as the leading digit of the population
            if (leadingDigit.equals(leadingDig))
            {
                // prints the county and the population
                System.out.printf("\n %-25s %15d", counties[i], population[i]);
                System.out.println("");
            }
            
        }
    }
    
    // method that creates a random number between 0-253 (254 counties total)
    // this random number is used to randomly pick a county and its population
    public static void randomCounty()
    {
        int i = (int)(Math.random()*254); // random number 0-253
        System.out.println("The randomly chosen county at index " + i + " is: " + counties[i]);
        System.out.println("and its population is: " + population[i]);
    }
    
    // method that prints leading digits, the number of counties with that leading digit,
    // and the percentage of the population with that leading digit
    public static void analysis()
    {
        // prints headings for each column
        System.out.printf("%5s %10s %15s", "digit", "number", "percentage");
        
        // interates through each leading digit
        for (int i = 1; i < 10; i++)
        {
            // initializes counter for number of counties with that leading digit
            int countyCount = 0;
            // initializes the total population with that leading digit
            int popTotal = 0;
            
            for (int j = 0; j < 254; j++)
            {
                // converts the population to a string
                String pop = Integer.toString(population[j]);
                String leadingDig = pop.substring(0,1);
                
                if (Integer.toString(i).equals(leadingDig))
                {
                    countyCount = countyCount + 1;
                    popTotal = popTotal + population[j];
                }
            }
            
            // total population
            int totalPop = 0; // initializes total population as 0
        
            // iterates through every value of the population array
            for (int j = 0; j < 254; j++)
            {
                // adds one value of the population array to the running total population
                totalPop = totalPop + population[j];
            }
        
            // finding percentage of population with that leading digit
            double percentagePop = ((double) popTotal / totalPop) * 100;
            percentages[i-1] = percentagePop; //store percentage in array
      
            // printing the information for that leading digit
            System.out.printf("\n %2d %10d %15.2f", i, countyCount, percentagePop);
            System.out.println("");
        }
    }
    
    //graphs the percentages of counties with each leading digit
    public static void graph()
    {
        //creates canvas
        canvas = new Canvas("Population", 1100, 700);
        //creates fonts used 
        font1 = new Font("Calibri", Font.BOLD, 40);
        font2 = new Font("Calibri", Font.BOLD, 25);
        font3 = new Font("Calibri", Font.BOLD, 30);
        
        //title
        canvas.setFont(font1);
        canvas.drawString("Leading Digits of the Populations in Texas", 250, 40);
        
        //axis titles
        canvas.setFont(font3);
        canvas.drawString("Leading Digit", 530, 650);
        canvas.drawString("Population", 20, 300);
        
        //axis
        canvas.drawLine(220, 580, 1020, 580); //x-axis
        canvas.drawLine(220, 580, 220, 80); //y-axis
        
        //x-labels (number 1-9)
        int xLabelxPos = 280;
        int xLabelyPos = 610;
        for (int i = 1; i < 10; i++)
        {
            canvas.setFont(font2);
            canvas.drawString(Integer.toString(i), xLabelxPos, xLabelyPos);
            xLabelxPos = xLabelxPos + 85; 
        }
        
        //y-labels (numbers 0-100 by 10s)
        int yLabelxPos = 170;
        int yLabelyPos = 580;
        for (int j = 0; j <= 100; j += 10) //0-100 by 10s
        {
            canvas.setFont(font2);
            canvas.drawString(Integer.toString(j), yLabelxPos, yLabelyPos);
            yLabelyPos = yLabelyPos - 50;
        }
        
        //graph (graphs rectangles)
        int graphxPos = 255; //initial x-Position
        int graphyPos = 80; //initial y-Position
        double percentage = 0; //stores the percentage from the array
        int percentageInt = 0; //stores the closest int value of the percentage
        
        //calls analysis method to create the array with the percentages
        analysis();
        
        //for loop that goes through the percentages array
        for (int k = 0; k < 9; k++)
        {
            percentage = percentages[k]; //percentage from array stored in percentage
            percentageInt = (int)((percentage*100)/100); //converts double to int
            double decimal = percentages[k] - percentageInt; //finds the decimal in the double value
            
            //conditional statement that will round up or down depending on the decimal
            if (decimal < 0.5) //round down
            {
                percentageInt = (int)((percentage*100)/100);
            }
            else if (decimal >= 0.5) //round up
            {
                percentageInt = (int)((percentage*100)/100) + 1;
            }
            
            //y-Position depending on the value of percentageInt
            graphyPos = 80 + ((100 - percentageInt)*5);
            
            //random colors the rectangles
            canvas.setForegroundColor(Color.BLACK);
            
            //creates rectangle graphing the percentage
            canvas.fillRectangle(graphxPos, graphyPos, 50, percentageInt*5);
            
            graphxPos = graphxPos + 85;
        }
    }
}