//list allows duplicates

package arrays2;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList name = new ArrayList();
ArrayList<Integer> name1 = new ArrayList<Integer>(); //wrapperclass //startes with 0
name.add(1);
name.add(2);
name.add(3);
name.add(4);
name.add(5);

System.out.println(name);
name.set(3, 4);

System.out.println(name);
System.out.println(name.get(2)); //prints the value in the position
System.out.println(name.indexOf(4)); //prints the value's position
	}

}
