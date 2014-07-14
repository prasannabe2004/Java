
class TemperatureException extends Exception 
{
}

class TooColdException extends TemperatureException 
{
}

class TooHotException extends TemperatureException 
{
}


class VirtualPerson {
    private static final int tooCold = 65;
    private static final int tooHot = 85;
    public void drinkCoffee(CoffeeCup cup) throws TooColdException, TooHotException 
    {
        int temperature = cup.getTemperature();
        if (temperature <= tooCold) 
        {
            throw new TooColdException();
        }
        else if (temperature >= tooHot) 
        {
            throw new TooHotException();
        }
        //...
    }
    //...
}

class CoffeeCup 
{
    // 75 degrees Celsius: the best temperature for coffee
    private int temperature = 75;
    public void setTemperature(int val) 
    {
        temperature = val;
    }

    public int getTemperature() 
    {
        return temperature;
    }
}

class VirtualCafe 
{
    public static void serveCustomer(VirtualPerson cust, CoffeeCup cup) 
    {
        try 
        {
            cust.drinkCoffee(cup);
            System.out.println("Coffee is just right.");
        }
        catch (TooColdException e) 
        {
            System.out.println("Coffee is too cold.");
            // Deal with an irate customer...
        }
        catch (TooHotException e) 
        {
            System.out.println("Coffee is too hot.");
            // Deal with an irate customer...
        }
    }
}

class VendingMachine 
{
    public static void main(String[] args) 
    {
        int temperature = 0;
        if (args.length > 0) 
        {
            try 
            {
                temperature = Integer.parseInt(args[0]);
            }
            catch(NumberFormatException e) 
            {
                System.out.println("Must enter integer as first argument.");
                return;
            }
        }
        else 
        {
            System.out.println(
                "Must enter temperature as first argument.");
            return;
        }
        // Create a new coffee cup and set the temperature of
        // its coffee.
        CoffeeCup cup = new CoffeeCup();
        cup.setTemperature(temperature);
        
        // Create and serve a virtual customer.
        VirtualPerson cust = new VirtualPerson();
        VirtualCafe.serveCustomer(cust, cup);
    }
}