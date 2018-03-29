package intro_to_file_io;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JFileChooser;

public class Decrypt {
	public static void main(String[] args) {
		
		 JFileChooser jfc = new JFileChooser();
		 jfc.setCurrentDirectory(new File("/Users/league/Desktop/L3_Module_2/src/intro_to_file_io"));
		 int returnVal = jfc.showOpenDialog(null);
		 if (returnVal == JFileChooser.APPROVE_OPTION) {
		 String fileName = jfc.getSelectedFile().getAbsolutePath();
		 System.out.println(fileName);
		 String encryption = "";
		
		 
		 try {
				FileReader fr = new FileReader(fileName);
				int c = fr.read();
				while(c != -1){
					//System.out.print((char)c);
					encryption+=(char)(c-1);
					c = fr.read();
					System.out.println(encryption);
				}
				fr.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
//		 try {
//				BufferedReader br = new BufferedReader(new FileReader(fileName));
//				
//				String line = br.readLine();
//				for (int i = 0; i < line.length(); i++) {
//					System.out.println(line);
//					encryption+=(char)(line.charAt(i)-1);
//					line=br.readLine();
//					System.out.println(encryption);
//				}
//				while(line != null){
//					System.out.println(line);
//					encryption+=(char)(line.charAt(line.length())-1);
//					line = br.readLine();
//					System.out.println(encryption);
//				}
//				
//				br.close();
//			} catch (FileNotFoundException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	//	try {
	//		FileWriter fw = new FileWriter(fileName);
	//		for (int i = 0; i < encryption.length(); i++) {
	//			encryption += fileName.charAt(i) - 1;
	//		}
	//		fw.write("\n" + encryption);
	//	} catch (Exception e) {
	//		e.printStackTrace();

	//	}
		 }
	}
}
