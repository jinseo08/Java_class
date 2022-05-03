package day33_20220503_2;

public class StudentDTO {
	
	Long id;
	String name;
	String phone;
	String major;
	
	StudentDTO(){
		
	}

	public StudentDTO(Long id, String name, String phone, String major) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.major = major;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", phone=" + phone + ", major=" + major + "]";
	}
	
	

}
