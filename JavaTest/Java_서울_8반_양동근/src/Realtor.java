
import java.util.ArrayList;
import java.util.List;

//House 상속받기
public class Realtor extends House {

	// 싱글턴 패턴을 적용하기 위해 instance 생성
	Realtor instance = new Realtor();

	// 싱글턴 패턴을 적용하기 위해 기본 생성자 private화
	private Realtor() {
	}

	// getInstcae 메서드 생성
	public Realtor getInstace() {
		return instance;
	}

	// houseList 만들기
	private List<House> houseList = new ArrayList<House>();

	//집번호(int id) 유무에 따라 boolean값을 반환하는 sale 메서드 구현
	public boolean sale(int id) {
		for (int i = 0; i < houseList.size(); i++) {
			if (id == houseList.get(i).getId())
				return true;
		}
		return false;
	}
	
	//집을 인자로 받아 목록에 추가하는 purchase구현
	public void purchase(House house) {
		houseList.add(house);
		
	}
	
	
	
	
	
}
