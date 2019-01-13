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
		int n = s.nextInt();
		BigInteger a[] = new BigInteger[101];
		a[0] = new BigInteger("1");
		for(int i =1; i<101;i++){
		    a[i] = a[i-1].multiply(new BigInteger(""+i));
		  //  System.out.print(a[i]+" ");
		}
		
	    for(int i=0;i<n;i++){
	        int k = s.nextInt();
	        System.out.println(a[k]);
	    }
	}
}

