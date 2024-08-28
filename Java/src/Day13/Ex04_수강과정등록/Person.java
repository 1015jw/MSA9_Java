package Day13.Ex04_수강과정등록;

public class Person {

	private String name;

	public Person() {
		this("이름없음");
	}
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	
	//생성자
	// 겟 셋
	// 투스트링
	
}
