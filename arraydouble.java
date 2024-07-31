/*
Write a program to find the average of all the elements in an array of doubles.
*/

import java.util.Scanner;
public class arraydouble
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    		System.out.println("Enter the array length");
	    int len=sc.nextInt();
	    		int[] a=new int[len];
	    		System.out.println("Enter the  array elements ");
for(int i=0;i<len;i++)
{
                a[i] = sc.nextInt();
}
    int sum=0;
    for(int i=0;i<len;i++)
{
    sum=sum+a[i];

}
        double average=sum/2;

System.out.println("The sum of average array is = " +  average);


}

	}




        
       

