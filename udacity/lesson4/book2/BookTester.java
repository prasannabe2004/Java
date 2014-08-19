package udacity.lesson4.book2;

// Mad Hatter search
public class BookTester
{
    public static void main(String[] args)
    {
        Book alice = new Book("C:\\Users\\pmohanasundaram\\Documents\\Git\\Java\\udacity\\lesson4\\book2\\aliceInWonderland.txt");

        System.out.println(alice.firstOccurrenceOfMadHatter());
        System.out.println("Expected: -1");

        Book code = new Book("C:\\Users\\pmohanasundaram\\Documents\\Git\\Java\\udacity\\lesson4\\book2\\Book.java");
        System.out.println(code.firstOccurrenceOfMadHatter());
        System.out.println("Expected: 3");
    }
}
