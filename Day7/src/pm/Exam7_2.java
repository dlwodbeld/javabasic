package pm;

public class Exam7_2 {

	public static void main(String[] args) {
		// static 제어자.
		/*
		 * static 은 필드, 메서드 ,이너클래스에 사영되는 제어자이다. 
		 * 지금까지는 클래스의 멤버를 다른 클래스에서 사용하기 위해서는 먼저 객체를 먼저 객체를 생성하고 사용해왔다.
		 * 객체로 사용할 수 있는 상태가 되는 맴버를 인스턴스 맴버 instance member라고한다.
		 * 다시 말하면 인스턴스 멤버는 멤버 앞에 static 붙지 않는 것을 말한다.
		 * 반면 static 이 붙은맴버들은 정적 맴버 static member 라고 부른다.
		 * 
		 * 정적 맴버의 가장 큰 특징은 객체 생성 없이 '클래스명.정적맴버명' 만으로 접근 가능하다.
		 * 정적 맴버도 객체 생성후에도 객체를 통해서 사용할수있다.
		 * 
		 * 반드시 기억해야 할 static 의 특징은 'static 은 객체슫ㄹ의 간의 공유 변수의 성질을 가진다.'
		 * 정적 필드는 클래스 변수라고도 부른다.
		 */
		Q q1 = new Q();
		Q q2 = new Q();
		q1.m = 5;
		q2.m = 6;
		
		System.out.println(q1.m);
		System.out.println(q1.n);
		System.out.println(q2.m);
		System.out.println(q2.n);
		q1.n = 7;
		q2.n = 8;
		Q.n = 9;
		System.out.println();
		
		System.out.println(Q.n);//static 만 객체없이 접근 가능.
		System.out.println(q1.n);//static 만 객체없이 접근 가능.
		System.out.println(q2.n);//static 만 객체없이 접근 가능.

	}

}

class Q{
	int m = 3;
	static int n = 5; //정적 필드
	
}