package pm;

public class Exam7_2 {

	public static void main(String[] args) {
		// this Ű���� (���̽� self)
		// ��� �޼��忡�� �ڽ��� ���Ե� Ŭ������ ��ü�� ����Ű�� this �� �ִ�.
		//this �� ������ �����ϴ�. ���������� ���ȴ�.
		//this. �����ص� �׻� �ڹ� �ڵ����� �߰����ֹǷ� ���� �Ű� ���ʿ䰡 ����̱⵵�Ѵ�.
		// ������ this.��������� �� ���� �ٿ���� �� ���� �ִ�.
		Z z = new Z();
		z.work();
		System.out.println(z.m);
		System.out.println(z.n);

	}

}

class Z{
	int m;
	int n;
	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a;	//this Ű���带 �����ϸ� �ڵ����� �߰�.
		this.n = b;//this Ű���带 �����ϸ� �ڵ����� �߰�.
		
	}
	void work() {
		this.init(2,3);//this Ű���带 �����ϸ� �ڵ����� �߰�.
	}
}
