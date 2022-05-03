package day33_20220503_2;

import java.util.*;

public class Ex01_MapEample {

	public static void main(String[] args) {
		// key : 정수(int), value : 문자(String)
		Map<Integer, String> map1 = new HashMap<>();
		
		//저장
		map1.put(1, "안녕");
		map1.put(2, "안녕하세요");
		
		//가져오기
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		
		// key : 문자(String), value : 문자(String)
		// map2 선언하고 date를 저장해봅시다.
		Map<String, String> map2 = new HashMap<>();
		map2.put("이름", "모찌");
		map2.put("특징", "귀엽다");
		
		System.out.println(map2.get("이름"));
		System.out.println(map2.get("특징"));
		
		map2.put("이름", "바보");
		// 이미 있는 key 값에 새로운 value를 넣으면 덮어쓰기 함		
		System.out.println(map2.get("이름"));

		System.out.println("");
		// 반복문에 활용
		// key 값만 모아주는 메서드 : keyset()
		for(String s : map2.keySet()) {
			System.out.println(s); //key 값 출력
			System.out.println(map2.get(s)); //value 값 출력
		}
		
		// 삭제
		map2.remove("이름");
		
		System.out.println("");
		// StudentDTO를 만들어서 관리번호, 이름, 전화번호, 전공 필드를 만들고
		// main 메서드에서 student 객체를 담을 수 있는 sutdentMap을 선언하여
		// 두학생의 정보를 map에 저장하고 반복문으로 출력해보기
		// key 값은 관리번호를 넣기로 함
		
		Map<Long, StudentDTO> studentMap = new HashMap<>();
		StudentDTO student1 = new StudentDTO(1L,"이름1","010-1111-1111","전공1");
		StudentDTO student2 = new StudentDTO(2L,"이름2","010-2222-2222","전공2");
		
		studentMap.put(1L,student1);
		studentMap.put(2L,student2);
	
		for(Long s : studentMap.keySet()) {
			System.out.println(studentMap.get(s));
		}
		
		System.out.println("");
		// 선생님 코드
		Long id = 1L;
		String name = "이름1";
		String phone = "010-1111-1111";
		String major = "전공1";
		Map<Long, StudentDTO> studentMap2 = new HashMap<>();
		StudentDTO student = new StudentDTO(id,name,phone,major);
		studentMap2.put(id, student);
		
		id = 2L;
		name = "이름2";
		phone = "010-2222-2222";
		major = "전공2";
		student = new StudentDTO(id,name,phone,major);
		studentMap2.put(id, student);
				
		for(Long s : studentMap2.keySet()) {
			System.out.println(studentMap2.get(s));
			System.out.println(studentMap2.get(s).getName());
		}
				
		
	}
}
