package udacity.lesson4.fewerColors;

public class FewerColors
{
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load("C:\\Users\\pmohanasundaram\\Documents\\Git\\Java\\udacity\\lesson4\\fewerColors\\eliza.jpg");
        pic.draw();
        for (int i = 0; i < pic.pixels(); i++)
        {
            Color c = pic.getColorAt(i);
            c.reduce();
            pic.setColorAt(i, c);
        }
    }
}