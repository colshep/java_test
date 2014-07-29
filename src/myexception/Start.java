package myexception;

public class Start {
	
	public void throw1() throws MyException {
			throw new MyException() ;
	}
	
	public void throw2() {
		try {
			throw1() ;
		} catch(MyException e) {
			System.out.println("catch MyExcetpion!");
		}
	}
	
	public static void main(String args[]) {
		new Start().throw2() ;
	}
}
