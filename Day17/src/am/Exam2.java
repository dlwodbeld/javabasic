package am;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 매서드 오버로딩
		 	메서드의 이름이 동일할때 입력되는 매개변수의 개수 또는 자료형에 따라  각각 다른 매서드가 실행된다.
		 	
		 	print();
		 	print(3);
		 	print(3,4);
		 	print(3,3.14);
		 	
		 	생성자
		 		객체를 생성, 1. 반드시 클래스 명과 동일해야 한다. 2. 리턴이 없다. 리턴형도 없다.
		 		개발자가 클래스에 생성자를 만들지않으면 자동으로 컴파일시에 자바가 기본 생성자를 만들어 준다.
		 		따라서 모든 클래스에는 1개 이상의 생성자가 반드시 존재하게 된다.
		 		
		 		class A {
		 		A(){
		 		
		 		}
		 		}
		 		this()매서드 - 자신이 속한 클래스 내부의 다른 생성자를 호출
		 		생성자의 내부에서만 사용, 생성자의 첫줄에만 위치해야 한다.
		 		
		 		
		 */
		print();
		int a = twice(3);
		System.out.println(a);
		
		
	}
	public static void print() {
		System.out.println("안녕");
	}
	
	public static int twice(int a) {
		return a*2;  
	}

}

class C {
	C(){
		System.out.println("첫번째 생성자");
	}
	C(int a){
		this();
		System.out.println("두번째 생성자");
	}
//void abc(){매서드에서는 this()를 사용할 수 없다.
//	this();
//}
}

