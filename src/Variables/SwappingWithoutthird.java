package Variables;

public class SwappingWithoutthird {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Value of a before swapping: "+a);
		System.out.println("Value of b before swapping: "+b);
		
		a=a+b;   //10+20=30
		b=a-b;    //30-20=10
		a=a-b;    //30-10=20
		
		System.out.println("Value of a after swapping: "+a);
		System.out.println("Value of b after swapping: "+b);
	}

}
