package pm;

public class Exam6 {

	public static void main(String[] args) {
		// �������� �ż��� 
		// �ż��� �����ε��� �Էº����� ���� Ȥ�� �ڷ����� ���� ���еȴ�.
		//���� �Էº����� 1~100������ ��Ư�� ������ �Է� �����ԵǸ�
		// �ż���� 100���� �������Ѵ�.
		//�̰��� �����ϰ� �Ҽ��ִ� ����� �ٷ� �������� �Ű������� ����ϴ� �޼����̴�.
		
		
//		sum(1);
//		sum(1,2);
//		sum(1,2,3);
		method1(1,2);
		method1(1,2,3);
		method1();
		
		method2("�ȳ�","�氡");
		method2("��ť","�踮","����");
		method2();
	}

//	public static void sum(int a) {
//		
//	}
//	public static void sum(int a,int b) {
//		
//	}
//	public static void sum(int a,int b,int c) {
//		
//	}
	
	public static void method1(int...values){
		System.out.println("���� : " + values.length);
		
		for(int each: values) {
			System.out.print(each + " ");
		}
		System.out.println();
	}
	public static void method2(String...values){
		System.out.println("���� : " + values.length);
		
		for(String each: values) {
			System.out.print(each + " ");
		}
		System.out.println();
	}

	
}
