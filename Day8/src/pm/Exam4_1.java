package pm;

public class Exam4_1 {

	public static void main(String[] args) {
		// °´Ã¼ÀÇ ´ÙÇüÀû Ç¥Çö
		Human h = new Human();
		h.name = "È«±æµ¿";
		h.age = 13;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name="¼ºÃáÇâ";
		s.age = 16;
		s.studentID = 321516;
		s.eat();
		s.sleep();
		s.goToSchool();

	}

}
class Human{
	String name;
	int age;
	void eat() {}
	void sleep() {}
	
}

class Student extends Human{
	int studentID;
	void goToSchool() {}
}

class Worker extends Human{
	int workerID;
	void goToWork() {}
}