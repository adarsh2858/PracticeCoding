/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
		    // Take the inputs as integer values
		    int w1 = sc.nextInt();
		    int w2 = sc.nextInt();
		    int x1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int M = sc.nextInt();
		    
		    // Calculate the minimum and maximum correct weights values
		    int minimumWeight = w1 + (M * x1);
		    int maximumWeight = w1 + (M * x2);
		    
		    if (w2 >= minimumWeight && w2 <= maximumWeight)
		        System.out.println(1);
		    else
		        System.out.println(0);
		}
	}
}
