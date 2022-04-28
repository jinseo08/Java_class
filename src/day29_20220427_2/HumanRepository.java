package day29_20220427_2;

import java.util.*;

public class HumanRepository {

	static List<HumanDTO> humanList = new ArrayList<>();

	void save(HumanDTO human) {
		humanList.add(human);
	}

	List<HumanDTO> findAll() {
		return humanList;
	}

	HumanDTO findById(Long id) {
		// 한명의 정보를 찾아야 하기 때문에 리턴할 때 HumanDTO 객체가 필요.
		// HumanDTO human = new HumanDTO();
		// 위 코드는 id=null,name=null,age=0이라는 객체는 만드는것
		HumanDTO human = null;
		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				human = humanList.get(i);
			}
		}
		return human;
	}

	// 지우고 리스트를 리턴 해주는 것
	List<HumanDTO> delete(Long id) {
		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				humanList.remove(i);
			}
		}
		return humanList;
	}

	// 지우기만 하고 넘겨주는 것
	void delete2(Long id) {
		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				humanList.remove(i);
			}
		}
	}


	HumanDTO update(Long id, String name) {
		HumanDTO human = new HumanDTO();
		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				// 원하는 id가 있는 객체에 접근 = humanList.get(i)
				humanList.get(i).setName(name);
				human = humanList.get(i);
			}
		}
		return human;
	}

}
