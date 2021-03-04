package mx.com.fissoftware;

@interface HazAlgo{
	String algo() default "@$%^&";
}



@HazAlgo(algo="123")
class A{
	
}


public class MainDriver {

	
	public static void main(String[] args) {
		
		A a = new A();
		
	}

}
