package pm;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 ���� ������ modifier Ŭ����, �ʵ�, �ż���, �����ڵ�� Ư¡�� �ο��ϴ� ���� ����̴�.
		 �����餷�� �ٸ� ��Ű�Ͽ����� Ŭ������ ����� �� �ֵ��� �ϱ����ؼ��� public Ŭ������ ������ �ߴ�.
		 
		 �ʹ��� �����ڿ��� public > protected > ()default > private
		 4���� ������ ���� �����ڸ� ����� �� �ִ�. �ƹ��͵� �������� ������ default�� �ڵ�����
		 ����ȴ�.
		 
		 public ���� ��Ű���� ��� Ŭ���� �ٸ� ��Ű���� ��� Ŭ�������� ��밡��
		 
		 public		���� ��Ű���� ��� Ŭ����	�ٸ���Ű���� ��� Ŭ�������� ��밡��
		 protected	���� ��Ű���� ��� Ŭ����	�ٸ���Ű���� �ڽ� Ŭ�������� ��밡��
		 default	���� ��Ű���� ��� Ŭ���������� ��� ����
		 private	���� Ŭ���������� ��� ����
		
		 static ������
		 Ŭ���� �ɹ����� ����ϴ� �������̴�. ��ü�� ������� �ʰ� 'Ŭ������.�ɹ���'
		 ���� �����Ͽ� ����� �� �ִ�. ���� ��ü�� �����ϰ� ����Ҽ��� �ִ�.
		 
		  
		  
		  
		 */
		
//		B b = new B();
//		System.out.println(b.m);//��ü�� ����
//		System.out.println(b.n);//��ü�� ����
//		System.out.println(B.n);//class�� ���� ����
	
	B b1 = new B();
	B b2 = new B();
	
	b1.m = 5;
	b2.m = 6; // ��ü���� ������ ������ �����Ѵ�.
	
	System.out.println(b1.m);
	System.out.println(b2.m);
	
	
	B.n = 7;
	
	System.out.println(b1.m);
	System.out.println(b2.n);
	
	
	
	
	
	}

}

class A{

	private int a;
	private String b;
	
	public void abc() {
		a = 5;
		
		
	}
}

class B{
	int m = 3;	//��ü�� ������ �Ŀ��� ��� ����
	static int n = 5;	//��ü ���� ���̵� ��� ����
	
}



