package db;

import java.util.LinkedHashSet;

public class DbTest {

	public static void main(String[] args) {
		DbTest obj = new DbTest();
		obj.add();

		obj.divide();

         //made by Ahmed 
		LinkedHashSet<String> teams = new LinkedHashSet<String>();

		teams.add("Team1");
		teams.add("Team2");
		teams.add("Team3");
		teams.add("Team4");
		System.out.println(teams);


		
		System.out.println("Code by Ivan");

	}

	public void add() {
		System.out.println(1 + 2);
		System.out.println(10 + 5);// Mebrat
		System.out.println(30 + 3);// again Mebrat
	}

	public void divide() {
		System.out.println(1 / 2);
		System.out.println(10 / 2); // gio

		System.out.println(100 / 5); // Monica
		System.out.println(50 / 2); // Yasmine
		System.out.println(20 / 2);// Mebrat
	}

	public void subtract() {
		System.out.println(10 - 5); // Yasmine
		System.out.println(26 - 1);// Jeremy
		System.out.println(70 - 12);// Mebrat
	}


	public void multiply(int a, int b) {
		System.out.println(a * b);// Ivan

		// test111

		// Monica commenting from Github

		System.out.println(56 * 8); // Monica
		System.out.println("Lana");

	}
	//practiceing the pull request
	public void state() {
		System.out.println("OH");
	}
	//Test by MEbrat at 10:29pm
}
