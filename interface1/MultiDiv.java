package interface1;

interface Calculation {
	void multiply();

	void divide();

}

public class MultiDiv implements Calculation {
	int a = 20;
	int b = 10;
	int c;

	@Override
	public void multiply() {
		c = a * b;
		System.out.println("the multiplication of two number is: " + c);

	}

	@Override
	public void divide() {
		c = a / b;
		System.out.println("the div of two number is: " + c);
	}

}
