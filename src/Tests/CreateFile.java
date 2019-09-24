package Tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {

	public static void main(String[] args) throws IOException {

		File f = new File("/Users/Administrator/Desktop/values.txt");
		PrintWriter pw = new PrintWriter(new FileWriter(f));
		pw.println("12" + "\n27" + "\n0" + "\n51");
		pw.close();

	}
}