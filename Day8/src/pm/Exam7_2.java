package pm;

public class Exam7_2 {

	public static void main(String[] args) {
		// ��� �������� ù�ٿ��� �ݵ�� this() �Ǵ� super()�� �־���Ѵ�.
		//������ �ڵ����� �ڹٰ� �����Ѵ�.
		//�� ��� ���迡 ������ �����ڸ� ȣ���ϸ� �׻� �θ� Ŭ������ �����ڰ�
		//ȣ��ȴٴ� ���̴�. �ڽ� Ŭ������ ��ü�� �����ҋ��� �θ� Ŭ������
		//��ü�� ���������.
		
		

	}

}

class V{
	V(){
		System.out.println("A������");
	}
}
class X extends V{
	X(){
		//super();
		System.out.println("X������");
	}
}

