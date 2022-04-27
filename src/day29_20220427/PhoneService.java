package day29_20220427;

import java.util.List;

public class PhoneService {

	void save(PhoneDTO phone) {
		// phone 객체를 Repository의 save 메서드로 넘겨서 잘넘어갔는데 sysout 확인
		// System.out.println("phoneService.save()");
		// System.out.println(phone);
		PhoneRepository pr = new PhoneRepository();
		pr.save(phone);
	}

	void findAll() {
		// System.out.println("PhoneService.findAll()");
		PhoneRepository pr = new PhoneRepository();
		// Repository에서 목록을 출력
		pr.findAll();
	}

	void findAll2() {
		PhoneRepository pr2 = new PhoneRepository();
		// Repository에서 리스트를 가져와서 여기서 출력
		List<PhoneDTO> phonelist = pr2.findAll2();
		System.out.println("PhoneRepository.findAll2() for문");
		for (PhoneDTO p : phonelist) {
			System.out.println(p);
		}
	}
}
