package day29_20220427_2;

public class HumanDTO {
	
	// 필드값 선언
	private Long id;
	private String name;
	private int age;
	
	// 기본 생성자
	HumanDTO(){
		
	}
	
	// 모든 필드값을 매개변수로 하는 생성자
	public HumanDTO(Long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// 모든 필드의 getter/setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// toString
	@Override
	public String toString() {
		return "HumanDTO [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
