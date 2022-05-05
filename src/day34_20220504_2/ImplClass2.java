package day34_20220504_2;

public class ImplClass2 implements TestInterface{

	@Override
	public void hello() {
		System.out.println("ImpCalss2.hello()");
		
	}

	@Override
	public void hello2(String name) {
		System.out.println("ImpCalss2.hello2()" + name);
		
	}

}
