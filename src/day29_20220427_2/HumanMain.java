package day29_20220427_2;

public class HumanMain {

	public static void main(String[] args) {
		// HumanRepository의 humanList에 새로운 객체를 저장해봅시다.
		
		HumanDTO human1 = new HumanDTO(1L,"가나다",10);
		
		HumanService humanService = new HumanService();
		humanService.save(human1);
		
		HumanDTO human2 = new HumanDTO(2L,"라마바",20);
		HumanDTO human3 = new HumanDTO(3L,"사아자",30);
		humanService.save(human2);
		humanService.save(human3);
		
		// 출력
		humanService.findAll();
		
		
		// id가 1인 사람만 조회 - 조회한 데이터는 Service에서 출력
		humanService.findById(1L);
		humanService.findById(4L);
		
		//id가 1인 사람 삭제
		//삭제 후 리스트를 가져와서 Service에서 출력
		humanService.delete(1L);
		humanService.delete2(2L);
		
		// id가 3인 사람의 이름을 자바왕으로 바꾸자.
		humanService.update(3L,"자바왕");
		
		
	}

}
