 /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class  FalseNumberCodechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-- > 0)
        {
            String s=sc.next();
            String s2="";
            if(s.charAt(0)>='2' && s.charAt(0)<='9')
            {
                s2="1"+s;
            }
            else
            {
                s2="10"+s.substring(1);
            }
            System.out.println(s2);

        }

	}
} 