class test implements Runnable
{
    public void run()
    {
        for(int i = 0; i<0; i++)
        {
            System.out.println("Thread 1");
        }
    }
}


public class ThreadDemo 
{
    public static void main(String[] args) 
    {
        test t = new test();
        Thread th = new Thread(t);
        th.start();
        for(int i = 0; i<10; i++)
        {
            System.out.println("Thread");
        }
    }
}
