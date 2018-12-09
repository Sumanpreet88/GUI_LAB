package lab_assign;
import java.util.Queue;
public class Consumer_thread  extends Thread
{   
	public void consumer()throws InterruptedException
	{
	while(true)
	{
	synchronized(this)
	{while(BoundedBuffer.q.size()==0)
	{
		System.out.println("items not enough to consume");
		wait();
	}
	System.out.println("Consumer_thread is running");
	BoundedBuffer.q.remove();
	System.out.println("contents after removing items from buffer "+BoundedBuffer.q);
	notify();
	Thread.sleep(1000);
	}
	}
	}
	public void run()
	{
	    try
		{
			consumer();
		}
		
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}   
	}
}


