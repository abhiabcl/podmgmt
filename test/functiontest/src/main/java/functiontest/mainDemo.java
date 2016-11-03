package functiontest;

public class mainDemo {
	
	public static void main(String [] args){
		System.out.println("inside main ....");
		
		
		
	}
	
	interface A {};
	
	enum B implements  A{
		A,B,C;
	}
	
	enum c implements  A{
		D;
	}

}
