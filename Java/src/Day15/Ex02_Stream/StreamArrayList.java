package Day15.Ex02_Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {

	String name;
	int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class StreamArrayList {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("김조은", 20));
		personList.add(new Person("2조은", 19));
		personList.add(new Person("3조은", 24));
		personList.add(new Person("4조은", 33));
		personList.add(new Person("조은", 20));
		personList.add(new Person("김조", 20));

		// map - 매핑
		// : 스트림 요소를 사용하려는 형태로 변환하는 연산
		// * 이름(name)만 추출(매핑)하여 반복
		personList.stream()
				  .map((person) -> { return person.getName();})
				  .forEach(name -> System.out.println(name));
				  ;
		System.out.println();
		
		// 나이만 추출하여 반복
		personList.stream()
		  		  .map((person) -> { return person.getAge();})
		  		  .forEach(age -> System.out.println(age));
				  ;
		System.out.println();
		// filter - 필터
		// : 스트림 요소에서 조건에 맞는 요소만 선택하는 연산
		// * 나이가 25살 초과인 사람들만 필터링하여 반복
		personList.stream()
				  .filter(p->p.getAge() > 25)
				  .forEach(p -> System.out.println(p));
		
		
		// * 이름이 3글자 이상인 사람들만 필터링하여 반복
		personList.stream()
				  .filter(p->p.getName().length() > 3)
				  .forEach(p -> System.out.println(p));
		
		
		// sorted - 정렬
		// : 스트림 요소에서 지정한 정렬 기준에 따라 요소들을 오름차순/내림차순으로 정렬하는 연산
		
		// * 이름순 - 오름차순
		personList.stream()
				  .sorted(Comparator.comparing(p->p.getName()))
				  .forEach(p -> System.out.println(p));
				  ;
				  
				  
		// * 나이순 - 오름차순
		personList.stream()
				  .sorted(Comparator.comparing(p->p.getAge()))
				  .forEach(p -> System.out.println(p));
				;

		
		// * 이름순 - 내림차순
		personList.stream()
				.sorted(Comparator.comparing(Person::getName).reversed())
				.forEach(p -> System.out.println(p));
		System.out.println();;
				
				
		// * 나이순 - 내림차순
		personList.stream()
				.sorted(Comparator.comparing(Person::getAge).reversed())
				.forEach(p -> System.out.println(p));
		System.out.println();;
				
		// * 이름이 3글자인 사람들의 수
		long count = personList.stream()
							   .filter(p->p.getName().length()>=3)
							   .count();
		System.out.println("이름이 3글자인 사람들의 수 : " + count);
		
		
		// * 이름이 2글자인 사람들의 나이의 합계		
		long sum = personList.stream()
							 .filter(p->p.getName().length()==2)
							 .mapToInt(p->p.getAge())
							 .sum();
		System.out.println("이름이 2글자인 사람들의 나이의 합계 : " + sum);
		
	}
}
