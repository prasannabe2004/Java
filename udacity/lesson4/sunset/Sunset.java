package udacity.lesson4.sunset;

public class Sunset
{
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load("C:\\Users\\pmohanasundaram\\Documents\\Git\\Java\\udacity\\lesson4\\sunset\\queen-mary.png");
        pic.draw();
        for (int i = 0; i < pic.pixels(); i++)
        {
            Color c = pic.getColorAt(i);
            c.redden();
            pic.setColorAt(i, c);
        }
    }
}
