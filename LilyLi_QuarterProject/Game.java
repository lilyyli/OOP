import javax.swing.*;
import java.awt.*;
/**
 * This class presents the rules of the game to the users.
 * This class also will play the game of craps.
 * 
 * @author (Lily Li)
 * @version (10.05.18)
 */
public class Game
{
    // instance variables 
    private static Dice dice1; //creates the 2 dice needed to play the game
    private static Dice dice2;
    private static Canvas canvas; //creates the canvas
    private static Font b; //creates 2 fonts that will be used to write on the canvas
    private static Font f;

    //main method 
    public static void main(String [] args)
    {
        //initializes the canvas and the fonts
        canvas = Canvas.getCanvas();
        b = new Font("Times New Roman", Font.BOLD, 25);
        f = new Font("Times New Roman", Font.BOLD, 40);
        canvas.font(b);

        //constructs the 2 die
        dice1 = new Dice();
        dice1.moveVertical(320);
        dice1.moveHorizontal(300);
        dice1.dice3();

        dice2 = new Dice();
        dice2.moveVertical(370);
        dice2.moveHorizontal(500);
        dice2.dice3();

        //displays the instructions for the user
        instructions();

        boolean loop = true; 
        //loop that continues until the user says no they don't want to play the gam
        while (loop)
        {
            //JOptionPane dialogue box asking the user if they want to play the game
            String answer = JOptionPane.showInputDialog("Do you want to play Craps? yes or no: ");

            //conditional statement for if they say yes or no
            if(answer.equals("yes")) 
            //if they say yes, the game starts
            {
                canvas.font(b); //calls the larger font to display the summary of the play
                play(); //plays the game
            }

            else
            //displays thank you message if they say no
            {
                loop = false; //stops the loop
                //creates new black background for thank you message
                Square background = new Square();
                background.changeSize(1000);
                background.changeColor("black");
                background.makeVisible();
                //makes text white
                canvas.setForegroundColor("white");

                //thank you message
                canvas.font(f);
                canvas.write("Thank you for playing Craps!", 250, 380);
                canvas.write("Goodbye!", 400, 430);
            }
        }
    }

    //method that displays the instructions of the game on the canvas 
    public static void instructions()
    {
        canvas.write("This is the game of Craps!", 30, 50);
        canvas.write("Here are the rules to the game:", 30, 80);
        canvas.write("On the 1st roll:", 30, 120);
        canvas.write("2, 3, 12 are losers; 7, 11 are winners", 30, 150);
        canvas.write("For the following rolls: ", 30, 190);
        canvas.write("7 is a loser; Getting the same value as the 1st roll is a winner", 30, 220);
        canvas.write("All other values require another roll of the dice", 30, 250);
    }

    //method that plays the game
    public static void play()
    {
        //prints the instructions before playing
        instructions();

        canvas.font(f);

        //asks the user how many games they want to play 
        String number = JOptionPane.showInputDialog("How many games do you want to play?");

        if (number.equals("1"))
        //if they only want to play one game
        {
            dice1.random(); //rolls the dice
            dice2.random();
            int dice1num = dice1.getValue(); //gets the value of the dice
            int dice2num = dice2.getValue();
            int sum = dice1num + dice2num; //finds the sum of the rolls
            String rolls = ""; //string that keeps track of all the sums of their rolls

            if (sum == 2 || sum == 3 || sum == 12)
            //they lose if they roll 2,3, or 12
            {
                rolls = rolls + sum; //adds the sum of the roll to the string of all the rolls
                canvas.write("Number of games: " + number, 30, 640);
                canvas.write("The sum of your rolls were: " + rolls, 30, 685);
                canvas.write("You lose!", 30, 730);
            }

            else if (sum == 7 || sum == 11)
            //they win if they roll 7 or 11
            {
                rolls = rolls + sum; //adds the sum of the roll to the string of all the rolls
                canvas.write("Number of games: " + number, 30, 640);
                canvas.write("The sum of your rolls were: " + rolls, 30, 685);
                canvas.write("You win!", 30, 730);
            }

            else
            //any other number established the point for the next roll
            {
                int points = sum; //the sum is the point for the next roll
                rolls = rolls + sum; //adds the sum of the roll to the string of all the rolls
                dice1.random(); //rolls the dice again
                dice2.random();
                dice1num = dice1.getValue(); //gets the new value of the dice
                dice2num = dice2.getValue();
                sum = dice1num + dice2num; //finds the sum of the roll

                boolean playing = true; 
                //loop that continues until they either win or lose
                while (playing)
                {
                    //they win if the roll the same number as the previous roll
                    if (points == sum)
                    {
                        rolls = rolls + "  " + sum; //adds the sum of the roll to the string
                        canvas.write("Number of games: " + number, 30, 640);
                        canvas.write("Your rolls were: " + rolls, 30, 685);
                        canvas.write("You win!", 30, 730);
                        playing = false; //stops the loop
                    }

                    //they lose if the roll 7
                    else if (sum == 7)
                    {
                        rolls = rolls + "  " + sum; //adds the sum of the roll to the string
                        canvas.write("Number of games: " + number, 30, 640);
                        canvas.write("Your rolls were: " + rolls, 30, 685);
                        canvas.write("You lose!", 30, 730);
                        playing = false; //stops the loop
                    }

                    //they keep rolling the dice if they roll any other value
                    else
                    {
                        rolls = rolls + "  " + sum; //adds the sum of the roll to the string
                        points = sum; //sets the sum as the new points for the next roll
                        dice1.random(); //rolls the dice again 
                        dice2.random();
                        sum = dice1.getValue() + dice2.getValue(); //gets the sum of the roll
                    }
                }
            }
        }

        //if they want to play more than 1 game
        else
        {
            int num = Integer.parseInt(number); 
            //converts the number of games the inputed from string to int
            int wins = 0; //counter for wins
            int losses = 0; //counter for losses

            //loop that plays the number of games the user inputted
            for (int i = 0; i < num; i ++)
            {
                dice1.random(); //rolls the dice
                dice2.random();
                int dice1num = dice1.getValue(); //gets the value of the dice
                int dice2num = dice2.getValue();
                int sum = dice1num + dice2num; //find the sum of the roll
                
                //they lose if they roll 2,3, or 12
                if (sum == 2 || sum == 3 || sum == 12)
                {
                    losses = losses + 1; //adds 1 to the losses counter
                }

                //they win if they roll a 7 or 11
                else if (sum == 7 || sum == 11)
                {
                    wins = wins + 1; //adds 1 to the wins counter
                }

                //they roll the dice again if they roll any other value
                else
                {
                    int points = sum; //the sum of the roll establishes the point for the next roll
                    dice1.random(); //rolls the dice
                    dice2.random();
                    dice1num = dice1.getValue(); //gets the value of each dice
                    dice2num = dice2.getValue();
                    sum = dice1num + dice2num; //finds the sum of the roll

                    boolean playing = true;
                    //loop that continues until the player wins or loses
                    while (playing)
                    {
                        //the player wins if they roll the same number as the previous roll
                        if (points == sum)
                        {
                            wins = wins + 1; //adds 1 to the wins counter
                            playing = false; //stops the loop 
                        }

                        //the player loses if they roll 7
                        else if (sum == 7)
                        {
                            losses = losses + 1; //adds 1 to the losses counter 
                            playing = false; //stops the loop
                        }

                        //the player continues rolling the dice if they roll any other number
                        else
                        {
                            points = sum; //makes the sum the point for the next roll
                            dice1.random(); //rolls the dice again
                            dice2.random();
                            sum = dice1.getValue() + dice2.getValue(); //gets the sum of this roll
                        }
                    }
                }
            }

            //displays the summary for the games 
            canvas.write("Number of games: " + number, 30, 640); 
            canvas.write("Wins: " + wins, 30, 685);
            canvas.write("Losses: " + losses, 30, 730);
        }
    }
}
