import java.util.*;
public class Final {
	public static void main(String[] args) {
		String word = ("Mary had a little lamb");
		countWords(word);	
	}
	public static int countWords(String str) {
		int count = 0;
		while(str.next()) {
			count++;
		}
		System.out.println(count);
	}
}
