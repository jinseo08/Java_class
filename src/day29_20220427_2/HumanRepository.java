package day29_20220427_2;

import java.util.*;

public class HumanRepository {

	static List<HumanDTO> humanList = new ArrayList<>();
	
	void save(HumanDTO human) {
		humanList.add(human);
	}
	
	List<HumanDTO> findAll(){
		return humanList;
	}
	
	HumanDTO findById(Long id){
		// 한명의 정보를 찾아야 하기 때문에 리턴할 때 HumanDTO 객체가 필요.
		HumanDTO human = new HumanDTO();
		
		for(int i = 0; i < humanList.size();i++) {
			if(id.equals(humanList.get(i).getId())) {
				human = humanList.get(i);
			}
		}
		return human;
	}
	
	
	
	List<HumanDTO> delete(Long id) {
		for(int i = 0; i < humanList.size(); i++) {
			if(id.equals(humanList.get(i).getId())){
				humanList.remove(i);
			}
		}
		return humanList;
	}	
	
	
}
