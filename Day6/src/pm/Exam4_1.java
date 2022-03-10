package pm;

public class Exam4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		
		b.printFieldValue();
		b.printLocalValue();
		
		
		
		

	}

}
class B{
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	void printLocalValue() {
		int k;
		//System.out.println(k);
		//자바문법은 서로 얽히고 설켜 있어서 하나를 설명하다보면 아직 배우지 않은
		//뭔가를 먼저 애기해야 할 떄가 있다. 지금은 잘 이해가 안되더라도
		//다른 부분을 공부하는 과정에서 쉽게 이해되는 일이 많다.
		
	}
}