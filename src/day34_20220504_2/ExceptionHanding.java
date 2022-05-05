package day34_20220504_2;

import java.util.*;

public class ExceptionHanding {

	public static void main(String[] args) {
		try {
		List<String> list = new ArrayList<>();
		list.add("안녕");
		list.add("하이");
		for (int i = 0; i <= list.size(); i++) {
			System.out.println(list.get(i));
		}
		} catch(java.lang.IndexOutOfBoundsException e) {
			System.out.println("java.lang.IndexOutOfBoundsException 예외 발생!!!");
			e.printStackTrace(); //Exception 메세지 출력
		} catch(Exception e) {
			System.out.println("Exception 예외 발생!!!");
		}
		finally {
			System.out.println("여기는 예외 발생하든 안하든 실행");
		}
		System.out.println("리스트 출력 끝");
	}

}
