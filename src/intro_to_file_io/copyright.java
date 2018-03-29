package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

public class copyright {
public static void main(String[] args) {
	try {
		FileWriter f1 = new FileWriter("src/intro_to_file_io/test2.txt",true);
		FileWriter f2 = new FileWriter("src/intro_to_file_io/test.txt",true);
		FileWriter f3 = new FileWriter("src/intro_to_file_io/Assignments",true);
		FileWriter f4 = new FileWriter("src/intro_to_file_io/FileWriter.txt",true);
		FileWriter f5 = new FileWriter("src/intro_to_file_io/hello",true);
		f1.write("\n//Copyright © 2018 by LeagueProgrammer");	
		f2.write("\n//Copyright © 2018 by LeagueProgrammer");
		f3.write("\n//Copyright © 2018 by LeagueProgrammer");
		f4.write("\n//Copyright © 2018 by LeagueProgrammer");
		f5.write("\n//Copyright © 2018 by LeagueProgrammer");
		f1.close();
		f2.close();
		f3.close();
		f4.close();
		f5.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
