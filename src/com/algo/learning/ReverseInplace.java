package com.algo.learning;

public class ReverseInplace {

	public int[] arrReverse(int[] nums)
	{
		int startIndex =0;
		int endIndex = nums.length-1;
		while(endIndex > startIndex) {
		swap(nums,startIndex,endIndex);
		
		endIndex --;
		startIndex++;
		}
		return nums;
	}
private void swap(int[] num,int index1,int index2)
{
	int temp = num[index1];
	num[index1] = num[index2];
	num[index2]=temp;
}

}
