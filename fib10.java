/*
Write a program to print the first 10 numbers of the Fibonacci sequence.
*/
     
public class fib10 {
    public static void main(String[] args) {
        int[] fibonacci = new int[10];
        int a = -1;
        int b = 1;
        
        System.out.println("The Fibonacci series of the first 10 numbers is:");

        for (int i = 0; i < 10; i++) {
            int c = a + b;
            a = b;
            b = c;
            fibonacci[i] = c;  // Store the Fibonacci number in the array
        }

        // Print the Fibonacci series from the array
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci[i]);
        }
    }
}

