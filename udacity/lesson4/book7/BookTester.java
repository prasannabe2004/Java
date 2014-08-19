package udacity.lesson4.book7;

public class BookTester
{
    public static void main(String[] args) 
    {
        Book alice = new Book("aliceInWonderland.txt");
        
        System.out.println("    Actual " + alice.getNumCharacters()); 
        System.out.println("    Expected 144331");
    }
}
