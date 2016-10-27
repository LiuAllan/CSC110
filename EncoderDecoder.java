import java.io.*;
import java.util.*;
public class EncoderDecoder {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		Scanner input = null;
		
		try{
			input = existing(console);
		}
		catch (FileNotFoundException e) {
		}
		encrypt(input);
	}
	
	public static Scanner existing(Scanner console) throws FileNotFoundException {
 		System.out.println("Enter the input file");
 		File f = new File(console.nextLine());
 		if (!f.exists()) {
 			System.exit(0);
 		}
 		return new Scanner(f);
 	}
 	
 	public static void encrypt(Scanner values) {
 		String line = values.nextLine();
 		char [] letters = line.toCharArray();
 		for(int i=0;i<letters.length;i++) {
 			letters[i] = letters[i]-26;
 			System.out.println(letters[i]);
 			
 			
 			
 			
 			
 			//int = num;
 			//num = Character.getNumericValue(letters[0]);
 			
 			
 			//int n = Integer.parseInt("56");
 			//System.out.println(num);
 		}
 	}
 	
 	
 }
