package day29_20220427_2;

import java.util.List;

public class HumanService {
	
	HumanRepository hr = new HumanRepository();

	void save(HumanDTO human) {
		hr.save(human);
	}
	
	void findAll() {
		List<HumanDTO> humanList = hr.findAll();
		for(HumanDTO h : humanList) {
			System.out.println(h);
		}
	}
	
	void findById(Long id) {
		// Repository로 부터 id가 1L인 HumanDTO 객체를 가져옴.
		HumanDTO human = hr.findById(id);
		System.out.println("id가 1인 사람만 출력");
		System.out.println(human);
	}
	
	void delete(Long id) {
		List<HumanDTO> humanList = hr.delete(id);
		System.out.println("id1 삭제 후 출력");
		for(HumanDTO h : humanList) {
			System.out.println(h);
		}
	}
	
	
}
