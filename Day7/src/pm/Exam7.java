package pm;
import am.A;
public class Exam7 {
	// ���� ������(������) modifier �� Ŭ����, �ʵ�,�޼��� ,�����ڵ��
	//� Ư¡�� �ο��ϴ� ���� ����̴�.������ ������ ������ �� �ִ�. 
	/*
	 * ��� ������ �����ϴ� ������ �Ѵ�.
	 * 
	 * public >	protected >	default(�ƹ� ǥ�ð� ������)	>	private
	 * 
	 * public : ���� ��Ű�� ���� ��� Ŭ���� + �ٸ� ��Ű���� ��� Ŭ�������� ���� ����
	 * protected : ���� ��Ű�� ���� ��� Ŭ���� + �ٸ� ��Ű���� �ڽ� Ŭ�������� ���� ����
	 * default : ���� ��Ű�� ���� ��� Ŭ����
	 * private : ���� Ŭ���������� ��� ����
	 * 
	 * 
	 */
//		public int a = 1;
//		protected int b = 2;
//		int c = 3;//default
//		private int d = 4;
////	void abc() {	//default
////		System.out.println(a + " " + b + " " + c + " " + d);
////	}
//	
//	public static void main(String[] args) {
//
//		A a = new A();
//		a.print();
//	}
//
//}
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		System.out.println();
		a.print();
	}
}
