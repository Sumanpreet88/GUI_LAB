package lab_assign;
import java.io.*;
import java.util.*;
import java.util.*;
public class multithreading
{
public static void main(String arg[])
{
	System.out.println("Enter max Range of buffer");
	Scanner sc=new Scanner(System.in);
	BoundedBuffer.q=new LinkedList();
	BoundedBuffer.max_size=sc.nextInt();
	//producer thread
Producer_thread p_thread=new Producer_thread();

//consumer thread
Consumer_thread c_thread=new Consumer_thread();
p_thread.start();
c_thread.start();
try
{//producer thread will finish
	p_thread.join();
System.out.println("Producer_thread is alive "+p_thread.isAlive());
//consumer thread will finish
c_thread.join();
System.out.println("Consumer_thread is alive "+c_thread.isAlive());
}
catch(Exception e)
{
	System.out.println(e.getMessage());
}
}}

