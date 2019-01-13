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
	    int sum =0;
	    while(n>0){
	        sum +=(n%10);
	        n = n/10;
	    }
	    System.out.println(sum);
	}
	}
}

