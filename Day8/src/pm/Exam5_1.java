package pm;

public class Exam5_1 {

	public static void main(String[] args) {
		// �޼��� �������̵� method overriding
		//�޼��� �����
		/*
		 * �θ� Ŭ�������� ��ӹ��� �ż���� ������ �̸��� �ż��带 ������ �ϴ°�
		 * 1.�θ� Ŭ������ �ż���� Ÿ�԰� ������ �����ؾ��Ѵ�.
		 * 2.�θ� Ŭ������ �ż��庸�� ���� �������� ������ ���ų� �о���Ѵ�.
		 * 
		 * class A{
	void print() {
		System.out.println("AŬ����");
	}
}
class B{
	void print() {
		System.out.println("BŬ����");
	}
}

		 * �������̵��� ������� ǥ���� ������ ��� ���̰��ִ�.
		 * ������ ���� ������ ������ �����ǰ� ���ο� �������� �ٲ�� ����������
		 * �������̵��� ���� print() �ż��� ���� ���ο� �ż��尡 �ö�Ÿ�� �����̴�.
		 * ����� �θ��� print() �ż��带 ������ ȣ���Ҽ��� �ִ�.
		 * 
		 * class Animal{
		 * void crt(){}
		 * }
		 * 
		 * 
		 * class Bird extends Animal{
		 * void cry(){}
		 * }
		 * 
		 * class Bird extends Animal{
		 * void cry();
		 * System.out.println("±±");
		 * }
		 * }
		 * class Cat extends Animal{
		 * void cry();
		 * System.out.println("�߿�");
		 * }
		 * }
		 * class Dog extends Animal{
		 * void cry();
		 * System.out.println("�۸�");
		 * }
		 * }
		 * 
		 * Bird bird = new Bird();
		 * Cat cat = new Cat();
		 * Dog dog = new Dog();
		 * 
		 * bird.cry(); //��±
		 * cat.cry(); //�߿�
		 * dog.cry(); //�۸�
		 * 
		 * ��� ��ü�� �θ�Ÿ�� �Ѱ����� �����ϸ� �迭�� �ѹ��� ������ �� �ִ� ������ �ִ�.
		 * Animal[] animals = new Animal[] {bird,cat,dog};
		 * 
		 * 
		 * 
		 * 
		 */
		
		Q q = new Q();//Q �ڷ��� / Q ������
		q.print();
		
		W w = new W();//W �ڷ��� /W ������
		w.print();
		
		Q qw = new W();//Q �ڷ��� / W ������
		qw.print();
		
		
		
	}

}
class Q{
	void print() {
		System.out.println("QŬ����");
	}
}
class W extends Q{
	void print() {
		System.out.println("WŬ����");
	}
}