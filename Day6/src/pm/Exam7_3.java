package pm;

public class Exam7_3 {

	public static void main(String[] args) {
		// ��������� this�� �ٿ����ϴ� ����

		X x = new X();
		x.init(2, 3);;
		System.out.println(x.m);
		System.out.println(x.n);
		
		Y y = new Y();
		y.init(2, 3);;
		System.out.println(y.m);
		System.out.println(y.n);
		
		
		
	}

}


class X{
	int m;
	int n;
	void init(int m,int n) {
		m = m;
		n = n;
	}
}
class Y{
	int m;
	int n;
	void init(int m,int n) { 
		this.m = m;	
		this.n = n;
	}
}