public class LearntoSwap {
	public static void main(String []args) {
            char[] grid = {'a', 'b'};
            swap(grid);
            
	}
	
	public static void swap(char[] grid) {
	    int col = 0;
	    char temp;
	    temp = grid[col];
	    grid[col] = grid[col+1];
	    grid[col+1] = temp;
	    System.out.print(grid[col] + " " + grid[col+1]);
	}
	    
}
