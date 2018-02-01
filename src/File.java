import java.io.FileWriter;

import javax.swing.JOptionPane;

public class File {
public static void main(String[] args) {
	String message = JOptionPane.showInputDialog("Type a message.");
	try {
		FileWriter fw = new FileWriter("src/intro_to_file_io/FileWriter.txt");
		fw.write(message);
		fw.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
