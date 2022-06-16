package switchCase;

public class ArithmeticExe 
{
	String operations, add;
	int number1, number2;
	double valueOfOperations;

	public ArithmeticExe(String operations, int number1, int number2) 
	{
		this.number1 = number1;
		this.number2 = number2;
		this.operations = operations;
		this.add = add;
	}

	public void operations() 
	{
		switch (operations) 
		{
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
			try 
			{
				valueOfOperations = number1 / number2;
			}
			catch (Exception e) 
			{
				// TODO: handle exception
				System.err.println("error occured");
			}

			/*
			 * case "mod": valueOfOperations = number1 % number2;
			 * System.out.println("modulus of given input is: " + valueOfOperations); break;
			 */
		default:
			System.out.println("enter valid input!");
		}

		
	}

	public static void main(String[] args) 
	{
		ArithmeticExe oArithmeticExe = new ArithmeticExe("add", 10, 0);
		oArithmeticExe.operations();

	}
}
