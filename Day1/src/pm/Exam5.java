package pm;

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1 = 3;
		{
			int value2 = 5;
			System.out.println(value1);
			System.out.println(value2);
		}		//	���� value2 �� ������� ����

		System.out.println(value1);
		//System.out.println(value2);  //�ȿ��� ������ ������ �ۿ� ���ͼ� ������ �ȵȴ�.
		

		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
		
	}//  ���� value1 �� ������� ����

}
/*
 * �ڹٿ��� 8���� �⺻ �ڷ����� �ְ� �������� ��� �����ڷ����̶�� �����ִ�.
 * ���� �ڷ����� �����ڰ� ���� ������ ���� �־� �������� ���Ѵ��̴�.
 * 
 * �� 	(true/false)
 * ����	int byte short long
 * �Ǽ�	double float
 * ����	char
 * 
 * 
 * �⺻ �ڷ����� �޸𸮿� �������� ������ ���� ���������� �����Ѵ�.
 * �ݸ� ���� �ڷ����� ���� �����Ͱ��� �޸𸮿� �����ϰ� ���� �������� ���� �������� ����� �޸��� ��ġ���� ����ȴ�.
 * 
 * Boolean	1byte	true/false
 * int		4byte	-2^31~2^31-1
 * double	8byte	?
 * char		2byte	
 */


