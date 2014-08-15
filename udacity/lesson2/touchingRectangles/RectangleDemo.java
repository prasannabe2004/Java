package udacity.lesson2.touchingRectangles;

// BlueJ project: lesson2/touchingRectangles
//
// You need to construct and draw two rectangles for this quiz.
//
// Both rectangles have width 20 and height 30. The first rectangle
// has top left corner at (60, 90). The bottom right corner of the 
// first rectangle should be the top left corner of the second 
// rectangle. 

public class RectangleDemo
{
    public static void main(String[] args)
    {
        Rectangle box1 = new Rectangle(60,90,20,30);
        box1.draw();
        Rectangle box2 = new Rectangle(80,120,20,30);
        box2.draw();
    }
}
