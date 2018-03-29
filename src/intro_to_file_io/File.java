package intro_to_file_io;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class File {
public static void main(String[] args) {
	String message = JOptionPane.showInputDialog("Type a message.");
	String encryption = "";
	String word = "";
	try {
		FileWriter fw = new FileWriter("src/intro_to_file_io/FileWriter.txt");
		for (int i = 0; i < message.length(); i++) {
			encryption+=(char)(message.charAt(i)+1);
	//		word+=message.charAt(i)-1;
			System.out.println(encryption);
		}
	//	fw.write(message);
		fw.write(encryption);
	//	fw.write("\n" + word);
	//	for (int i = 0; i < encryption.length(); i++) {
	//		message+=encryption.charAt(i)%1;
	//	}
	//	fw.write("\n"+message);
		
		
		
	//	for (int i = 0; i < encryption.length(); i++) {
	//		word+=encryption.charAt(i)-1;
	//	}
	//	fw.write("\n"+word);
		fw.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
