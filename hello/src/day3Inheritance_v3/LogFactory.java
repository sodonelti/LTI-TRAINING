package day3Inheritance_v3;

public class LogFactory {

	public static Logger getLoggerInstance() {
		// IF I WANT FILE LOGGER THEN ILL CHANGE return new FilensoleLoggerLogger();
		return new ConsoleLogger(); 
		
	}
}
