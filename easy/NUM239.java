/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int func(int k){
        if(k%10 ==2 || k%10 == 3 || k%10 == 9)
        return 1;
        else
        return 0;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s = new Scanner(System.in);
	int t = s.nextInt();
	for(;t>0;t--){
	    int l = s.nextInt();
	    int r = s.nextInt();
	    int sum =0;
	    for(int i=l;i<=r;i++){
	        sum+=func(i);
	    }
	    System.out.println(sum);
	}
	}
}

