package methods_overriding;

public class Child_alongdiffmethod extends parent {
		
		public void fun() {
		
		System.out.println("Happy");
		super.fun(); //will invoke method of parent
		
		}

public static void main(String[] args) {
	parent b = new Child_alongdiffmethod();
	b.fun();
	
}
}



