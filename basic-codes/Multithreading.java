class NumberThread extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Thread: " + i);

            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

class Multithreading
{
    public static void main(String[] args)
    {
        NumberThread thread = new NumberThread();

        thread.start();

        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Main: " + i);
        }
    }
}