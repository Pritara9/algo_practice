package com.algo.learning;

public class RemoveDuplicate {

	public static void main(String[] args)
	{
		int [] arr = {1,2,2,4,4,5,5,6,6,7,7,8,7,8,8};
		
		int len=arr.length;
		int j=0;
		
		for(int i=0;i<len-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[len-1];
	for(int k=0;k<j;k++)
	{
		System.out.println(arr[k]+" ");
	}
	}
}
