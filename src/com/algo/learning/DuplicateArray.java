package com.algo.learning;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] names = {2,5,4,2,8,5,2,6,7,5};
		int count=0;
		Set<Integer> store = new HashSet<>();
		for(int name:names)
		{
			if(store.add(name)==false)
			{
				System.out.println("Found a duplicate values=="+name);
				count++;
				
			//store.remove(name);
				
			}
//			else
//			{
//				System.out.println("NO duplicate values Found==");
//			}
		
	} System.out.println("Number of duplicate found =="+count);
	for(int name:names)
	{
		System.out.println(name);
	}
	}

}
