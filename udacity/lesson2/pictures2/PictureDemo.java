package udacity.lesson2.pictures2;

public class PictureDemo
{
    public static void main(String[] args)
    {
        Picture rocket = new Picture("C:\\Users\\pmohanasundaram\\Documents\\Git\\Java\\udacity\\lesson2\\pictures2\\mariner4.jpg");
        rocket.translate(200, 200);
        rocket.draw();
        Picture planet = new Picture("C:\\Users\\pmohanasundaram\\Documents\\Git\\Java\\udacity\\lesson2\\pictures2\\mars.gif");
        planet.grow(-50, -50);
        planet.draw();
    }
}
