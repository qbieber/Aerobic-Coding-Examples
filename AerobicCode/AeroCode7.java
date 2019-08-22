class NumberCounter extends Thread
{
    @Override
    public void run()
    {
        try
        {
            System.out.println("Thread " + Thread.currentThread().getId() + " has started");
        {
                for (int i = 0; i < 11; i++)
            {
                    System.out.println("Thread" + Thread.currentThread().getId() + ": " + i);
            }
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " has finished");
    }         
}


public class AeroCode7
{
    public static void main(String[] args)
    {
        NumberCounter t1 = new NumberCounter();
        NumberCounter t2 = new NumberCounter();
        NumberCounter t3 = new NumberCounter();

        t1.start();
        t2.start();
        t3.start();
    }
}