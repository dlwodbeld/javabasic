package pm;

public class Exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 클래스의 상속과 다형성
		 
		 상속을 이해하는 것은 객체지향 프로그래밍의 핵심이다.
		 
		 상속은 부모 클래스의 맴버를 자식 클래스의 내부에 포함시키는 자바의 문법 요소이다.
		 
		 상속의 장점은 코드의 불필요한 중복을 제거할 수 있다. 즉  자식들의 공통적인 성분을 뽑아서(추상화)
		 부모 클래스에 한번만 정의하면 코드가 아주 간견해지는 결과를 볼수 있다.
		 두번째 장점은 대학생은 대학생이다. 대학생은 사람이다. 사람은 대학생이다.(맞을수도있고 아닐수도있다)
		 이렇게 1개의 객체를 여러가지 모양으로 표현할 수 있는 특성을 다형성 polymorphism이라고 한다.
		 
		 자바에서는 다중상속을 허용하지않는다. ( 단,다중구현은 허용한다.)
		 
		 class GrandFa{}
		 class Father extends GrandFa{}
		 class Son extends Father{}
		 
		 생성자의 상속
		 클래스가 상속을 받으면 부모클래스의 모든 맴버를 내려 받는다고 했지만 이 멤버는 필드메서드
		 이너클래스를 말하게 된다. 즉 생성자는 자식 클래스로 상속되지 않는다.
		 다시 강조하면 절대 상속돼서는 안된다.
		 
		 class A{
		 A(){
		 }
		 }
		 
		 class B extends A{
		 // A() { 부모의 생성자를 그대로 내려 받았다라고 생각해보면
		 // 생성자??? 메서드??? 
		  }
		 }
		 
		 객체의 다형성...
		 
		 A a1 = new A();
		 A a2 = new A();
		 
		 자식 클래스의 객체를 부모 클래스 타입으로 선언하는 다형적 표현을 사용할 수 있다.
		 
		 class A{}
		 class B extends A{}
		 class C extends B{}
		 class D extends C{}
		 
		 A a = new A();
		 B b = new B();
		 C c = new C();
		 D d = new D();
		 
		 A a1 = new B();
		 A a2 = new C();
		 A a3 = new D();
		 
		 B b1 = new C();
		 B b2 = new D();
		 
		 동일한 상속 구조에서 객체 생성의 역방향은 모두 잘못된 코드이다.
		 B b3 = new A(); (X)
		 
		 업케스팅과 다운캐스팅
		 
		 사람 human1 = new 사람();
		 사람 human2 = new 학생();
		 
		 학생 human3 = new 사람();(X)
		 
		 		 
		 class A{}
		 class B extends A{}
		 class C extends B{}
		 class D extends C{}
		 
		 B b1 = mew B();
		 A a1 = b1;	//(A)b1;	자동 타입 변환 업캐스팅
		 
		 C c2 = new C();
		 B b2 = c2;	//(B)c2;	자동 타입 변환 업캐스팅
		 
		 A a1 = new A();
		 B b1 = a1; //예외 발생 다운캐스팅
		 
		 A a2 = new B();
		 B b2 = (B)a2; // 다운캐스팅은 떄에 따라 가능할 때도 있따.
		 C c2 = (C) a2; //에러발생
		
		 
		 메서드 오버라이딩
		 
		 
		 */
	}

}
