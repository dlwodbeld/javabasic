package pm;

public class Exam7_1 {

	public static void main(String[] args) {
		// ������ �����ε� Constructor Overloading
		// �������� ���(����, �ڷ���)�� ���� ��ü�� �����ϴ� ����� �����ȴ�.
		
		K k1 = new K();
		K k2 = new K(3);
		K k3 = new K(3,5);
		

	}

}

class K{
	K(){//�����ڴ� Ŭ������� ����,�����̾���.
		System.out.println("ù��° ������");
	}
	K(int a){//�����ڴ� Ŭ������� ����,�����̾���.
		System.out.println("�ι�° ������");
	}
	K(int a,int b){//�����ڴ� Ŭ������� ����,�����̾���.
		System.out.println("����° ������");
	}
}