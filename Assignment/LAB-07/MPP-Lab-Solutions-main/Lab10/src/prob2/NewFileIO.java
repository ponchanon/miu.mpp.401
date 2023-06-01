package prob2;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class NewFileIO {
	private static final Logger LOG = Logger.getLogger(NewFileIO.class.getName());
	public final static String FILE_LOCATION = "E:\\MPP\\Lab10\\src\\prob2\\output.txt/";
	public final static String TO_PRINT = "This is the string to print to file.";

	void writeText(String filename, String text) throws IOException {
		try (PrintWriter writer = new PrintWriter(new FileWriter(new File(filename)))) {
			writer.print(text);
		}
	}

	public static void main(String[] args) {
		NewFileIO old = new NewFileIO();

		try {
			old.writeText(FILE_LOCATION, TO_PRINT);
		} catch (IOException e) {
			LOG.warning("Main exception: " + e.getMessage());
			List<Throwable> suppressed = Arrays.asList(e.getSuppressed());
			suppressed.forEach(except -> LOG.warning("Suppressed message: " + except.getMessage()));
		}

	}

}
