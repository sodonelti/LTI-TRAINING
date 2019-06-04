package day3Inheritance_v1;

public class APPday3 {
public static void main(String[] args) {
	Logger l=new Logger();
	l.log("New Msg");
	l.log("Some message", LogLevel.INFO);
	l.log("Again some message", LogLevel.WARN);
	l.log("Some critical message", LogLevel.ERROR);
}
}
