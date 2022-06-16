package shapesCR;

public class AreaOfCR {
	double circle, rectangle;
	int r = 2;

	AreaOfCR() {
		circle = 3.14 * r * r;

		System.out.println("area of circle is: " + circle);
	}

	AreaOfCR(int l, int b) {
		rectangle = l * b;
		System.out.println("area of rectangle is: " + rectangle);

	}
}
