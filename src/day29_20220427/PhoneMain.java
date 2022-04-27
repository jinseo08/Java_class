package day29_20220427;

public class PhoneMain {

	public static void main(String[] args) {
		// 새로운 phone 등록 = > List에 저장(List는 Repository가 가지고있음)
		// phone1 등록 : 객체 선언 후 필드 값 저장
		PhoneDTO phone1 = new PhoneDTO(1L,"아이폰","123-123",1000000);
	
		// Service 클래스에 phone1 객체를 넘기기위해 Service 객체를 만들고
		PhoneService phoneService = new PhoneService();
		// Serevice 클래스가 가지고 있는 save 메서드 호출
		phoneService.save(phone1);

		// list에 담긴 전체 데이터 조회
		phoneService.findAll();
		phoneService.findAll2();
		
		PhoneDTO phone2 = new PhoneDTO(2L,"갤럭시","222-222",2000000);
		phoneService.save(phone2);
		phoneService.findAll();
		phoneService.findAll2();
		
	}

}
