package lab_assign;
import java.util.*;
public class Producer_thread  extends Thread
{
	public  void producer()throws InterruptedException
	{
		while(true)
		{   
			   synchronized(this)    //synchronized is used for mutual exclusion
				{while(BoundedBuffer.q.size()==BoundedBuffer.max_size)//wait if buffer is full
				{
					//System.out.println("buffer is full!!!");
					wait();
				}
				System.out.println("Enter item for adding");
				Scanner sc=new Scanner(System.in);
				int value=sc.nextInt();
				System.out.println("producer_thread is running");
				BoundedBuffer.q.add(Integer.valueOf(value));
				System.out.println("contents of buffer after adding "+value+BoundedBuffer.q);
			    notify();
			    Thread.sleep(1000);
				}	
		}
	}
	public void run()
	{
	
		try {
	    producer();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}
}


