package pm;

public class Exam7_2 {

	public static void main(String[] args) {
		// static ������.
		/*
		 * static �� �ʵ�, �޼��� ,�̳�Ŭ������ �翵�Ǵ� �������̴�. 
		 * ���ݱ����� Ŭ������ ����� �ٸ� Ŭ�������� ����ϱ� ���ؼ��� ���� ��ü�� ���� ��ü�� �����ϰ� ����ؿԴ�.
		 * ��ü�� ����� �� �ִ� ���°� �Ǵ� �ɹ��� �ν��Ͻ� �ɹ� instance member����Ѵ�.
		 * �ٽ� ���ϸ� �ν��Ͻ� ����� ��� �տ� static ���� �ʴ� ���� ���Ѵ�.
		 * �ݸ� static �� �����ɹ����� ���� �ɹ� static member ��� �θ���.
		 * 
		 * ���� �ɹ��� ���� ū Ư¡�� ��ü ���� ���� 'Ŭ������.�����ɹ���' ������ ���� �����ϴ�.
		 * ���� �ɹ��� ��ü �����Ŀ��� ��ü�� ���ؼ� ����Ҽ��ִ�.
		 * 
		 * �ݵ�� ����ؾ� �� static �� Ư¡�� 'static �� ��ü������ ���� ���� ������ ������ ������.'
		 * ���� �ʵ�� Ŭ���� ������� �θ���.
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
		
		System.out.println(Q.n);//static �� ��ü���� ���� ����.
		System.out.println(q1.n);//static �� ��ü���� ���� ����.
		System.out.println(q2.n);//static �� ��ü���� ���� ����.

	}

}

class Q{
	int m = 3;
	static int n = 5; //���� �ʵ�
	
}