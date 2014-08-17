package udacity.lesson2.rectangles;

 

public class BlockTower
{
   public static void mydraw(double x,double y,double a,double b,Color color)
   {
       Rectangle box1 = new Rectangle(x,y,a,b);
       if (color == Color.GRAY)
       {
    	   color = new Color(125,125,255);
       }
       box1.setColor(color);
       box1.draw();box1.fill();
   }
    
   public static void main(String[] args)
   {
	   mydraw(20,70,40,30, Color.BLUE);
       mydraw(60,70,40,30, Color.MAGENTA);
       mydraw(100,70,40,30, Color.CYAN);
       mydraw(40,40,40,30, Color.RED);
       mydraw(80,40,40,30, Color.PINK);
       mydraw(60,10,40,30, Color.GRAY);
   }
}

