package sample;

public class CountDigit {
	int number, count = 0, sum;

	CountDigit(int number) {
		this.number = number;
	}

	void DigitCounting() {
		while (number > 0) 
		{
			count = number % 10; 
			number = number / 10;
			sum = count + sum;
		}
		System.out.println("Sum of given number is: " + sum);
	}

}
