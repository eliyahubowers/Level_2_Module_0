package arrays;

import java.sql.Array;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = {"joe","bob","tom","larry","chad","brad"};
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = "richard";
		//4. print the third element again
		System.out.println(names[2]);;
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//6. make an array of 50 integers
		int[] ages = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		int rr;
		for(int i = 0; i < ages.length; i++) {
			rr = r.nextInt(101);
			ages[i] = rr;
		}
		System.out.println("");
		System.out.println("");
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = 100;
		for(int i = 0; i < ages.length; i++) {
			if(ages[i] < smallest) {
				smallest = ages[i];
			}
		}
		System.out.println(smallest);
		System.out.println("");
		//9 print the entire array to see if step 8 was correct
		for(int i = 0; i < ages.length; i++){
			System.out.println(ages[i]);
		}
		//10. print the largest number in the array.
		int largest = 100;
		for(int i = 0; i < ages.length; i++) {
			if(ages[i] > largest) {
				largest = ages[i];
			}
		}
		System.out.println("");
		System.out.println(largest);
		
		
	}
}
