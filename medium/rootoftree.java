/* package codechef; // don't place package name! */


import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s = new Scanner(System.in);
	int t = s.nextInt();
	for(;t>0;t--){
	   int n = s.nextInt();
	   int a[][] = new int[n][2];
	   int sum =0;
	   for(int i=0;i<n;i++){
	       a[i][0] = s.nextInt();
	       a[i][1] = s.nextInt();
	       sum +=(a[i][0] - a[i][1]);
	   }
	   System.out.println(sum);
	}
	}
}

