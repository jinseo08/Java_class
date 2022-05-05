package day33_20220503_3;

import java.util.*;

public class MemberRepository {

	static Map<Long, MemberDTO> memberMap = new HashMap<>();
	Long id = 0L;

	// 회원가입
	public void save(MemberDTO member) {
		memberMap.put(member.getId(), member);
	}

	// 로그인
	public MemberDTO login(String memberId, String memberPassword) {
		MemberDTO member = null;
		for(Long m : memberMap.keySet()) {
			if(memberId.equals(memberMap.get(m).getMemberId()) && 
					memberPassword.equals(memberMap.get(m).getMemberPassword())) {
				member = memberMap.get(m);
			}
		}
		return member;
	}

	
	// 회원목록
	public Map<Long, MemberDTO> findAll() {
		return memberMap;
	}

	
	// 상세조회
	public MemberDTO findById(Long findid) {
		MemberDTO member = null;
		for(Long m : memberMap.keySet()) {
			if(findid.equals(memberMap.get(m).getId())) {
				member = memberMap.get(m);
			}
		}
		return member;
	}
	
	

	// 회원정보 수정
	public MemberDTO update(MemberDTO member) {
		return member;
	}

	
	// 회원삭제
	public void delete(Long deleteid) {
		for(Long m : memberMap.keySet()) {
			if(deleteid.equals(memberMap.get(m).getId())) {
				memberMap.remove(m);
			}
		}
	}

	

	

}
