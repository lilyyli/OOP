
/**
 * Write a description of class Picture here.
 *
 * @Lily Li
 * @8/27/18
 */
public class City
{
    private Square sky;
    private Circle sun;
    
    private Rect building1;
    private Rect building2;
    private Rect building3top;
    private Rect building3bottom;
    private Rect building4;
    private Rect building5;
    private Rect building6;
    private Rect building7;
    
    private Rect window1;
    private Rect window2;
    private Rect window3;
    private Rect window4;
    private Rect window5;
    private Rect window6;
    private Rect window7;
    
    private Rect window8;
    private Rect window9;
    private Rect window10;

    private Rect window11;
    private Rect window12;
    
    private Rect window13;
    private Rect window14;
    private Rect window15;
    
    private Rect window16;
    private Rect window17;
    
    private Rect window18;
    private Rect window19;
    private Rect window20;
    private Rect window21;
    
    private Rect door1;
    private Rect door2;
    private Rect door3;
    
    private Person person1;
    private Person person2;
    private Person person3;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public City()
    {
        sky = new Square();
        sun = new Circle();
        
        building1 = new Rect();
        building2 = new Rect();
        building3top = new Rect();
        building3bottom = new Rect();
        building4 = new Rect();
        building5 = new Rect();
        building6 = new Rect();
        building7 = new Rect();
        
        window1 = new Rect();
        window2 = new Rect();
        
        window3 = new Rect();
        window4 = new Rect();
        window5 = new Rect();
        window6 = new Rect();
        window7 = new Rect();
        
        window8 = new Rect();
        window9 = new Rect();
        window10 = new Rect();
        
        window11 = new Rect();
        window12 = new Rect();
        
        window13 = new Rect();
        window14 = new Rect();
        window15 = new Rect();
        
        window16 = new Rect();
        window17 = new Rect();
        
        window18 = new Rect();
        window19 = new Rect();
        window20 = new Rect();
        window21 = new Rect();
        
        door1 = new Rect();
        door2 = new Rect();
        door3 = new Rect();
        
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeSize(1800);
            sky.changeColor("blue");
            sky.moveVertical(-120);
            sky.moveHorizontal(-320);
            sky.makeVisible();
            
            sun.changeSize(150);
            sun.changeColor("yellow");
            sun.moveVertical(-10);
            sun.moveHorizontal(550);
            sun.makeVisible();            
            
            building1.changeSize1(175);
            building1.changeSize2(620);
            building1.moveHorizontal(150);
            building1.moveVertical(100);
            building1.changeColor("magenta");
            building1.makeVisible();
            
            window1.changeSize1(125);
            window1.changeSize2(30);
            window1.changeColor("white");
            window1.moveHorizontal(175);
            window1.moveVertical(120);
            window1.makeVisible();
            
            window2.changeSize1(125);
            window2.changeSize2(30);
            window2.changeColor("white");
            window2.moveHorizontal(175);
            window2.moveVertical(180);
            window2.makeVisible();
            
            building2.changeSize1(220);
            building2.changeSize2(480);
            building2.moveHorizontal(180);
            building2.moveVertical(240);
            building2.changeColor("red");
            building2.makeVisible();
           
            window3.changeSize1(144);
            window3.changeSize2(30);
            window3.changeColor("white");
            window3.moveHorizontal(217);
            window3.moveVertical(260);
            window3.makeVisible();
            
            window4.changeSize1(144);
            window4.changeSize2(30);
            window4.changeColor("white");
            window4.moveHorizontal(217);
            window4.moveVertical(320);
            window4.makeVisible();
            
            window5.changeSize1(144);
            window5.changeSize2(30);
            window5.changeColor("white");
            window5.moveHorizontal(217);
            window5.moveVertical(380);
            window5.makeVisible();
            
            window6.changeSize1(144);
            window6.changeSize2(30);
            window6.changeColor("white");
            window6.moveHorizontal(217);
            window6.moveVertical(440);
            window6.makeVisible();
            
            window7.changeSize1(144);
            window7.changeSize2(30);
            window7.changeColor("white");
            window7.moveHorizontal(217);
            window7.moveVertical(500);
            window7.makeVisible();
            
            door1.changeSize1(80);
            door1.changeSize2(140);
            door1.changeColor("green");
            door1.moveHorizontal(250);
            door1.moveVertical(600);
            door1.makeVisible();
            
            building3bottom.changeSize1(160);
            building3bottom.changeSize2(500);
            building3bottom.moveHorizontal(500);
            building3bottom.moveVertical(220);
            building3bottom.changeColor("yellow");
            building3bottom.makeVisible();
            
            building3top.changeSize1(100);
            building3top.changeSize2(60);
            building3top.moveHorizontal(530);
            building3top.moveVertical(160);
            building3top.changeColor("yellow");
            building3top.makeVisible();
            
            window8.changeSize1(110);
            window8.changeSize2(30);
            window8.moveHorizontal(525);
            window8.moveVertical(240);
            window8.changeColor("white");
            window8.makeVisible();
            
            window9.changeSize1(110);
            window9.changeSize2(30);
            window9.moveHorizontal(525);
            window9.moveVertical(290);
            window9.changeColor("white");
            window9.makeVisible();
            
            window10.changeSize1(110);
            window10.changeSize2(30);
            window10.moveHorizontal(525);
            window10.moveVertical(340);
            window10.changeColor("white");
            window10.makeVisible();
            
            building4.changeSize1(220);
            building4.changeSize2(300);
            building4.moveHorizontal(540);
            building4.moveVertical(400);
            building4.changeColor("green");
            building4.makeVisible();
            
            window11.changeSize1(170);
            window11.changeSize2(30);
            window11.moveHorizontal(565);
            window11.moveVertical(430);
            window11.changeColor("white");
            window11.makeVisible();
            
            window12.changeSize1(170);
            window12.changeSize2(30);
            window12.moveHorizontal(565);
            window12.moveVertical(500);
            window12.changeColor("white");
            window12.makeVisible();
            
            door2.changeSize1(100);
            door2.changeSize2(140);
            door2.moveHorizontal(600);
            door2.moveVertical(570);
            door2.changeColor("yellow");
            door2.makeVisible();
            
            building5.changeSize1(170);
            building5.changeSize2(675);
            building5.moveHorizontal(1000);
            building5.moveVertical(75);
            building5.changeColor("yellow");
            building5.makeVisible();
            
            window13.changeSize1(25);
            window13.changeSize2(580);
            window13.moveHorizontal(1024);
            window13.moveVertical(100);
            window13.changeColor("white");
            window13.makeVisible(); 
            
            window14.changeSize1(25);
            window14.changeSize2(580);
            window14.moveHorizontal(1072);
            window14.moveVertical(100);
            window14.changeColor("white");
            window14.makeVisible();
            
            window15.changeSize1(25);
            window15.changeSize2(580);
            window15.moveHorizontal(1120);
            window15.moveVertical(100);
            window15.changeColor("white");
            window15.makeVisible();
            
            building6.changeSize1(200);
            building6.changeSize2(640);
            building6.moveHorizontal(1200);
            building6.moveVertical(110);
            building6.changeColor("red");
            building6.makeVisible();
            
            window16.changeSize1(130);
            window16.changeSize2(25);
            window16.moveHorizontal(1235);
            window16.moveVertical(130);
            window16.changeColor("white");
            window16.makeVisible();
            
            window17.changeSize1(130);
            window17.changeSize2(25);
            window17.moveHorizontal(1235);
            window17.moveVertical(190);
            window17.changeColor("white");
            window17.makeVisible();
            
            building7.changeSize1(250);
            building7.changeSize2(480);
            building7.moveHorizontal(1100);
            building7.moveVertical(240);
            building7.changeColor("green");
            building7.makeVisible();
            
            window18.changeSize1(20);
            window18.changeSize2(300);
            window18.moveHorizontal(1140);
            window18.moveVertical(260);
            window18.changeColor("white");
            window18.makeVisible();
            
            window19.changeSize1(20);
            window19.changeSize2(300);
            window19.moveHorizontal(1190);
            window19.moveVertical(260);
            window19.changeColor("white");
            window19.makeVisible();
            
            window20.changeSize1(20);
            window20.changeSize2(300);
            window20.moveHorizontal(1240);
            window20.moveVertical(260);
            window20.changeColor("white");
            window20.makeVisible();
            
            window21.changeSize1(20);
            window21.changeSize2(300);
            window21.moveHorizontal(1290);
            window21.moveVertical(260);
            window21.changeColor("white");
            window21.makeVisible();
            
            door3.changeSize1(150);
            door3.changeSize2(140);
            door3.moveHorizontal(1150);
            door3.moveVertical(580);
            door3.changeColor("blue");
            door3.makeVisible();
            
            person1.moveVertical(455);
            person1.changeSize(80,40);
            person1.changeColor("green");
            person1.makeVisible();
           
            person2.moveVertical(455);
            person2.moveHorizontal(20);
            person2.changeSize(80,40);
            person2.changeColor("green");
            person2.makeVisible();
            
            person3.moveVertical(455);
            person3.moveHorizontal(340);
            person3.changeSize(80,40);
            person3.changeColor("yellow");
            person3.makeVisible();
            
            person1.changeColor("white");
            person1.slowMoveHorizontal(890);
            person1.changeColor("blue");
            
            person2.changeColor("white");
            person2.slowMoveHorizontal(880);
            person2.changeColor("blue");
            
            person3.changeColor("white");
            person3.slowMoveHorizontal(600);
            person3.changeColor("blue");
            
            window18.changeColor("yellow");
            window19.changeColor("yellow");
            window20.changeColor("yellow");
            window21.changeColor("yellow");
            
            sun.slowMoveVertical(600);
            
            sky.changeColor("black");
            
         
            
            building1.makeVisible();
            
            window1.makeVisible();
            window1.changeColor("black");
            
            window2.makeVisible();
            window2.changeColor("black");
            
            building2.makeVisible();
          
            window3.makeVisible();
            window3.changeColor("black");
       
            window4.makeVisible();
            window4.changeColor("black");
            
            window5.makeVisible();
            window5.changeColor("black");
        
            window6.makeVisible();
            window6.changeColor("black");
          
            window7.makeVisible();
            window7.changeColor("black");
        
            door1.makeVisible();
            
            building3bottom.makeVisible();
           
            building3top.makeVisible();
    
            window8.makeVisible();
            window8.changeColor("black");
            
            window9.makeVisible();
            window9.changeColor("black");
            
            window10.makeVisible();
            window10.changeColor("black");
  
            building4.makeVisible();
     
            window11.makeVisible();
            window11.changeColor("black");
            
            window12.makeVisible();
            window12.changeColor("black");
           
            door2.makeVisible();
 
            building5.makeVisible();
     
            window13.makeVisible(); 
            window13.changeColor("black");
     
            window14.makeVisible();
            window14.changeColor("black");
     
            window15.makeVisible();
            window15.changeColor("black");
     
            building6.makeVisible();
            
            window16.makeVisible();
            window16.changeColor("black");
            
            window17.makeVisible();
            window17.changeColor("black");

            building7.makeVisible();
            
            window18.makeVisible();
            
            window19.makeVisible();
            
            window20.makeVisible();
            
            window21.makeVisible();
        
            door3.makeVisible();
            
            sun.changeColor("white");
            sun.slowMoveVertical(-600);
            
            person1.makeVisible();
            person1.changeColor("white");
            person1.slowMoveHorizontal(-890);
            person1.changeColor("green");
          
            person2.makeVisible();
            person2.changeColor("white");
            person2.slowMoveHorizontal(-880);
            person2.changeColor("green");
            
            window3.changeColor("yellow");
            window4.changeColor("yellow");
            window5.changeColor("yellow");
            window6.changeColor("yellow");
            window7.changeColor("yellow");
            
            window18.changeColor("black");
            window19.changeColor("black");
            window20.changeColor("black");
            window21.changeColor("black");
            
            person3.makeVisible();
            person3.changeColor("white");
            person3.slowMoveHorizontal(-600);
            person3.changeColor("yellow");
           
            window11.changeColor("yellow");
            window12.changeColor("yellow");
            
            drawn = true;
        }
    }
}
    
    