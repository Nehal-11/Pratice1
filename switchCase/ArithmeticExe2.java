package switchCase;

public class ArithmeticExe2 {

	// public static void main(String[] args) {
	// TODO Auto-generated method stub
	String add = "+";
	String divide = "/";
	int number1 = 200;
	int number2 = 0;
	int result;

	void Operation() {
		switch (divide) {
		case "/":
			try {
				result = number1 / number2;
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("error occured");
			}
		}
		switch (add) {
		case "+":
			result = number1 + number2;
			System.out.println("the addition of num is: " + result);
			break;
		}
	}

	public static void main(String[] args) {
		ArithmeticExe2 oArithmeticExe2 = new ArithmeticExe2();
		oArithmeticExe2.Operation();
	}
}
