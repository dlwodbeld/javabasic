package pm;

public class Exam4 {

	public static void main(String[] args) {
		// ��ü�� ������ Ȱ��
		/*
		 * ��ü ����
		 * Ŭ������ ��ü�� = new ������();
		 */
		
		A a = new A();
		
		a.m = 5;
		System.out.println(a.m);
		a.print();

	}

}

class A{	//Ŭ���� A����
	int m = 3;	//�ʵ尡 1�� �ִ�. �ʵ尪�� 3���� �ʱ�ȭ�Ǿ��ִ�.
	void print() {	//print() �޼��� �Ѱ���
		System.out.println("��ü ����");
	}
}

/*
 * �ʵ� field : Ŭ������ ���Ե� ����, ��ü�� �Ӽ����� �����Ҽ��ִ�.
 * �ǵ�� ���������ʹ� �ٸ���. ���������� '�޼��忡 ���Ե� ����'
 * �� �ʵ�� ���������� �����ؾ��Ѵ�. Ŭ������ �߰�ȣ ���� ����� ������ '�ʵ�'
 * �޼����� �߰�ȣ �ȿ� ����� ������ '��������' ��� �����ϸ�ȴ�.
 * �ʵ�� ���������� �Ǵٸ� �������� �ʱⰪ�̴�. �ʵ��� ���� �ʱ�ȭ�����ʾƵ�
 * ������ �ʱ�ȭ�ȴ�. �ݸ�, ���������� ����  �ʱ�ȭ���������� ���� ������ �״�� �־
 * �׳� �ߎ��ϸ� ������ �߻��Ѵ�.
 * 
 */
