package day3Inheritance_v1;

public class APPday3 {
public static void main(String[] args) {
	//TESTING OUR LOGGER
	//Logger l=new Logger(); -----> to get the output of logger class
	ConsoleLogger c=new ConsoleLogger();// ------> if we want the output og console logger
	c.log("HI");
	c.log("SUP message", LogLevel.INFO);
	c.log("Again message", LogLevel.WARN);
	c.log("SUP critical message", LogLevel.ERROR);
	
	FileLogger l=new FileLogger();// TO GET OUTPUT OF FileLogger
	l.log("New Msg");
	l.log("Some message", LogLevel.INFO);
	l.log("Again some message", LogLevel.WARN);
	l.log("Some critical message", LogLevel.ERROR);
}
}
