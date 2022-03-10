package pm;

public class Exam7 {

	public static void main(String[] args) {
		// 생성자 constructor
		//객체를 최초 생성할때 자동으로 호출되어 실행된다.
		//1.생성자는 반드시 클래스 명과 동일한 이름이어야만 한다.
		//2.생성자는 리턴타입도 없고 리턴도 없다.
		
		//지금까지 생성자를 만드리 않았다. 생성자를 만들지 않았어도 정상적으로
		//객체가 생성됐다. 이유는 개발자가 생성자를 직접 만들지 않으면
		//자바가 기본 생성자 default constructor 를 자동으로 생성해주기 때문이다.
		//생성자가 하나라도 있으면 자바는 기본생성자를 추가로 만들지는 않는다.
		
		
		
//		A a = new A();
//		B b = new B();
		H h = new H();
		I i = new I();
		J j = new J(3);	//애러발생, why! 생성자에 int 하나를 넣게 되어있다.
		
		
//		a.work();
//		b.work();
		h.work();
		i.work();
		j.work();
		

	}

}

//class A{
//	int m;
//	void work() {
//		System.out.println(m);
//	}
//}
//class B{
//	int m;
//	void work() {
//		System.out.println(m);
//	}
//}
class H{
//	H(){	//개발자가 직접 생성자를 만들지 않으면 자바가 자동으로 기본생성자를 만든다.
//		
//	}
	int m;
	void work() {
		System.out.println(m);
	}
}
class I{
	I(){
		//아무런 기능이 없는 디폴트 생성자 default constructor
	}
	int m;
	void work() {
		System.out.println(m);
	}
}

class J{
	J(int a){
		m = a;
		
	}
	
	int m;
	void work() {
		System.out.println(m);
	}
}

