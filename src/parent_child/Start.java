package parent_child;
class Children {
	int num;
	
	Children(int marker)	{
		System.out.println("Children(" + marker + ")");
	}
}

class Parent {
	
	static Children child1 = new Children(1);
	
	Parent() {
		System.out.println("Parent()");
		child3 = new Children(33);
	}
	
	Children child2 = new Children(2);
	
	void relation() {
		System.out.println("relation()");
	}
	
	static Children child3 = new Children(3);
}

public class Start {
	
	public static void main(String args[]) {
	
		Parent.child3.num = 1;
		System.out.println("main begins");
		Parent mother = new Parent();
		mother.relation();
	}
}
