package day3Inheritance_v3;

import java.time.LocalDateTime;

public class ConsoleLogger  extends Logger{
//	public static void main(String[] args) {
		public void log(String msg,LogLevel level) {
				switch(level) {
				
			case INFO:
					System.out.println("[INFO] ["+LocalDateTime.now() +"] " + msg);
					break;
				case WARN:
					System.out.println("[WARNING] ["+LocalDateTime.now()+"] " + msg);
					break;
				case ERROR:
				System.out.println("[ERROR] ["+LocalDateTime.now()+"] " + msg);
				break;
				
				}
	}

}
