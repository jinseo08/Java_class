package day30_20220428;

import java.util.*;

import day29_20220427_2.HumanDTO;

public class MemberRepository {

	static List<MemberDTO> memberList = new ArrayList<>();
	
	// 1.회원가입
	boolean save(MemberDTO member) {
		// boolean result = false;
		// result = memberList.add(member)
		// return result;
		// 아래 한 줄은 위 세줄을 줄인거랑 같은 결과
		return memberList.add(member);
	}
	
	// 2. 로그인
	public MemberDTO login(String memberId, String memberPassword) {
		MemberDTO member = null;
		for (int i = 0; i < memberList.size(); i++) {
			if(memberId.equals(memberList.get(i).getMemberId())&& memberPassword.equals(memberList.get(i).getMemberPassword())){
				member = memberList.get(i);				
				}
			}
		return member;
	}
	 
	

	// 3.회원목록
	public List<MemberDTO> findAll() {
		return memberList;
	}
	
	// 4. 상세조회
	public MemberDTO findById(Long id) {
		MemberDTO member = null;
		for (int i = 0; i < memberList.size(); i++) {
			if(id.equals(memberList.get(i).getId())) {
				member = memberList.get(i);
			}
		}
		return member;
	}

	//5. 회원정보 수정
	public MemberDTO update(MemberDTO member) {
		return member;
	}
	
	// 6.회원삭제
	void delete(Long id) {
		for (int i = 0; i < memberList.size(); i++) {
			if(id.equals(memberList.get(i).getId())) {
				memberList.remove(i);
			}
		}
	}
}
