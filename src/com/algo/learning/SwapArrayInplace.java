package com.algo.learning;

import java.util.Scanner;

public class SwapArrayInplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6};
   ReverseInplace revarry = new ReverseInplace();
   int[] arr = revarry.arrReverse(nums);
   
   for(int obj:arr)
   {
	   System.out.println(obj);
   }
	

Scanner sc = new Scanner(System.in);

String s1 = sc.nextLine();
System.out.println("Enter string s1="+s1);

String s2 = sc.nextLine();
System.out.println("Enter string s2="+s2);

String s3=s1.replace(" ", "");
String s4=s2.replace(" ", "");
String s5=s3.toLowerCase();
String s6=s4.toLowerCase();

//s1.toLowerCase().
char[] str1 = s5.toCharArray();
char[] str2 = s6.toCharArray();



AnagramProblem ap = new AnagramProblem();

boolean status = ap.solve(str1, str2);

if(status == true)
{
	System.out.println(s3+"  AND    "+s4+" these two are anagrams");
}
else
{
	System.out.println(s5+"  AND    "+s6+" these two are not anagrams");
}
	}

}
