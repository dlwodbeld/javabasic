package pm;

public class Exam4_3 {

	public static void main(String[] args) {
		// Ŭ���� ���ο��� �ż��� ȣ���ϱ�.
		// Ŭ���� ���ο� �ִ� �ż��峢���� ��ü�� �������� �ʰ� ���� ȣ���Ҽ� �ִ�.
		//�ʵ� ���� Ŭ���� ������ ��� �ż��� �ȿ��� ��ü�� �������� �ʰ� ����Ҽ��ִ�.
		// ����, �޼��� �տ� static �� �پ����� ��츸 ȣ���� �� �ִ�.
		print();
		int a = twice(3);
		System.out.println(a);
		
		double b = sum(a,5.8);
		System.out.println(b);

	}
	
	public static void print() {
		System.out.println("�ȳ�");
	}
	public static int twice(int k) {
		return k*2;
	}
	public static double sum(int m, double n) {
		return m + n;
	}
	

}
