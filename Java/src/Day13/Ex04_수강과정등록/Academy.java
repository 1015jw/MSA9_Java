package Day13.Ex04_수강과정등록;

import java.util.ArrayList;
import java.util.List;

public class Academy {

	public static void main(String[] args) {
		
		// 일반인 과정 생성
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("김조은"));
		personList.add(new Person("박조은"));
		personList.add(new Person("이조은"));
		personList.add(new Person("황조은"));
		personList.add(new Person("권조은"));
		Course<Person> personCourse =  new Course<Person>("일반인과정", null);
		personCourse.printStudentList(personCourse);
		
		// 직장인 과정
		List<Worker> workerList = new ArrayList<Worker>();
		workerList.add(new Worker("안기욱"));
		workerList.add(new Worker("김부장"));
		workerList.add(new Worker("장그래"));
		Course<? super Worker> workerCourse = new Course<>(workerList);
		Course<?> createdWorkerCourse = workerCourse.createWorkerCourse("직장인과정", workerCourse);
		Course<?> createdWorkerCourse2 = workerCourse.createWorkerCourse("직장인과정2", personCourse);
		
		workerCourse.printStudentList(createdWorkerCourse);
		workerCourse.printStudentList(createdWorkerCourse2);
		
		// 학생 과정
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("김학생"));
		studentList.add(new HighStudent("이고딩"));
		studentList.add(new MiddleStudent("장중딩"));
		// studentList.add(new Person("김조은"));
		// studentList.add(new Worker("안기욱"));
		Course<? extends Student> studentCourse = new Course("학생과정", studentList);
		studentCourse.createStudentCourse("학생과정", studentCourse);
		// studentCourse.createStudentCourse("직장인과정", workerCourse);
		// studentCourse.createCourse("일반인과정", personCourse);
		
		List<MiddleStudent> middleStudentList = new ArrayList<MiddleStudent>();
		middleStudentList.add(new MiddleStudent("이중딩"));
		Course<MiddleStudent> middleStudentCourse = new Course(middleStudentList);
		middleStudentCourse.createStudentCourse("학생과정", middleStudentCourse);
		
		studentCourse.printStudentList(studentCourse);
		studentCourse.printStudentList(middleStudentCourse);
		
	}
	
}
