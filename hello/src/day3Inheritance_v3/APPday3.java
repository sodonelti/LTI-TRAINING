package day3Inheritance_v3;

public class APPday3 {
public static void main(String[] args) {
	//TESTING OUR LOGGER
	//Logger l=new Logger(); -----> to get the output of logger class
/*	ConsoleLogger c=new ConsoleLogger();// ------> if we want the output og console logger
	c.log("HI");
	c.log("SUP message", LogLevel.INFO);
	c.log("Again message", LogLevel.WARN);
	c.log("SUP critical message", LogLevel.ERROR);
*/
	
	//FileLogger l=new FileLogger();// TO GET OUTPUT OF FileLogger
	
	/*BY USING THIS WE HAVE DONE ABSTRACTION 
	-WE ASK THE FACTORY TO MAKE THE CHANGES EVERYWHERE FOR US
	AS TO WHAT VALUES WE WANT EITHER FileLogger OR ConsoleLogger.
	*/
	Logger l=LogFactory.getLoggerInstance(); // [ ABSTRACTION  ]
	l.log("KEERTI");
	l.log("HOW", LogLevel.INFO);
	l.log("IS LIFE", LogLevel.WARN);
	l.log("GOING", LogLevel.ERROR);
}
}
