package pm;

public class Exam7_4 {

	public static void main(String[] args) {
		// this() �ż���(this Ű����� ���� �ٸ�)
		// this() �޼���� this Ű����� ����ϰ� �������� �ǹ̰� ������ �ٸ���.
		// this() �ż���� �ڽ��� ���� Ŭ���� ������ �ٸ� �����ڸ� ȣ���� �� ����Ѵ�.
		//1. �������� ���ο����� ���
		//2. �������� ù�� ��ġ�Ѵ�.
		// �� ������ �ϳ��� �������� ������ ������ �߻��ȴ�.
		
		T t1 = new T();
				System.out.println();
		T t2 = new T(3); //������ �����ε�
		

	}

}

class T {
	T(){
		System.out.println("ù��° ������");	
	}
	
	T(int a){
		this(); //�������� ���ο��� ù��° 
		System.out.println("�ι�° ������");	
	}

}
