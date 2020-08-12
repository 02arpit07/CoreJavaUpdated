package JavaAdditionalConceptQues.Mutithreading;

public class ThreadCreation {
    public static  void main(String[] args)
    {

        for(int i=0;i<8;i++)
        {
            Multithreadingobject ob=new Multithreadingobject();
            ob.start();


        }
    }
}
class Multithreadingobject extends Thread
{
    public void run()
    {
        try{
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");
        }
        catch (Exception e)
        {
            System.out.print("Exception is caught");
        }
    }
}
