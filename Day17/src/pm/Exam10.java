package pm;

public class Exam10 {
	
	/*
	 * 
	class A{}
	class B extends A{}
	
	
	
	A a1 = new A();
	A a2 = new B(); //�ڽ� Ŭ������ �θ� Ŭ������ �θ� �� ��ĳ�����̶�� �Ѵ�.
	
	�ڽ� Ŭ������ ��ü�� �θ� Ŭ���� Ÿ������ ���� - ��ĳ����
			 
		 class A{}
		 class B extends A{}
		 class C extends B{}
		 class D extends B{}
		 
		 A a1 = new B();
		 A a1 = new C(); //ok
		 A a1 = new D(); //ok
		 A a1 = new E(); //No
		 
		 B b1 = new C();
		 B b2 = new D();
		 
		 //false
		 B b1 = new A();
		 C c2 = new B();
		 C c3 = new A();
		 C c4 = new D();
		 
		 D d1 = new A();
		 D d2 = new B();
		 D d3 = new C();
		 
		 class A{}
		 class B extends A{}
		 class C extends B{}
		 
		 B b1 = new B();
		 A a1 = b1; //(A) b1;
		 
		 C c2 = new C();
		 B b2 = c2; //(B) c2;
		 A a2 = c2; //(A) c2;
		 
		 A a1 = new A();
		 B b1 = a1; // ���� �߻�
		 
		 A a2 = new B();
		 B b2 = (B)a2; //����
		 C c2 = (C)a2; //�ַ��߻�

		 ���� Ÿ������ ����� �ִ������� ������ � �����ڷ� �����ƴ����� �߿��ϴ�.
		 C()�� ������� A �� B�� ��� ĳ���ä��Ҽ� �ֵ�.
		 
		 
	
	*/
	
}
