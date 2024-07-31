/*
Write a program to find the sum of all the elements in an array of integers.
*/
public class sumofarray
{
	public static void main(String[] args) {
	    int sum =0;
	    int a[]={1,2,3,5};
	    for(int i=0;i<a.length;i++)
	    {
	        sum=sum+a[i];
	    }
	    
		System.out.println("The sum of array are " + sum);
	}
}
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        
        System.out.println("Sum of the array: " + sum);
    }
}*/


