package pm;

public class Exam4_1 {

	public static void main(String[] args) {
		// ��ü�� ������ ǥ��
		Human h = new Human();
		h.name = "ȫ�浿";
		h.age = 13;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name="������";
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