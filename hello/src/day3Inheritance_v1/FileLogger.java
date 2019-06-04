package day3Inheritance_v1;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileLogger extends Logger {
	//OVER RIDING Log() mtd from logger class
	public void log(String msg,LogLevel level) {
		// THE BOOLEAN 'TRUE' IS USED TO OPEN THE FILE IN APPEND MODE , 
		//IF FALSE THEN IT OVERIDES THE CONTENT INSIDE THE FILE
		try(FileWriter fw= new FileWriter("APP.log",true)){
				
			switch(level) {
			
			case INFO:
					fw.write("[INFO] ["+LocalDateTime.now() +"] " + msg +"\n");
					break;
				case WARN:
					fw.write("[WARNING] ["+LocalDateTime.now()+"] " + msg+"\n");
					break;
				case ERROR:
					fw.write("[ERROR] ["+LocalDateTime.now()+"] " + msg +"\n");
				break;
				
				}
		}
			catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
		}
		
	}
	
}
