package pm;

public class Exam7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 �θ� Ŭ������ init() �ż��尡 �ְ� �� �ż��忡 500���� �ڵ尡 �ֵ�.
		 �׷��� �ڽ� Ŭ������ �� �θ� Ŭ������ ��ɿ��ٰ� � 1�ٸ� �߰��ϰ������
		 super�� ���ٸ� �ڽ� Ŭ�������� �θ� Ŭ������ �ż��忡 �ִ� 500�ٰ� 1���� ��� �ۼ��ؾ��Ѵ�.
		 �׷��� super�� ����ϸ� �ڽ� Ŭ������ �ż��忡�� �θ� Ŭ������ �ż��带 ȣ���ϰ� �߰��ڵ� 1�ٸ� �ۼ��ϸ� �ȴ�.
		 
		 */

	}

}
class U{
	void init() {
		//��¼����¼�� 500��
	}
}

class I extends U{
	void init() {
	//class U���ִ� 500������ �Ǵ� �ڵ带 �״�� ��� ����
	//ȭ�� ��� �ż���
}
}

class K extends U{
	void init() {
		super.init();
		//ȭ�� ��� �޼���
	}
}




