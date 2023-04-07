package assignment;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		int[] array = {1,5,3,4,7,6,8};
		
		Arrays.sort(array); //sort the array
		
		/*System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);
		System.out.println(array[6]);*/
		
		
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=i+1)
			{
				System.out.println(i+1);
				break;
			}
		}
	}

}
