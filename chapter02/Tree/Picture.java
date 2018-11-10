
/**
 * Write a description of class Picture here.
 *
 * @Lily Li
 * @8/27/18
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square ground;
    private Triangle star1up;
    private TriangleDown star1down;
    private Triangle star2up;
    private TriangleDown star2down;
    private Triangle star3up;
    private TriangleDown star3down;
    private Triangle star4up;
    private TriangleDown star4down;
    private Square sky;
  
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        ground = new Square();
        star1up = new Triangle();
        star1down = new TriangleDown();
        star2up = new Triangle();
        star2down = new TriangleDown();
        star3up = new Triangle();
        star3down = new TriangleDown();
        star4up = new Triangle();
        star4down = new TriangleDown();
        sky = new Square();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("blue");
            sky.changeSize(500);
            sky.moveVertical(-150);
            sky.moveHorizontal(-310);
            sky.makeVisible();
            
            wall.moveHorizontal(-140);
            wall.moveVertical(60);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(80);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-20);
            roof.makeVisible();
            
            sun.changeColor("yellow");
            sun.moveHorizontal(100);     
            sun.moveVertical(-80);
            sun.changeSize(80);
            sun.makeVisible();
           
            drawn = true;
        }
    }
    /** 
     * Make the sun set
     */
    public void sunSet()
    {
        sun.slowMoveVertical(300);
       
        sky.changeColor("black");
        sky.makeVisible();
        
        wall.makeVisible();
            
        window.changeColor("yellow");
        window.makeVisible();
    
        roof.makeVisible();
        
        star1up.changeColor("yellow");
        star1up.moveVertical(-60);
        star1up.moveHorizontal(-120);
        star1up.changeSize(24,28);
        star1up.makeVisible();
            
        star1down.changeColor("yellow");
        star1down.moveVertical(-30);
        star1down.moveHorizontal(-120);
        star1down.changeSize(24,28);
        star1down.makeVisible();
      
        star2up.changeColor("yellow");
        star2up.moveVertical(-100);
        star2up.moveHorizontal(-20);
        star2up.changeSize(24,28);
        star2up.makeVisible();
        
        star2down.changeColor("yellow");
        star2down.moveVertical(-70);
        star2down.moveHorizontal(-20);
        star2down.changeSize(24,28);
        star2down.makeVisible();
            
        star3up.changeColor("yellow");
        star3up.moveVertical(-65);
        star3up.moveHorizontal(90);
        star3up.changeSize(24,28);
        star3up.makeVisible();
        
        star3down.changeColor("yellow");
        star3down.moveVertical(-35);
        star3down.moveHorizontal(90);
        star3down.changeSize(24,28);
        star3down.makeVisible();
        
        star4up.changeColor("yellow");
        star4up.moveVertical(-80);
        star4up.moveHorizontal(190);
        star4up.changeSize(24,28);
        star4up.makeVisible();
        
        star4down.changeColor("yellow");
        star4down.moveVertical(-50);
        star4down.moveHorizontal(190);
        star4down.changeSize(24,28);
        star4down.makeVisible();
    }
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}

