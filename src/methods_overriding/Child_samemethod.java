package methods_overriding;

public class Child_samemethod extends parent{
	
	public void fun() {
		System.out.println("Hat");
	}

	public static void main(String[] args) {
		parent ob1 = new Child_samemethod ();
	    parent ob2 = new parent();
		ob1.fun();
		ob2.fun();
	}
}
