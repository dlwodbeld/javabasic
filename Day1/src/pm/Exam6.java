package pm;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char value1 = 'A';
		char value2 = '��';
		char value3 = '3';
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println();
		
		// ���ڷ� ���� ����
		char value4 = 65;
		System.out.println(value4);
		System.out.println();
		
		// �����ڵ�� ���� ����
		
		char value5 = '\u0065';
		System.out.println(value5);
		System.out.println();
		//����ȯ type casting
		// Boolean �� ������ �⺻ �ڷ����� ���� ���� ��ȯ�� �� �ִ�.
		// Ÿ�� ��ȯ�� ������ ���� ������ �� �ִ� ���� ������ ������ �޶����Ƿ� ���� ��ȭ�� �� �ִ�.
		// Ÿ�� ��ȯ���� �ڹٰ� �ڵ����� �����ϴ� '�ڵ�Ÿ�Ժ�ȯ'�� �����ڰ� ���� ��ȯ�� �����ؾ��ϴ� '����Ÿ�Ժ�ȯ'�� �ִ�.
		//ũ�Ⱑ ���� �ڷ����� ū �ڷ����� �����Ҷ��� �ս��� �߻������ʴ´�. ���� Ÿ�Ժ�ȯ�� �����ڰ� ���� �ʾƵ� ��ȯ�ȴ�(�� �ɽ��� up casting)
		
		int value11 = (int)5.3;
		System.out.println(value11);
		
		float value21 = 3;	//int -> float ��ĳ����
		long value22 = 5;	// int -> long ��ĳ����
		
		//int value27 = 3.5;	//double -> int	�ٿ�ĳ����(x)
		int value28 = (int)3.5;
		//float value29 = 7.5;	//�Ǽ��� �⺻�� double ���̴�.
		float value30 = (float)7.5;
		
		float value31 = 2.45321341F;
		
		/*
		 * �ڷ������� ����
		 * Boolean�� ������ �⺻ �ڷ����� ���� ������ �����ϴ�.
		 * �̶�, ��� ������ ���� �ڷ��� ������ �����ϰ� ������ ���� ���� �ڷ����� ���´�.
		 * �� int���� ���� �ڷ��� ���� �������� int�� ���´�.
		 * ������� byte+byte,short+short,byte+short
		 * 
		 */

		int value41 = 3+5;
		int value42 = 8/5;
		float value43 = 3.0f + 5.0f;
		double value44 = 8.0/5.0;
		
		byte data1 = 3;
		byte data2 = 5;
		//byte data3 = data1+data2;	����� int�� ���´�.
		int data4 = data1 + data2;
		
		//int value45 = 5 + 3.5; // ����� double�̹Ƿ� ����
		double value46 = 5 + 3.5;
		
		double value48 = 5/2.0;
		byte data13 = 3;
		short data14 = 5;
		int value49 = data13 + data14;
		
		double value50 = data13 + data14;
		
		System.out.println((int)3.5+4.5);
	}

}
