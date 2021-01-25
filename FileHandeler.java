package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileHandeler {

	private static File file;

	public FileHandeler(String path_to_filename) {
		File file = new File(path_to_filename);
		FileHandeler.file = file;

	}

	public void write(String input) {

		String current = read();
		if (current == null) {
			current = "";
		}

		try {
			PrintWriter output = new PrintWriter(file);
			input = current + input;
			output.print(input);
			output.close();
		} catch (FileNotFoundException e) {
			System.out.println("410 File gone");
		}

	}

	public void empty() {
		try {
			PrintWriter output = new PrintWriter(file);
			output.print("");
			output.close();
		} catch (FileNotFoundException e) {
			System.err.println("410 File gone");
		}
	}

	public String read() {
		String output = "";
		String last_output = null;
		try {
			Scanner read = new Scanner(file);
			while (output != last_output) {

				last_output = output;
				output = output + read.nextLine() + "\n";
				
			}
			
			
			
			read.close();
		} catch (NoSuchElementException e) {
		} catch (FileNotFoundException e) {
			System.err.println("File nonexistent, creating file...");

		}

		output.replace("\n", "");

		return output;
	}

}