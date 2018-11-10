
/**
 * This creates a dice for the game.
 *
 * @author (Lily Li)
 * @version (10.01.18)
 */
public class Dice
{
    // instance variables 
    public Square square;
    public Circle circle1;
    public Circle circle2;
    public Circle circle3;
    public Circle circle4;
    public Circle circle5;
    public Circle circle6;
    public Circle circle7;
    public int diceValue; //value for the dice

    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        square = new Square();
        square.changeSize(160);
        square.changeColor("red");
        
        circle1 = new Circle();
        circle1.changeSize(40);
        circle1.moveVertical(10);
        circle1.moveHorizontal(10);
        circle1.changeColor("white");
        
        circle2 = new Circle();
        circle2.changeSize(40);
        circle2.moveVertical(60);
        circle2.moveHorizontal(10);
        circle2.changeColor("white");
        
        circle3 = new Circle();
        circle3.changeSize(40);
        circle3.moveVertical(110);
        circle3.moveHorizontal(10);
        circle3.changeColor("white");
        
        circle4 = new Circle();
        circle4.changeSize(40);
        circle4.moveVertical(60);
        circle4.moveHorizontal(60);
        circle4.changeColor("white");
        
        circle5 = new Circle();
        circle5.changeSize(40);
        circle5.moveVertical(10);
        circle5.moveHorizontal(110);
        circle5.changeColor("white");
        
        circle6 = new Circle();
        circle6.changeSize(40);
        circle6.moveVertical(60);
        circle6.moveHorizontal(110);
        circle6.changeColor("white");
       
        circle7 = new Circle();
        circle7.changeSize(40);
        circle7.moveVertical(110);
        circle7.moveHorizontal(110);
        circle7.changeColor("white");
        
        diceValue = 0;
    }
    
    //method for if the dice rolls 1
    public void dice1() 
    {
        square.makeVisible();
        circle4.makeVisible(); //makes the 1 circle visible
        diceValue = 1; //sets the value of the dice
    }
    
    //method for if the dice rolls 2
    public void dice2()
    {
        square.makeVisible();
        circle1.makeVisible();
        circle7.makeVisible();
        diceValue = 2;
    }
    
    //method for if the dice rolls 3
    public void dice3()
    {
        square.makeVisible();
        circle1.makeVisible();
        circle4.makeVisible();
        circle7.makeVisible();
        diceValue = 3;
    }
    
    //method for if the dice rolls 4
    public void dice4()
    {
        square.makeVisible();
        circle1.makeVisible();
        circle3.makeVisible();
        circle5.makeVisible();
        circle7.makeVisible();
        diceValue = 4;
    }
    
    //method for if the dice rolls 5
    public void dice5()
    {
        square.makeVisible();
        circle1.makeVisible();
        circle3.makeVisible();
        circle4.makeVisible();
        circle5.makeVisible();
        circle7.makeVisible();
        diceValue = 5;
    }
    
    //method for if the dice rolls 6
    public void dice6()
    {
        square.makeVisible();
        circle1.makeVisible();
        circle2.makeVisible();
        circle3.makeVisible();
        circle5.makeVisible();
        circle6.makeVisible();
        circle7.makeVisible();
        diceValue = 6;
    }
    
    //method for moving the dice vertically
    public void moveVertical(int distance)
    {
        square.moveVertical(distance);
        circle1.moveVertical(distance);
        circle2.moveVertical(distance);
        circle3.moveVertical(distance);
        circle4.moveVertical(distance);
        circle5.moveVertical(distance);
        circle6.moveVertical(distance);
        circle7.moveVertical(distance);
    }
    
    //method for moving the dice horizontally
    public void moveHorizontal(int distance)
    {
        square.moveHorizontal(distance);
        circle1.moveHorizontal(distance);
        circle2.moveHorizontal(distance);
        circle3.moveHorizontal(distance);
        circle4.moveHorizontal(distance);
        circle5.moveHorizontal(distance);
        circle6.moveHorizontal(distance);
        circle7.moveHorizontal(distance);
    }
    
    //method for randomly rolling the dice 
    public void random()
    {
        int i = (int)(Math.random()*6)+1; //random number 1-6
        
        //conditional statements that call the methods to draw the dice according to what number is randomly picked
        if (i == 1)
        {
            dice1();
        }
        
        else if (i == 2)
        {
            dice2();
        }
        
        else if (i == 3)
        {
            dice3();
        }
        
        else if (i == 4)
        {
            dice4();
        }
        
        else if (i == 5)
        {
            dice5();
        }
        
        else if (i == 6)
        {
            dice6();
        }
    }
    
    //method to get the value of the dice
    public int getValue()
    {
        return diceValue;
    }
}

