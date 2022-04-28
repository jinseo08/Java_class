package day30_20220428;

import java.util.*;

public class MemberRepository {

	static List<MemberDTO> memberList = new ArrayList<>();

	
	// 1.회원가입
	void save(String memberId, String memberPassword, String memberName, int memberAge, String memberMobile) {
		Long id = 1L;
		id = id++;
		MemberDTO member = new MemberDTO(id, memberId, memberPassword, memberName, memberAge, memberMobile);
		memberList.add(member);
	}

	/*
	public MemberDTO login(String memberId, String memberPassword) {
		MemberDTO login = new MemberDTO(memberId,memberPassword);
		for (int i = 0; i < memberList.size(); i++) {
			if (memberId.equals(memberList.get(i).getMemberId()) && memberId.equals(memberList.get(i).getMemberPassword())) {
				login = memberList.get(i);
			}
		}return login;
}
*/
	// 2. 로그인
	public MemberDTO login(String memberId, String memberPassword) {
		MemberDTO login = null;
		for (int i = 0; i < memberList.size(); i++) {
			if(memberId.equals(memberList.get(i).getMemberId())&& memberId.equals(memberList.get(i).getMemberPassword())){
						login = memberList.get(i);				
				}
			}
		return login;
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

	





}
