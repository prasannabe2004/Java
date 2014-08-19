package udacity.lesson4.book5;

public class BookTester
{
    public static void main(String[] args)
    {
        Book alice = new Book("C:\\Users\\pmohanasundaram\\Documents\\Git\\Java\\udacity\\lesson4\\book5\\aliceInWonderland.txt");

        System.out.println(alice.occurrencesOfAlice());
        System.out.println("Expected: 395");

        Book mary = new Book("C:\\Users\\pmohanasundaram\\Documents\\Git\\Java\\udacity\\lesson4\\book5\\mary.txt");

        System.out.println(mary.occurrencesOfAlice());
        System.out.println("Expected: 0");
    }
}
