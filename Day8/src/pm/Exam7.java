package pm;

public class Exam7 {

	public static void main(String[] args) {
		// super Ű���� super() �ż���
		
		/*
		 this Ű����� this()�޼���� Ŭ���� ������ Ư�� ���� ���(������, ��ü)ȣ���� �� ����ߴ�.
		 �����ϸ� �ڵ����� �߰��� �ֱ⵵ �ߴ�.
		 
		 �̿ʹ޸� super �� ��� �θ� Ŭ������ �����ִ�. ���� ��Ӱ��迡���� ����� �ϰ� �ȴ�.
		 
		 
		 */
		
//		J j = new J();
//		j.bcd();
		
		H j = new J();
		j.abc();

	}

}

class H{
	void abc() {
		System.out.println("HŬ������ abc()");
	}
}

class J extends H{
	void abc() {
		System.out.println("JŬ������ abc()");
	}
	void bcd() {
		//abc();
		super.abc();
	}
}

