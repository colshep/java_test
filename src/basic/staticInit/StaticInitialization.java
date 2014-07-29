package basic.staticInit;

public class StaticInitialization {
	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		t2.f2(1);
		t3.f3(1);
	}

	static Table t2 = new Table();
	static Cupboard t3 = new Cupboard();

	// Bowl(1)
	// Bowl(2)
	// Table()
	// f(1)
	// Bowl(4)
	// Bowl(5)
	// Bowl(3)
	// Cupboard()
	// f(2)
	// Creating new Cupboard() in main
	// Bowl(3)
	// Cupboard()
	// f(2)
	// Creating new Cupboard() in main
	// Bowl(3)
	// Cupboard()
	// f(2)
	// f2(1)
	// f3(1)
}
