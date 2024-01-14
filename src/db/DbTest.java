package db;

public class DbTest {

	static double pi = 3.14; //Ivan 1/13/2024 - pi number

	public static void main(String[] args) {
		DbTest obj = new DbTest();
		obj.add();

		obj.divide();
	}

	public void add() {
		System.out.println(1 + 2);
	}

	public void divide() {
		System.out.println(1 / 2);
		System.out.println(10 / 2); // gio

		System.out.println(100 / 5); // Monica
		System.out.println(50 / 2); // Yasmine
	}

	public void subtract() {
		System.out.println(10 - 5); // Yasmine
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);// Ivan
	}

	public static int sircleArea(int radius) { // Ivan 1/13/2024 - sircleArea()

		double area = pi * radius * radius;

		int a = (int) area;

		return a;
		
	}

}
