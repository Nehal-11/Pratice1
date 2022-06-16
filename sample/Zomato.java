package sample; //method overloading

class Zomato {
	String restaurantName;
	String dishName, customerFavourites;
	String offers, address;
	int price;
	String deliveryCharges;
	double rating;

	void show(String restaurantName) {
		System.out.println("Restaurant name is: " + restaurantName);
	}

	void show(String dishName, String offers, String address) {
		System.out.println("name of dish is: " + dishName);
		System.out.println("offer for dish: " + offers);
		System.out.println("delivery address is:" + address);
	}

	void show(String customerFavourites, int price, double rating, String deliveryCharges) {
		System.out.println("Cusomer favourites: " + customerFavourites);
		System.out.println("price of the dish: " + price);
		System.out.println("customer rating: " + rating);
		System.out.println("Delivery charges:" + deliveryCharges);
	}
}
