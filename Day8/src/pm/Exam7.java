package pm;

public class Exam7 {

	public static void main(String[] args) {
		// super 키워드 super() 매서드
		
		/*
		 this 키워드와 this()메서드는 클래스 내부의 특정 구성 요소(생성자, 객체)호출할 때 사용했다.
		 생략하면 자동으로 추가해 주기도 했다.
		 
		 이와달리 super 는 모두 부모 클래스와 관련있다. 따라서 상속관계에서만 사용을 하게 된다.
		 
		 
		 */
		
//		J j = new J();
//		j.bcd();
		
		H j = new J();
		j.abc();

	}

}

class H{
	void abc() {
		System.out.println("H클래스의 abc()");
	}
}

class J extends H{
	void abc() {
		System.out.println("J클래스의 abc()");
	}
	void bcd() {
		//abc();
		super.abc();
	}
}

