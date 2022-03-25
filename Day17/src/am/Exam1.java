package am;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 클래스와 객체
 자바는 객체지향언어로 객체지향요소들 클래스, 추상 클래스, 인터페이스와 같은 객체지향적 문법 요소들을 사용하여 프로그램을 구성한다.
 클래스 - 사용할 수 있는 실체인 객체를 만들기 위한 설계도 -붕어빵 기계
 객체 - 클래스로 생성한 실체 					-붕어빵
 
 클래스의 구성요소 - 외부 구성요소 - 패키지,임포트,외부클래스
 			- 내부 구성요소 - 필드, 메서드, 생성자, 이너클래스
						(클래스 맴버 : 필드 메서드 이너클래스)

클래스로 객체를 생성하는 방법

A a = new A();
A b = new A();
A c = new A();

1개의 클래스로 ㅏㄴ든 모든 객체는 속성(개성,성격)이 다르다. 하지만 기능은 동일하다.

 필드 - 클래스에 포함된 변수
 		필드는 지역변수와는 구분되어야한다. 지역변수는 매서드 안에 포함된 변수
 	필드와 지역변수와의 또다른 차이점은 초기값이다. 반면에 지역변수는 직접 초기화 하지 않으면 저장공간이 빈공간 그대로있어
 	값을 출력할때 오류가 발생한다.
 class A{
 int m;		//필드
 void work1(){
 int k;		//지역변수
 System.out.println(k);
 }
 }
 	
 A a = new A();
 System.out.println(a.m);
 a.work1();
 
매서드
 	메서드는 클래스의 기능에 해당하는 요소로 클래스 밖에서는 함수라고 부르고 클래스 안에서는 매서드라고 부른다.
 	메서드는 동작을 정의한다.	예를들면 공부하기 춞추기 달리기 정지하기
 	
 	
클래스 내부에서도 매서드 호출
 	클래스의 내부에 있는매서드끼리는 객체를 생성하지않고 서로를 호출하여 사옹할 수 있다.
 	단, 매서드앞에 static이 붙은 메서드는 static 뿥은 메서드만 호출할 수 있다.
 	
 
 	
 	
 
 */
		A a = new A();
		System.out.println(a.m);
		a.print();
		
		B b = new B();
		System.out.println(b.m);
		b.work1();
		
		
	}

}


class A{
	int m = 3;
	void print() {
		System.out.println("객체 생성 및 활용");
	}
	
}
class B{
	int m;
	void work1() {
		int k;
//		System.out.println(k);
	}
}



