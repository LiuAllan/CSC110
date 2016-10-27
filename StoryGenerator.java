/*
V00806981: Allan Liu
Story Generator

This program generates a story by gathering user input and outputting it to a new file.
The user has the option to choose a story template that contains tags that will later be replaced
by the user's input. The modified story is then printed out to the new file, allowing the user to view
the new story text file.

The user inputs: valid story template, and whatever it has between "<" and ">" tags such as nouns, city, name, colour, etc.
The program outputs: what the file name is, questions provided in the story, and a NewStory.txt.
*/

import java.io.*; // for File, FileNotFoundException
import java.util.*; // for Scanner
public class StoryGenerator {
	public static void main(String[] args)  {
		PrintStream out = null;
		Scanner console = new Scanner(System.in);
		Scanner input = null;
		
		try {
			input = getInput(console);
		}
		catch (FileNotFoundException e) {
		}
		try {
			out = new PrintStream(new File("NewStory.txt"));
 		}
 		catch(FileNotFoundException e) {
 		}
 		
 		/*
 		This piece of code takes the user's inputted story and is looked at word by word. As soon as it comes across the symbols "<" and ">",
 		it will ask the user to enter whatever is between those two tags. After it is entered, it will print the word to the "NewStory.txt" file.
 		*/
 		
		while (input.hasNext()) {
			String read = input.next();
			if (read.startsWith("<")){
				
				/*
				This while loop is required because certain tags may contain spaces such as "<your name>". This is so that it will ask
				everything between the two signs instead of each word seperately.
				*/
				
				while(!read.endsWith(">")) {
					read = read + " " +input.next();
				}//while2
				System.out.println("Please enter a: "+ read);
				read = console.nextLine();
			}//if
			
			//This was used to test if it was reading word by word.
			//System.out.println(read+" ");
			
			out.append(read+" ");
		}//while1
	}//main
	
	/*
	This getInput method asks the user to input an existing file name. If the file does not exist, it will continue to ask 
	the user until a valid one is inputted. The variable "f" is returned as a scanner once it is a file that can be read.
	*/

	public static Scanner getInput(Scanner console)throws FileNotFoundException {
 		System.out.println("Please enter the name of the story file");
 		File f = new File(console.nextLine());
 		while (!f.exists()) {
 			System.out.println("File not found. Try again.");
 			System.out.println("Please enter the name of the story file");
 			f = new File(console.nextLine());
 		}//while
 		
 		// Now that f is a file that can be read
 		return new Scanner(f);
 	}//method getInput
}//class

