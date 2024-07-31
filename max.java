/*
Write a program to find the largest element in an array of integers.
*/
import java.util.Scanner;
public class max
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int max;
	    		System.out.print("Enter the length"  +" "  );
int len =sc.nextInt();
	    int a[]=new int [len];
             	System.out.print("Enter the value"  +  " " );
                        for(int i=0;i<len;i++)
	                          {
	                    a[i] = sc.nextInt();
	                             }
	                                max=a[0];
	                                       {
	                                         for(int i = 0; i < len; i++)
	                                                     if(max < a[i])
	                                                         {
	                                                             max = a[i];
	                                                         }
	                                       }
	                           System.out.print("Maximum value:"+max);
    }
}


	    
    




