package udacity.lesson3.friends5;

import udacity.lesson3.friends4.Person;

// This you for your reference only. There is no need to modify this file.

public class PersonDemo
{
    public static void main(String[] args)
    {
    	Person sara = new Person("Sara", "C:\\Users\\pmohanasundaram\\Documents\\Git\\Java\\udacity\\lesson3\\friends3\\sara.jpg", 10, 200);
        Person chenghan = new Person("Cheng-Han", "C:\\Users\\pmohanasundaram\\Documents\\Git\\Java\\udacity\\lesson3\\friends3\\cheng-han.png", 300, 0);
        Person cay = new Person("Cay", "C:\\Users\\pmohanasundaram\\Documents\\Git\\Java\\udacity\\lesson3\\friends3\\cay.gif", 250, 180);
        
        
        sara.addFriend(cay);
        sara.addFriend(chenghan);
    }
}