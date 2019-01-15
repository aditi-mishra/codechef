/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long func(long n){
       long a = n/2+n/3+n/4;
        if(n>=a){
            return n;
        }
        else{
            return func(n/2)+func(n/3)+func(n/4);
        }
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s = new Scanner(System.in);
	//int t = s.nextInt();
	while(s.hasNextLong()){
	   long n = s.nextLong();
	  // long a[] = new long[n+1];
	  // a[0]=0;
	  // a[1] = 0;
	   long sum = func(n);
	   System.out.println(sum);
	
	}
	}
}

