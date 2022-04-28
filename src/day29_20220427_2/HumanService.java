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
		if(human == null) {
			System.out.println("조회결과가 없습니다.");
		} else {
		System.out.println("id가 1인 사람만 출력");
		System.out.println(human);
		}
	}
	
	// 리턴 값 출력 
	void delete(Long id) {
		List<HumanDTO> humanList = hr.delete(id);
		System.out.println("id" + id + "삭제 후 출력");
		for(HumanDTO h : humanList) {
			System.out.println(h);
		}
	}
	
	// 지우고 findAll 호출
	void delete2(Long id) {
		hr.delete2(id);
		System.out.println("id" + id +"삭제 후 출력");
		this.findAll();
	}
	
	
	void update(Long id, String name) {
		HumanDTO human = hr.update(id,name);
		System.out.println("이름 수정 후 출력");
		System.out.println(human);
	}
	
}
