package util;

import java.util.ArrayList;
import java.util.ListIterator;

public class Step {

	public void display(String str) {
		System.out.println(str);
	}

	public void getData() {
		System.out.println("Country: USA");
		System.out.println("State: VA");
		System.out.println("City: Reston");

		// added.. zipcode..
		System.out.println("Zipcod:1234");

		// added continent

		System.out.println("Continent: North America");
		System.out.println("Name");
	}

	// ahmed test to push
	public static void main(String[] args) {
		ArrayList<String> Name = new ArrayList<String>();

		Name.add("ahmed");
		Name.add("test");
		ListIterator<String> show = Name.listIterator();

		while (show.hasNext()) {

			System.out.println(show.next());

		}

	}
}
