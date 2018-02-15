package intro_to_file_io;

import java.io.FileWriter;

import javax.swing.JFileChooser;

public class Decrypt {
	public static void main(String[] args) {
		String encryption = "";
		 JFileChooser jfc = new JFileChooser();
		 int returnVal = jfc.showOpenDialog(null);
		 if (returnVal == JFileChooser.APPROVE_OPTION) {
		 String fileName = jfc.getSelectedFile().getAbsolutePath();
		 System.out.println(fileName);
	
		try {
			FileWriter fw = new FileWriter(fileName);
			for (int i = 0; i < encryption.length(); i++) {
				encryption += fileName.charAt(i) * 1;
			}
			fw.write("\n" + encryption);
		} catch (Exception e) {
			e.printStackTrace();

		}
		 }
	}
}
