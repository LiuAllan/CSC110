/*
V00806981: Allan Liu
EnergyUseReport.java
This program takes a file entered by the user and sorts the information accordingly.
It will then print out the file in order, depending on what it is asked.

Input: User inputs the file name.
Output: The information in the file in sorted order.
*/

import java.io.*;//File
import java.util.*;//Scanner
public class EnergyUseReport {
	public static void main(String[] args) {
		Scanner file = null;
		try {
		//file "f" becomes file
		file = getFile();
		} 
		catch (FileNotFoundException e) {
		}
		//reads the file one at a time
		while (file.hasNext()) {
			String read = file.next();
			System.out.print(" "+read);
		}
		
	}
	
	/*
	Asks the user to input an existing file name. If the file exists, it will return a new Scanner. If it does not, it will continue to ask the user 
	until a valid one is entered.
	*/
	
	public static Scanner getFile()throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		System.out.println("Please input the file name.");
		//user's entered input file becomes "f"
		File f = new File(console.nextLine());
		//Checks if "f" does not exists
 		while (!f.exists()) {
 			System.out.println("File not found. Try again.");
 			f = new File(console.nextLine());
 		}
 		//returns a copy of "f"
 		return new Scanner(f);
 	}
 	
 	
 	public static void sortByTotalGrowth(EnergyData array[]) {
 	}
 	
 // Rearranges the elements into sorted order using the selection sort algorithm.
	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
// find index of smallest remaining value
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}

// swap smallest value its proper place, a[i]
		swap(a, i, min);
		}
	}
	//makes the swap only if the values are within the array
	public static void swap(int[] a, int index1, int index2) {
		if (index1 >= 0 && index2 >= 0 && index1 <a.length && index2 <a.length) {
			//stores index1 in a temporary variable
			int temp = a[index1];
			//replace index1 with index2
			a[index1] = a[index2];
			//replace index2 with the temporary variable
			a[index2] = temp;
			
			//to test if it is making the swap correcty
			//System.out.print(a);
		}
	}
	
	//Prints out the initial sentences
	public static void result(String[] region) {
		System.out.println("The region with the lowest per capita growth in energy use is" + region);
		System.out.println("The region with the highest per capita growth in energy use is" + region);
		System.out.println();
		System.out.println("The region with the lowest total growth in energy use is"+ region);
		System.out.println("The region with the hiest total growth in energy use is" + region);
		System.out.println("Regions that have more than doubled their total energy use from 1990-2008 are: ");
		System.out.println(region);
		System.out.println(region);
	}
}


