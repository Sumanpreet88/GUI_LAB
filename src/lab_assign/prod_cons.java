package lab_assign;
import java.io.*;
import java.util.Scanner;
public class prod_cons 
{
static int mutex,full,empty,k;
int n;
public void producer()
{int mutex=1,full=0,empty=3,k=0;
     mutex=wait(mutex);
     full=signal(full);
     empty=wait(empty);
     k=k+1;
    System.out.println("\nProducer produces the item:"+Integer.toString(k));
    mutex=signal(mutex);
}
public void consumer()
{
	int mutex=1,full=0,empty=3,k=0;
     mutex=wait(mutex);
     full=wait(full);
     empty=signal(empty);
    System.out.println("\nConsumer consumes item %d"+Integer.toString(k));
    int x=0;
    x--;
    mutex=signal(mutex);
}
public static int wait(int s)
{
    return (--s);
}
 
public static int signal(int s)
{
    return(++s);
}
}


