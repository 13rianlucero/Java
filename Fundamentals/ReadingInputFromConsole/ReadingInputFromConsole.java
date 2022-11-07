package ReadingInputFromConsole;
// Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadingInputFromConsole {
	public static void main(String[] args)
		throws IOException
	{
		// Display inquiry for input text from user
		System.out.println("Please type your input message: ");

		// Enter data using BufferReader
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));

		// Reading data using readLine
		String name = reader.readLine();

		// Printing the read line
		System.out.println(name);
	}
}
