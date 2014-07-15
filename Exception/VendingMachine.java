
class TemperatureException extends Exception 
{
    private int temperature; // in Celsius
    
    public TemperatureException(int temperature) 
    {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}

class TooColdException extends TemperatureException 
{
    public TooColdException(int temperature) 
    {
        super(temperature);
    }
}

class TooHotException extends TemperatureException 
{
    public TooHotException(int temperature) 
    {
        super(temperature);
    }
}


class VirtualPerson 
{
    private static final int tooCold = 65;
    private static final int tooHot = 85;

    public void drinkCoffee(CoffeeCup cup) throws TooColdException, TooHotException 
    {
        int temperature = cup.getTemperature();
        if (temperature <= tooCold) 
        {
            throw new TooColdException(temperature);
        }
        else if (temperature >= tooHot) 
        {
            throw new TooHotException(temperature);
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
            int temperature = e.getTemperature();
            System.out.println("Coffee temperature is " + temperature + " degrees Celsius.");
            if (temperature > 55 && temperature <= 65) 
            {
                System.out.println("Coffee is cooling off.");
                // Add more hot coffee...
            }
            else if (temperature > 0 && temperature <= 55) 
            {
                System.out.println("Coffee is too cold.");
                // Give customer a new cup of coffee with the
                // proper temperature...
            }
            else if (temperature <= 0) 
            {
                System.out.println("Coffee is frozen.");
                // Deal with an irate customer...
            }
        }
        catch (TooHotException e) 
        {
           int temperature = e.getTemperature();
            System.out.println("Coffee temperature is " + temperature + " degrees Celsius.");
            if (temperature >= 85 && temperature < 100) 
            {
                System.out.println("Coffee is too hot.");
                // Ask customer to let it cool a few minutes...
            }
            else if (temperature >= 100 && temperature < 2000) 
            {
                System.out.println("Both coffee and customer are steamed.");
                // Deal with an irate customer...
            }
            else if (temperature >= 2000) 
            {
                System.out.println("The coffee is plasma.");
                // Deal with a very irate customer...
            }
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