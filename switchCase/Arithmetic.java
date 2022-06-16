package switchCase;

public class Arithmetic {
	String operations;
	int number1, number2;
	double valueOfOperations;

	public Arithmetic(String operations, int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
		this.operations = operations;
	}

	public void operations() {
		switch (operations) {
		case "add":
			valueOfOperations = number1 + number2;
			System.out.println("addition of given input is: " + valueOfOperations);
		case "sub":
			valueOfOperations = number1 - number2;
			System.out.println("subtraction of given input is: " + valueOfOperations);
		case "multiply":
			valueOfOperations = number1 * number2;
			System.out.println("multiplication of given input is: " + valueOfOperations);

		case "divide":
			valueOfOperations = number1 / number2;
			System.out.println("division of given input is: " + valueOfOperations);

		case "mod":
			valueOfOperations = number1 % number2;
			System.out.println("modulus of given input is: " + valueOfOperations);
			break;
		default:
			System.out.println("enter valid input!");
		}
	}
}
