package mx.com.fissoftware;

@interface HazAlgo{
	String algo() default "@$%^&";
}



@HazAlgo(algo="123")
class A{
	
	private int algo;
	
	public int getAlgo() {
		return algo;
	}
	public void setAlgo(int algo) {
		this.algo = algo;
	}
	
	public void printAlgo() {
		System.out.println("Algo");
	}
}


public class MainDriver {

	
	public static void main(String[] args) {
		
		var a = new A();
		a.printAlgo();
		
		var claseMala = new SoyUnaClaseMala();
		claseMala.metodoQueSiSeVaAProduccionTruenaTodo();
	}

}
