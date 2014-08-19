package udacity.lesson4.book7;

// BlueJ Project: lesson4/book7
// Video: Working with the Book Text

import java.util.Scanner;

public class LookUpAnyWord
{
    public static void main(String[] args)
    {
        System.out.print("Type a word and I'll tell you how many times it appears: ");
        // TODO: Create an scanner object to read the user input
        Scanner scan = new Scanner(System.in);
        
        // Read a word from the scanner and assign it to a String variable named word
        String word = scan.next();
        
        // TODO: Create a book object that reads from aliceInWonderland.txt
        Book mybook = new Book("C:\\Users\\pmohanasundaram\\Documents\\Git\\Java\\udacity\\lesson4\\book7\\aliceInWonderland.txt");
        int occurrences = mybook.occurrencesOf(word);

        // TODO: Find the number of occurences of that word and assign it to a variable named occurences
        System.out.println(word + " occurs " + occurrences + " times!");
        
        scan.close();
    }
}
