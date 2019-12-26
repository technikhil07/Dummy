package non29;

public class Demo1 {
	static int wheels=2;
	int price = 200000;
	public void byke1(){
		System.out.println(wheels);
		System.out.println(price);
	}
	
	public static void byke2(){
		System.out.println(wheels);
	}

	public static void main(String[] args) {
	Demo1 d = new Demo1();
	d.byke1();
//	Demo1.byke2();

	}

}
