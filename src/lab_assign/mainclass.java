package lab_assign;
import java.util.*;
public class mainclass {
	public static void main(String[] args)
	{
	  prod_cons pd=new prod_cons();
	      pd.producer();
	      pd.consumer();
	      pd.wait(4);
	      pd.signal(5);
	    System.out.println("\n1.Producer\n2.Consumer\n3.Exit");
	    while(true)
	    {
	       System.out.println("\nEnter your choice:");
	       Scanner sc=new Scanner(System.in);
	      int b=sc.nextInt();
	      
	        switch(b)
	        {
	       
	            case 1:    if((prod_cons.mutex==1)&&(prod_cons.empty!=0))
	                        pd.producer();
	                    else
	                        System.out.println("Buffer is full!!");
	                    break;
	            case 2:    if((prod_cons.mutex==1)&&(prod_cons.full!=0))
	                        pd.consumer();
	                    else
	                        System.out.println("Buffer is empty!!");
	                    break;
	            case 3:
	                    System.exit(0);
	                    break;
	        }
	    
	    }
	    
	}

}
