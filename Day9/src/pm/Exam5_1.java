package pm;

public class Exam5_1 {

	public static void main(String[] args) {
		// abstract �߻�- ��ü������ �ʴ�.
		//abstract method -�߰�ȣ�� ���� �ż���, �ż����� ����� ���ǵ����ʴ´�. �׳� ; ������.
		//abstract ����Ÿ�� �ż����();
		// abstract class
		
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry();
		animal2.cry();

	}

}
abstract class Animal{
	abstract void cry();
}
class Cat extends Animal{
	void cry() {
		System.out.println("�߿�");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("�۸�");
	}
}
