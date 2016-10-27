import java.util.*;
public class Bejeweled {
	public static void main(String []args) {
		//char [] opt = {'*', '$', '@', '+', '!', '&'};
		char[][] m = new char[8][8];
		//populateRandom(m, opt);
		drawGrid(m);
	}
	
	public static void drawGrid(char[][] grid) {
		char [] opt = {'*', '$', '@', '+', '!', '&'};
		int i = 1;
		System.out.println("  1 2 3 4 5 6 7 8");
		for (int r = 0; r < grid.length; r++) {
			System.out.print(i+" ");
			i++;
			for (int c = 0; c < grid[r].length; c++) {
				//System.out.print("$" + " ");
				populateRandom(grid, opt);
			}
			System.out.println(" ");
		}
	}
	
	
	public static void populateRandom(char[][] grid, char[] options) {
		int result;
		Random gen = new Random();
		result = gen.nextInt(6);
		//System.out.print(options[result]);
		//for (int r = 1; r < grid.length; r++) {
			//for (int c = 1; c < grid[r].length; c++) {
				System.out.print(options[result] + " ");
			//}
			//System.out.println(" ");
		}
}

