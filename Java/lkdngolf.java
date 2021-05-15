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
        
        for(int i = 0; i<T; i++) {
            int N = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            
            ArrayList<Integer> tc = new ArrayList<Integer>();
            
            for (int j = N+1; j >= 0; j-=k) {
                    if (j < x)
                        break;
                    tc.add(j);
                }
            
            boolean flag = false;
            
            for (int j = 0; j < tc.size(); j++)
                if (tc.get(j) == x) {
                    flag = true;
                    break;
                }
        
            if((x % k) == 0 || flag)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
	}
}
