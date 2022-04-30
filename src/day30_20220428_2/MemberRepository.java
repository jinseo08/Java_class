package day30_20220428_2;

import java.util.*;

public class MemberRepository {
	
	//선생님 코드

	
	static List<MemberDTO> memberList = new ArrayList<>();

	public boolean save(MemberDTO newMember) {
//		boolean result = false;
//		result = memberList.add(newMember);
//		return result;

		return memberList.add(newMember);
	}

	public boolean login(String memberId, String memberPassword) {
		boolean result = false;
		for (int i = 0; i < memberList.size(); i++) {
			if(memberId.equals(memberList.get(i).getMemberId()) && 
					memberPassword.equals(memberList.get(i).getMemberPassword())) {
				result = true;
			} 
		}
		return result;
	}

	public List<MemberDTO> findAll() {
		return memberList;
	}

	public MemberDTO findById(Long findId) {
		MemberDTO member = null;
		for (int i = 0; i < memberList.size(); i++) {
			if(findId.equals(memberList.get(i).getId())) {
				member = memberList.get(i);
			} 
		}
		return member;
	}

	public Long loginCheck(String memberId, String memberPassword) {
		Long loginId = null;
		for (int i = 0; i < memberList.size(); i++) {
			if(memberId.equals(memberList.get(i).getMemberId()) && 
					memberPassword.equals(memberList.get(i).getMemberPassword())) {
				loginId = memberList.get(i).getId();
			} 
		}
		return loginId;
	}

	public MemberDTO update(Long loginId, String updateMobile) {
		MemberDTO member = null;
		for (int i = 0; i < memberList.size(); i++) {
			if(loginId.equals(memberList.get(i).getId())) {
				memberList.get(i).setMemberMobile(updateMobile);
				member = memberList.get(i); 
			} 
		}
		return member;
	}

	public void delete(Long deleteId) {
		for (int i = 0; i < memberList.size(); i++) {
			if(deleteId.equals(memberList.get(i).getId())) {
				memberList.remove(i);
			} 
		}
	}

}
