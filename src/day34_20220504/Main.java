package day34_20220504;

public class Main {

	public static void main(String[] args) {
		// 부모클래스 객체
		ParentClass parent = new ParentClass();
		ParentClass parent1 = new ParentClass("하츄핑","인천");

		System.out.println("");
		// 자식클래스 객체
		ChildClass child = new ChildClass();
		ChildClass child1 = new ChildClass("방글핑","서울");
		
		//부모가 가지고 있는 hello 메서드 호출
		child.hello();
		System.out.println(child1.getName());
		
		
	}

}
