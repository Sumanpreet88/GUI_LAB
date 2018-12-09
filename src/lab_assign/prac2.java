package lab_assign;
import java.util.Scanner;
public class prac2
{


public static void main(String args[])
	{
	int n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no. of array elements");
	n=sc.nextInt();
	int a[]= new int[n];
	System.out.println("enter all elements one by one ");
	for(int i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	 sum = sum+a[i]; 
	System.out.println("sum is "+sum);		
	}
}
}