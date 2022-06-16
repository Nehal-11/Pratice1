package countLength;

public class LengthOfName 
{
	String firstName, lastName;
	LengthOfName(String firstName , String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	void nameLength() 
	{
		if (firstName.length() < lastName.length()) 
		{
			System.out.println("the largest: " + lastName);
			System.out.println(lastName + " is " + (lastName.length() - firstName.length())
					+ " characters greater than " + firstName);
		} 
		else if (firstName.length() == lastName.length()) 
		{
			System.out.println("fistName and lastName are equal");
		} 
		else 
		{
			System.out.println("the largest is: " + firstName);
			System.out.println(firstName + " is " + (firstName.length() - lastName.length())
					+ " characters greater than " + lastName);
		}
	}

	/*
	 * public void nameLength() { for (int charIndex = 0; charIndex < name.length();
	 * charIndex++) { count++; } System.out.println("the given character is: " +
	 * name + "\n" + "the no. of characters are: " + count); }
	 */

}
