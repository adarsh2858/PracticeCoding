/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int testCases=sc.nextInt();
		for(int i=0;i<testCases;i++){
		    int totalJobs=sc.nextInt();
		    int completedJobs=sc.nextInt();
            int[] indices=new int[completedJobs];
            for(int j=0;j<completedJobs;j++){
                indices[j]=sc.nextInt();
            }
		    // for(int b:indices)
            // System.out.println(b);
            int len=totalJobs-completedJobs;
            int[] jobsLeft=new int[len];
            List chef=new ArrayList<Integer>();
            List asst=new ArrayList<Integer>();
            int count=0;
		    for(int j=1;j<=totalJobs;j++){
                boolean flag=true;
                for(int b: indices){
                    if(j==b)
                        flag=false;
                }
                if(flag){
                    jobsLeft[count++]=j;
                    if(count%2!=0)
                    chef.add(j);
                    else
                        asst.add(j);
                    }
                }
                for(Object a:chef)
                System.out.printf("%d ",a);
                System.out.println("");
            for(Object a:asst)
            System.out.printf("%d ",a);
		}
        sc.close();
	}
}
