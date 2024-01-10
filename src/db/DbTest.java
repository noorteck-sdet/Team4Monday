package db;

public class DbTest {

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
		System.out.println(20/2);// Mebrat
	}

	public void subtract() {
		System.out.println(10 - 5); //Yasmine
		System.out.println(26-1);//Jeremy
		System.out.println(70-12);//Mebrat
	}
	
	public void multiply (int a, int b) {
		System.out.println(a*b);// Ivan
	}
}
