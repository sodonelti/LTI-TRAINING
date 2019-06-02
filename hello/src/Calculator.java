public class Calculator {
	public void add(int x,int y) {
		System.out.println(x+y);
	}
public void sub(int x, int y) {
	System.out.println(x - y);
}

//NO NEED TO CREATE OBJECT FOR STATIC FUNC
//CAN CALL THEM DIRECTLY USING "CLASS_NAME.FUNC()"
public static void mul(int x,int y) {
	System.out.println(x*y);
}
}
