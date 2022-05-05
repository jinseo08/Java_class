package day33_20220503_3;

import java.util.*;

public class Temp {

	public static void main(String[] args) {
		Map<Long, String> testMap = new HashMap<>();
		
		// 기존에 key가 존재하지 않았으면 null이 리턴되는게 정상
		System.out.println(testMap.put(1L,"안녕"));
		System.out.println(testMap.put(2L,"안녕"));
		// 이미 있는 key에 값을 넣으면 전에 있던 값이 나옴
		System.out.println(testMap.put(1L,"안녕하세요"));

	}

}
