package day34_20220504_2;

// TestInterface의 구현클래스로 선언
public class ImplClass1 implements TestInterface{

	@Override
	public void hello() {
		System.out.println("ImpCalss1.hello()");
		
	}

	@Override
	public void hello2(String name) {
		System.out.println("ImpCalss1.hello2()" + name);
		
	}
	
	

}
