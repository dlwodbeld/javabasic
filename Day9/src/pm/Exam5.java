package pm;

public class Exam5 {

	public static void main(String[] args) {
		// final �ż���� final class
		
		/*
		 final ������ ������ ����� ���� �������� �ǹ̸� ������ó�� final �ż���� finalŬ������
		 ���� ���� �ż��� ���� Ŭ������ �ǹ̸� ������.
		 ���� �ż����� �ǹ̴�...����Ҷ� �θ��� �ż��带 �������̵��ϸ� �ڽ� Ŭ����������
		 �޼����� ����� ����ȴ�.
		 �ż����� ����� ����ȴ�. final �ż����� ����� ������ �� ���� �ż���
		 ��, �ż��带 final �����ϸ� �ڽ� Ŭ�������� �ش� �ż��带 �������̵� �� �� ����.
		 
		 final ������ ���� ������ �� ����
		 final �ż���� �������̵��� �Ҽ�����
		 final Ŭ������ ����� ������ ����.
		 
		 
		 */

	}

}
class AA{
	void abc() {}
		final void bcd() {}
}

class BB extends AA{
	void abc() {//�θ��� abc()�ż��带 �������̵�
	}
//	void bcd() {}//���� �߻�/�������̵��� �θ��� �޼��忡 final�� �ɷ��־ �Ұ���.
}

final class AAA{
	
}
//class BBB extends AAA{//final �� ����� Ŭ������ ����Ҽ�����.	
//}

