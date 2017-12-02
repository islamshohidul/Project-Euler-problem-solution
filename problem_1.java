/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int sum = 0;
    for (int i = 3; i < 1000; i++) {       /*This problem has to deal with multiplier of 3 and 5 either any of them */
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i;  
        }
    }
    System.out.println(sum);
		
	}	
		

}
