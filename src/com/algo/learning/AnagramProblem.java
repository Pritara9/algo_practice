package com.algo.learning;

import java.util.Arrays;

public class AnagramProblem {

	
	public boolean solve(char[] s1, char[] s2)
	{
		boolean check = true;
		if(s1.length != s2.length)
			return false;
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		for (char ch : s1)
		{
			System.out.println(ch);
		}
		
		for (char ch : s2)
		{
			System.out.println(ch);
		}
		for(int i=0;i<s1.length;i++)
		{
			
			if(s1[i]!=s2[i])
			{
				System.out.println("this is false  S1=="+s1[i]);
				System.out.println("this is false S2=="+s2[i]);
				check = false;
				//return check;
			}

			System.out.println("this is true S1=="+s1[i]);
			System.out.println("this is true S2=="+s2[i]);
		
			//return true;
		}
		if (check==false)
		{
			return false;
		}
		else
		{
		return true;
	}
	}
}
