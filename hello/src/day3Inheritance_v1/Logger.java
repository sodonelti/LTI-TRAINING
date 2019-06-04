package day3Inheritance_v1;

import java.time.LocalDateTime;

/**
 * A SIMPLE CUSTOM LOGGER IMPLEMENTATION
 * @author SHREENA
 * @version 1.0
 * 
 */
public class Logger {
/*	public enum LogLevel {
	}
	*/
	
	//overloading log method --->taking only msg as parameter
	//using it to display only INFO msg
	public void log(String msg) {
		log(msg,LogLevel.INFO);//CALLING THE MTD LogLevel to remove duplication of data
	}
	
	//log method ----> the arguments passed will be MSG , and what type of msg is it
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
