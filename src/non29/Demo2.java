package non29;

public class Demo2 {
	public int i= 10;
	private double d = 202.15;
	protected static String str = "Nikhil";
	
	
	public void publicmethod(){
		System.out.println(i);
		
	}
	
	private void privatemethod() {
		System.out.println(d);
	}
	
	protected static void protectedmethod() {
		System.out.println(str);
	}
	public static void main(String[] args) {
		Demo2 demo = new Demo2();
		demo.publicmethod();
		demo.privatemethod();
		demo.protectedmethod();
		

	}

}
