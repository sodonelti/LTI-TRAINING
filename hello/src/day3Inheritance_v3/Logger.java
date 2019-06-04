package day3Inheritance_v3;

//import java.time.LocalDateTime;

/**
 * A SIMPLE CUSTOM LOGGER IMPLEMENTATION
 * @author SHREENA
 * @version 1.0
 * 
 */
public abstract class Logger {
/*	public enum LogLevel {
	}
	*/
	
	//overloading log method --->taking only msg as parameter
	//using it to display only INFO msg
	public void log(String msg) {
		log(msg,LogLevel.INFO);//CALLING THE MTD LogLevel to remove duplication of data
	}
	
	//log method ----> the arguments passed will be MSG , and what type of msg is it FIRST
	//SECOND ABSTRACT MTD
	public abstract void log(String msg,LogLevel level);
	
}
