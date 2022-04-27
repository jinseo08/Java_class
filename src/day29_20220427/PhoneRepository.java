package day29_20220427;

import java.util.ArrayList;
import java.util.List;

public class PhoneRepository {
	
	static List<PhoneDTO> phoneList = new ArrayList<>();
	
	void save(PhoneDTO phone) {
		// 객체 전달 확인용 프린트
		// System.out.println("PhoneRepository.save()");
		// System.out.println(phone);
		phoneList.add(phone);
	}
	
	void findAll() {
		System.out.println("PhoneRepository.findAll()");
		for(PhoneDTO p : phoneList) {
			System.out.println(p);
		}
	}
	//findAll1 메서드 정의
	//리턴 : phoneList
	
	List<PhoneDTO> findAll2() {
		return phoneList;
	}
	

}
