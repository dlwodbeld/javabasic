package pm;

public class Exam10 {
	
	/*
	 * 
	class A{}
	class B extends A{}
	
	
	
	A a1 = new A();
	A a2 = new B(); //자식 클래스를 부모 클래스로 부를 때 업캐스팅이라고 한다.
	
	자식 클래스의 객체를 부모 클래스 타입으로 선언 - 업캐스팅
			 
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
		 B b1 = a1; // 예외 발생
		 
		 A a2 = new B();
		 B b2 = (B)a2; //가능
		 C c2 = (C)a2; //애러발생

		 무슨 타입으로 선언돼 있는지보다 오히려 어떤 생성자로 생성됐는지가 중요하다.
		 C()로 만들었던 A 와 B로 모두 캐스팅ㅇ할수 있따.
		 
		 
	
	*/
	
}
