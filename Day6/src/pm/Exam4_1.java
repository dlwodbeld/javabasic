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
		//�ڹٹ����� ���� ������ ���� �־ �ϳ��� �����ϴٺ��� ���� ����� ����
		//������ ���� �ֱ��ؾ� �� ���� �ִ�. ������ �� ���ذ� �ȵǴ���
		//�ٸ� �κ��� �����ϴ� �������� ���� ���صǴ� ���� ����.
		
	}
}