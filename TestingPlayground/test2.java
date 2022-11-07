package TestingPlayground;

import java.io.*;

public class test2 {
    public static void main(String[] args) throws IOException {
        // Display message asking for input
        System.out.println("please type your input message: ");

        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        // Create a string var and assign it to reader's buffer
        String input = reader.readLine();

        // print out input's contents to the console:
        System.out.println("User Input: " + input);
    }
}
