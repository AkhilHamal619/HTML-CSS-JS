package CSS;

class WaitNotifyDemo extends Thread
{
    void display()
    {
        synchronized(this)
        {
        for(int i=0; i<=5; i++)
        {
            System.out.println("Child Thread:"+i);
        }
        notify();
    }
}

}

public class InterThreadCommunication 
{
    public static void main(String[]args)
    {
        WaitNotifyDemo t = new WaitNotifyDemo();
        synchronized(t)
        {
            System.out.println("main thread is paused..");

            t.start();

            try
            {
                t.wait();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
                  System.out.println("main thread is resumed..");
        }


    }
}
