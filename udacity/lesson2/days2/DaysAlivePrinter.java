// Calculate the number of days live
public class DaysAlivePrinter
{
    public static void main(String[] args)
    {
        //Get a new instance for birthday
        Day birthDay = new Day(1951, 5, 26);
        
        //Get a new instance for lastday
        Day lastDay = new Day(2012, 7, 23);
        
        //Lets print the birthday
        System.out.print("BirthDay: ");
        System.out.println(birthDay.toString());

        //Lets print the lastday
        System.out.print("LastDay: ");
        System.out.println(lastDay.toString());
        
        int daysAlive = lastDay.daysFrom(birthDay);
        
        System.out.print("Days alive: ");
        System.out.println(daysAlive);
    }
}
