public class Multithreading {
    public static void main(String[] args) {
        Thread t  = Thread.currentThread();
        System.out.println("Current thread:"+t);
        t.setName("My Thread"); // change the name of the thread
        System.out.println("After name change:"+t);

        try
        {
            for(int n = 5; n > 0; n--)
            {
                System.out.println(n);
                Thread.sleep(5000);
            }
        }

        catch(InterruptedException e)
        {
            System.out.println("Main thread intrupted");
        }
    }
}
