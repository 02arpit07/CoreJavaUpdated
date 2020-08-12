package JavaAdditionalConceptQues.Mutithreading;

public class ThreadCreationUsingRunnableInterface {
    public static void main(String[] args)
    {
        for(int i=0;i<8;i++)
        {
           Thread obj=new Thread(new Multithreadobj());
            obj.start();
        }
    }

}
class Multithreadobj implements Runnable
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

