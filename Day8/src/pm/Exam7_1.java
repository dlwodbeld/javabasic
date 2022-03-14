package pm;

public class Exam7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 부모 클래스에 init() 매서드가 있고 그 매서드에 500줄의 코드가 있따.
		 그런데 자식 클래스는 그 부모 클래스의 기능에다가 어떤 1줄만 추가하고싶을때
		 super가 없다면 자식 클래스에는 부모 클래스의 매서드에 있는 500줄과 1줄을 모두 작성해야한다.
		 그런데 super를 사용하면 자식 클래스의 매서드에서 부모 클래스의 매서드를 호출하고 추가코드 1줄만 작성하면 된다.
		 
		 */

	}

}
class U{
	void init() {
		//어쩌구저쩌구 500줄
	}
}

class I extends U{
	void init() {
	//class U에있는 500줄정도 되는 코드를 그대로 사용 가능
	//화면 출력 매서드
}
}

class K extends U{
	void init() {
		super.init();
		//화면 출력 메서드
	}
}




