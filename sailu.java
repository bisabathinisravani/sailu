import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x,i=1,sum=0;
		System.out.println("enter no of items");
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		while(i<=x)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("sum of" +x+ "num is:" +sum);// your code goes here
	}
}
