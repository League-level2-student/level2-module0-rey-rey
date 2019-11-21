package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] array = new String[5];
		array[0] = "one";
		array[1] = "two";
		array[2] = "three";
		array[3] = "four";
		array[4] = "five";
//adding a comment
		//2. print the third element in the array
		System.out.println( array[2]);
		
		//3. set the third element to a different value
		array[2] = array[2] + " rey";
		
		//4. print the third element again
		System.out.println( array[2]);
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for ( int ii = 0; ii < array.length; ii++ )
		{
			System.out.println( array[ii]);
		}
		
		
		//6. make an array of 50 integers
		int [] iarray = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		Random rr = new Random(100);
		for ( int ii = 0; ii < iarray.length; ii++ )
		{
			iarray[ii] = rr.nextInt(20);
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println( iarray[0]);

		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
