package am;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 �ż��� �����ε�
		 	�޼����� �̸��� �����Ҷ� �ԷµǴ� �Ű������� ���� �Ǵ� �ڷ����� ����  ���� �ٸ� �ż��尡 ����ȴ�.
		 	
		 	print();
		 	print(3);
		 	print(3,4);
		 	print(3,3.14);
		 	
		 	������
		 		��ü�� ����, 1. �ݵ�� Ŭ���� ��� �����ؾ� �Ѵ�. 2. ������ ����. �������� ����.
		 		�����ڰ� Ŭ������ �����ڸ� ������������ �ڵ����� �����Ͻÿ� �ڹٰ� �⺻ �����ڸ� ����� �ش�.
		 		���� ��� Ŭ�������� 1�� �̻��� �����ڰ� �ݵ�� �����ϰ� �ȴ�.
		 		
		 		class A {
		 		A(){
		 		
		 		}
		 		}
		 		this()�ż��� - �ڽ��� ���� Ŭ���� ������ �ٸ� �����ڸ� ȣ��
		 		�������� ���ο����� ���, �������� ù�ٿ��� ��ġ�ؾ� �Ѵ�.
		 		
		 		
		 */
		print();
		int a = twice(3);
		System.out.println(a);
		
		
	}
	public static void print() {
		System.out.println("�ȳ�");
	}
	
	public static int twice(int a) {
		return a*2;  
	}

}

class C {
	C(){
		System.out.println("ù��° ������");
	}
	C(int a){
		this();
		System.out.println("�ι�° ������");
	}
//void abc(){�ż��忡���� this()�� ����� �� ����.
//	this();
//}
}

