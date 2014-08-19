package udacity.lesson4.sunsetInput;

// BlueJ project: lesson4/sunsetInput
// Video: Color Your Own Sunset Effect

// TODO: Add import statement
import java.util.Scanner;

public class Sunset
{
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load("C:\\Users\\pmohanasundaram\\Documents\\Git\\Java\\udacity\\lesson4\\sunset\\queen-mary.png");

        System.out.print("Added redness: ");
        Scanner addedRed = new Scanner(System.in);
        int redValue = addedRed.nextInt();

        pic.draw();
        for (int i = 0; i < pic.pixels(); i++)
        {
            Color c = pic.getColorAt(i);
            c.redden(redValue); // TODO: Pass added redness to method
            pic.setColorAt(i, c);
        }
    }
}
